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

    public Process startShellEasProcess(HashMap<String, Object> easCfg) throws IOException,NullPointerException {
        Runtime runtime=Runtime.getRuntime();
        String property = System.getProperty("os.name");
        Process process;
        String[] s = property.split(" ");
        // 获取主工程启动文件的目录
        String rootPath = System.getProperty("user.dir");
        String easPath = "/tiklab-eas/bin";

        String path =new File(rootPath).getParent()+easPath;

        int port = (int) easCfg.get("serverPort");

        boolean embbedEnable = (boolean) easCfg.get("embbedEnable");

        int mysqlServerPort = (int) easCfg.get("mysqlServerPort");
        String jdbcUrl = (String) easCfg.get("jdbcUrl");
        String jdbcDriverClassName = (String) easCfg.get("jdbcDriverClassName");
        String jdbcUsername = (String) easCfg.get("jdbcUsername");
        String jdbcPassword = (String) easCfg.get("jdbcPassword");

        String type; //type 1:独立部署，2：嵌入其他项目运行
        if (embbedEnable) {
            type = "2";
        } else {
            type ="1";
        }
        String newJdbcUrl = jdbcUrl.replaceAll("(:)\\d{1,5}", ":"+mysqlServerPort);


        String shString ="sh" + " "+path+ "/startup.sh" +" \""+ newJdbcUrl +"\" " + jdbcUsername + " " +  jdbcPassword +  " " + type +" " + port +" \"" + jdbcDriverClassName+"\"";
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

}

