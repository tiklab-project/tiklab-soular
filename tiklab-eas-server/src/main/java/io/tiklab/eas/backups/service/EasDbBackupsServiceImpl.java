package io.tiklab.eas.backups.service;

import com.alibaba.fastjson.JSONObject;
import io.tiklab.core.exception.ApplicationException;
import io.tiklab.core.exception.SystemException;
import io.tiklab.dal.jpa.annotation.Id;
import io.tiklab.eas.backups.model.EasBackups;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EasDbBackupsServiceImpl implements EasDbBackupsService {

    private final static Logger logger = LoggerFactory.getLogger(EasDbBackupsServiceImpl.class);

    // 备份脚本
    private static final String shScript = "backups.sh";

    // 结果文件
    private static final String logResult = "result.txt";

    // 默认值
    private static final String defaultValues = "default";

    // 执行信息
    private static final Map<String,String> execLogMap = new HashMap<>();

    // 是否在执行
    private static final Map<String,String> execMap = new HashMap<>();


    public final ExecutorService executorService = Executors.newCachedThreadPool();

    @Value("${jdbc.url}")
    String jdbcUrl;

    @Value("${jdbc.username}")
    String username;

    @Value("${jdbc.password}")
    String password;

    @Value("${eas.backups.dir}")
    String backupsDir;

    @Value("${eas.backups.time}")
    String scheduled;

    @Override
    public void execBackups(){

        if (Objects.isNull(execMap.get(defaultValues))){
            execMap.put(defaultValues,defaultValues);
        }else {
            throw new ApplicationException(10000,"当前系统正在备份中，请勿多次点击");
        }

        execLogMap.remove(defaultValues);

        executorService.submit(() -> {

            Map<String,Object> map = new HashMap<>();
            map.put("begin",System.currentTimeMillis());
            map.put("state","run");

            writeLog(defaultValues,date(4)+"开始备份......");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 脚本位置
            Map<String, String> dirMap = findScriptDir();

            // 获取是否开启定时备份
            String logDir = dirMap.get("logDir");

            String string = readFile(logDir);
            if (!Objects.isNull(string)){
                JSONObject jsonObject = JSONObject.parseObject(string);
                map.put("scheduled",jsonObject.getBoolean("scheduled"));
            }else {
                map.put("scheduled",false);
            }
            logger.info("logDir文件:{}",logDir);

            new File(logDir).delete();

            Map<String, String> jdbcUrlMap = findJdbcUrl();

            StringBuilder parameter = new StringBuilder();
            parameter.append(" ");
            parameter.append( " -d ").append(dirMap.get("dir")).append(" "); //脚本地址
            parameter.append( " -t ").append("backups").append(" "); //类型为备份
            parameter.append( " -u ").append(username).append(" "); //用户名
            parameter.append( " -p ").append(password).append(" "); //密码
            parameter.append( " -i ").append(jdbcUrlMap.get("ip")).append(" "); // 服务器ip
            parameter.append( " -P ").append(jdbcUrlMap.get("port")).append(" "); // 服务器端口
            parameter.append( " -B ").append(dirMap.get("backupsDir")).append(" "); // 备份文件存放地址
            parameter.append( " -D ").append(jdbcUrlMap.get("db")).append(" "); // 连接的数据库名称
            parameter.append( " -s ").append(jdbcUrlMap.get("schema")).append(" "); // 连接的数据库模式名称

            Runtime rt = Runtime.getRuntime();
            try {
                String order = "sh " + dirMap.get("scriptDir") + parameter;
                logger.info("执行备份命令：{}",order);
                Process process = rt.exec(order);
                readExecResult(process,defaultValues);
            } catch (Exception e) {
                map.put("state","error");
                execEnd(defaultValues,map);
                logger.error("备份失败：{}",e.getMessage());
                writeLog(defaultValues,date(4)+"备份失败！");
                throw new SystemException(e);
            }
            map.put("state","success");
            writeLog(defaultValues,date(4)+"备份成功！");
            execEnd(defaultValues,map);
        });
    }

    @Override
    public EasBackups findBackupsResult(){
        EasBackups easBackups = new EasBackups();

        Map<String, String> dirMap = findScriptDir();
        String logDir = dirMap.get("logDir");
        String backupsDir = dirMap.get("backupsDir");

        //备份路径
        easBackups.setDir(new File(backupsDir).getParent());
        String string = readFile(logDir);
        if (Objects.isNull(string)){
            easBackups.setScheduled(false);
            easBackups.setTime("无");
            easBackups.setRunTime("0");
            easBackups.setRunState("无");
            return easBackups;
        }

        JSONObject jsonObject = JSONObject.parseObject(string);

        // 运行状态
        if (Objects.isNull(execMap.get(defaultValues))){
            String state = jsonObject.getString("state");
            easBackups.setRunState(state);
        }else {
            easBackups.setRunState("run");
        }

        //备份路径
        easBackups.setPath(new File(backupsDir).getParent());

        if (!Objects.isNull(jsonObject.getLong("begin"))){
            Long begin = jsonObject.getLong("begin");
            Long end = jsonObject.getLong("end");

            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(begin));
            easBackups.setTime(format);
            easBackups.setRunTime(String.valueOf(end-begin));
        }else {
            easBackups.setTime("无");
            easBackups.setRunTime("0");
        }
        easBackups.setScheduled(false);
        if (!Objects.isNull(jsonObject.getBoolean("scheduled"))){
            easBackups.setScheduled(jsonObject.getBoolean("scheduled"));
        }

        if (!Objects.isNull(jsonObject.getString("log"))){
            easBackups.setLog(jsonObject.getString("log"));
        }

        if (easBackups.getRunState().equals("run")){
            easBackups.setLog(execLogMap.get(defaultValues));
        }

        return easBackups;
    }

    @Override
    public void updateBackups(Boolean state){
        Map<String, String> dirMap = findScriptDir();
        String logDir = dirMap.get("logDir");
        File file = new File(logDir);
        if (!file.exists()){
            file.mkdirs();
        }

        Map<String,Object> map = new HashMap<>();
        map.put("state",state);
        // 写入文件
        JSONObject json = new JSONObject(map);
        try {
            logWriteFile(logDir, String.valueOf(json));
        }catch (Exception e){
            String message = e.getMessage();
            logger.error("更新定时状态失败:{}",message);
        }
    }

    /**
     * 获取脚本地址
     * @return 脚本地址
     */
    public Map<String,String> findScriptDir(){

        Map<String,String> map = new HashMap<>();
        String fileSeparator = System.getProperty("file.separator");

        // 获取启动文件地址
        String appHome = System.getProperty("APP_HOME");
        if (Objects.isNull(appHome)){
            throw new SystemException("Failed to obtain application location!");
        }

        //判断文件夹是否存在
        File file = new File(appHome);
        if (!file.exists()){
            throw new SystemException("application address not found!");
        }

        String parentPath = file.getParentFile().getParent();
        logger.info("appHome："+appHome);
        logger.info("parentPath："+parentPath);

        // 获取脚本信息
        String dir = parentPath + fileSeparator  + "backups" + fileSeparator + shScript;
        File dirFile = new File(dir);
        if (!dirFile.exists()){
            throw new SystemException("Failed to obtain script information!");
        }

        // 创建日志文件夹
        String string = parentPath + fileSeparator + "backups";
        String logDir = string + fileSeparator + logResult;
        File logDirFile = new File(string);
        if (!logDirFile.exists()){
            logDirFile.mkdirs();
        }

        // 创建备份文件夹
        String format = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
        String backups = backupsDir + fileSeparator
                + "backups" + fileSeparator;
        File file1 = new File(backups);
        if (file1.exists()){
            file1.mkdirs();
        }
        String backupsDirs = backups + "eas_backups_"+format+".sql";

        map.put("scriptDir",dir);
        map.put("dir",parentPath);
        map.put("logDir",logDir);
        map.put("backupsDir",backupsDirs);

        return map;
    }

    /**
     * 解析jdbcUrl
     * @return 解析后信息
     */
    public Map<String,String> findJdbcUrl(){

        Map<String,String> map = new HashMap<>();

        Pattern pattern = Pattern.compile("jdbc:postgresql://(.*):(.*)/(.*)\\?");
        Matcher matcher = pattern.matcher(jdbcUrl);

        if (matcher.find()) {
            String ip = matcher.group(1);
            String port = matcher.group(2);
            String database = matcher.group(3);

            map.put("ip",ip);
            map.put("port",port);
            map.put("db",database);

            // 从参数中获取currentSchema
            String schema;
            if(jdbcUrl.contains("currentSchema=")) {
                schema = jdbcUrl.substring(jdbcUrl.indexOf("currentSchema=") + "currentSchema=".length());
                schema = schema.substring(0, schema.indexOf("&"));
            }else {
                schema = "public";
            }
            map.put("schema",schema);
        }
        return map;
    }

    /**
     * 读取执行结果
     * @param process 执行实例
     */
    public void readExecResult(Process process,String values) {

        //转换流
        InputStream inputStream = process.getInputStream();
        InputStream errInputStream = process.getErrorStream();

        InputStreamReader inputStreamReader ;
        BufferedReader bufferedReader ;
        if (inputStream == null){
            inputStreamReader = encode(errInputStream);
        }else {
            inputStreamReader = encode(inputStream);
        }

        String s;
        bufferedReader = new BufferedReader(inputStreamReader);

        StringBuilder builder = new StringBuilder();

        try {

            //读取执行信息
            while ((s = bufferedReader.readLine()) != null) {
                builder.append(date(4)).append(s).append("\n");
            }

            //读取err执行信息
            inputStreamReader = encode(errInputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            while ((s = bufferedReader.readLine()) != null) {
                builder.append(date(4)).append(s).append("\n");
            }

            writeLog(values, String.valueOf(builder));

            // 关闭
            inputStreamReader.close();
            bufferedReader.close();

        } catch (Exception e){
            logger.error("读取执行信息失败！{}",e.getMessage());
            writeLog(values, "读取执行信息失败！");
            throw new SystemException(e);
        }
        process.destroy();
    }

    /**
     * 字符串写入文件
     * @param str 字符串
     * @param path 文件地址
     * @throws ApplicationException 写入失败
     */
    public static void logWriteFile(String path,String str) {
        try (FileWriter writer = new FileWriter(path, StandardCharsets.UTF_8,true)) {
            writer.write(str);
            writer.flush();
        } catch (Exception e) {
            throw new ApplicationException("文件写入失败,错误信息：" + e.getMessage());
        }
    }

    /**
     * 读取文件内容
     * @param fileAddress 文件地址
     * @return 内容
     */
    public String readFile(String fileAddress) {
        if (!new File(fileAddress).exists()){
            return null;
        }

        StringBuilder s = new StringBuilder();
        try {
            Path path = Paths.get(fileAddress);
            List<String> lines ;
            lines = Files.readAllLines(path,StandardCharsets.UTF_8);
            for (String line : lines) {
                s.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new ApplicationException("读取文件信息失败" + e.getMessage());
        }
        return s.toString();
    }

    /**
     * 格式化输出流
     * @param inputStream 流  GBK,US-ASCII,ISO-8859-1,ISO-8859-1,UTF-16BE ,UTF-16LE, UTF-16,UTF-8
     * @return 输出流
     */
    public InputStreamReader encode(InputStream inputStream){
        if (findSystemType() == 1){
            return new InputStreamReader(inputStream, Charset.forName("GBK"));
        }else {
            return new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        }
    }

    /**
     * 系统类型
     * @return 1.windows 2.其他
     */
    public int findSystemType(){
        String property = System.getProperty("os.name");
        String[] s1 = property.split(" ");
        if (s1[0].equals("Windows")){
            return 1;
        }else {
            return 2;
        }
    }

    /**
     * 返回系统时间
     * @param type 时间类型 1.(yyyy-MM-dd HH:mm:ss) 2.(yyyy-MM-dd) 3.(HH:mm:ss) 4.([format]) 5.(HH:mm)
     * @return 时间
     */
    public String date(int type){
        switch (type) {
            case 1 -> {
                return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
            }
            case 4 -> {
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                return "[" + format + "]" + "  ";
            }
            default -> {
                return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            }
        }
    }

    /**
     * 写入日志
     * @param key key
     * @param values 日志内容
     */
    public void writeLog(String key,String values){
        String string = execLogMap.get(key);
        if (Objects.isNull(string)){
            execLogMap.put(key,values);
        } else {
            execLogMap.put(key,string +"\n" + values);
        }
    }

    /**
     * 执行结束
     * @param key key
     * @param map 执行信息
     */
    public void execEnd(String key,Map<String,Object> map){

        map.put("end",System.currentTimeMillis());

        String execLog = execLogMap.get(key);

        Map<String, String> dirMap = findScriptDir();
        map.put("log", execLog);

        // 写入文件
        JSONObject json = new JSONObject(map);

        String logDir = dirMap.get("logDir");

        logger.info("写入文件地址：{}",logDir);
        logger.info("写入文件内容：{}",json);

        try {
            logWriteFile(logDir, String.valueOf(json));
        }catch (Exception e){
            String message = e.getMessage();
            logger.error("message:{}",message);
            execMap.remove(defaultValues,defaultValues);
        }
        execMap.remove(defaultValues,defaultValues);
    }



}
