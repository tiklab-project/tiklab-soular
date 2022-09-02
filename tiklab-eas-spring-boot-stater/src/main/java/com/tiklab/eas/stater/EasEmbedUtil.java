package com.tiklab.eas.stater;


import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * PortalServerAutoConfiguration
 */
@Component
public class EasEmbedUtil {
    private static Logger logger = LoggerFactory.getLogger(EasEmbedUtil.class);


    public Process startShellEasProcess(HashMap<String, String> easCfg) throws IOException,NullPointerException {
        Runtime runtime=Runtime.getRuntime();
        String property = System.getProperty("os.name");
        Process process;
        String[] s = property.split(" ");
        // 获取主工程启动文件的目录
        String rootPath = System.getProperty("user.dir");
        String easPath = "/tiklab-eas/bin";

        String path =new File(rootPath).getParent()+easPath;

        String port =  easCfg.get("serverPort");
        Boolean embbedEnable = Boolean.parseBoolean(easCfg.get("embbedEnable"));
        String address = easCfg.get("easCfg");
        String webAddress = easCfg.get("webAddress");

        Boolean mysqlEmbbedEnable = Boolean.parseBoolean(easCfg.get("mysqlEmbbedEnable"));
        String mysqlServerPort = easCfg.get("mysqlServerPort");
        String mysqlName = easCfg.get("mysqlName");
        String jdbcUrl = easCfg.get("jdbcUrl");
        String jdbcDriverClassName = easCfg.get("jdbcDriverClassName");
        String jdbcUsername = easCfg.get("jdbcUsername");
        String jdbcPassword = easCfg.get("jdbcPassword");

        String javaHome = easCfg.get("javaHome");

        String type; //type 1:独立部署，2：嵌入其他项目运行
        if (embbedEnable) {
            type = "2";
        } else {
            type ="1";
        }
        String PortRegEx = "^(:)\\d{1,5}$";
        String mysqlIp = jdbcUrl.replaceAll(PortRegEx,mysqlServerPort);

        String shString ="sh" + " "+path+ "/startup.sh" +" "+ jdbcUrl +" " + jdbcUsername + " " +  jdbcPassword + " " + javaHome+ " " + type +" " + port;
//        String shString = "sh" + " "+path+ "/startup.sh";
        logger.info("sh 脚本：" + shString);
        if (s[0].equals("Windows")){
            //执行命令  （有问题）
            return null;
//            process = runtime.exec("cmd.exe /c cd " + path + " &&" + shString);
        }else {
            //执行命令
            logger.info("sh 脚本 执行脚本 开始" );
            String[] cmd = new String[] { "/bin/sh", "-c", " source /etc/profile;" + shString};
            process = runtime.exec(cmd);
        }
        return process;
    }

//    public Process process(String path,String order,String sourceAddress) throws IOException,NullPointerException {
//
//        Runtime runtime=Runtime.getRuntime();
//        Process process;
//        String property = System.getProperty("os.name");
//
//        String[] s = property.split(" ");
//        if (s[0].equals("Windows")){
//            //执行命令
//            process = runtime.exec("cmd.exe /c cd " + path + " &&" + " " + order);
//        }else {
//            //执行命令
//            String[] cmd = new String[] { "/bin/sh", "-c", "cd "+path+";"+order };
//            process = runtime.exec(cmd);
//        }
//        return process;
//    }
}

