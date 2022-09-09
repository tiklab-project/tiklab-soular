package com.tiklab.eas.enable;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/**
 * PortalServerAutoConfiguration
 */
//@Conditional(EasInlineCondition.class)
@Component
public class EasEmbedUtil {

    private static Logger logger = LoggerFactory.getLogger(EasEmbedUtil.class);

    public Process startShellEasProcess() throws IOException,NullPointerException {

        HashMap<String, Object> easCfg = EnableEasProperty.map;

        Runtime runtime=Runtime.getRuntime();
        String property = System.getProperty("os.name");
        Process process;
        String[] s = property.split(" ");
        // 获取主工程启动文件的目录
        String rootPath = System.getProperty("user.dir");
        String easPath = "/tiklab-eas/bin";

        String path =new File(rootPath).getParent()+easPath;

        int port = (int) easCfg.get("serverPort");
        String jdbcUrl = (String) easCfg.get("jdbcUrl");
        String jdbcDriverClassName = (String) easCfg.get("jdbcDriverClassName");
        String jdbcUsername = (String) easCfg.get("jdbcUsername");
        String jdbcPassword = (String) easCfg.get("jdbcPassword");
        // webcfg
        String webAddress = (String) easCfg.get("webAddress");
        String address = (String) easCfg.get("address");
        // sql
        String mysqlName = (String) easCfg.get("mysqlName");


//        String newJdbcUrlPort = jdbcUrl.replaceAll("(:)\\d{1,5}", ":"+mysqlServerPort);

        String newJdbcUrl = jdbcUrl.replace(mysqlName, "tiklab_eas");



        logger.info("sh 脚本 newJdbcUrl：" + newJdbcUrl);

       String d = "--server.port="+port +" "+
               "--jdbc.url="+"\""+ newJdbcUrl +"\"" +" "+
               "--jdbc.username="+jdbcUsername+" "+
               "--jdbc.password="+jdbcPassword +  " "+
               "--jdbc.driverClassName="+"\""+jdbcDriverClassName+"\""+" "+
               "--eas.mysql.name="+mysqlName + " " +
               "--eas.server.port="+port + " " +
               "--eas.jdbc.url="+"\""+newJdbcUrl+"\"" + " " +
               "--eas.jdbc.driverClassName="+"\""+jdbcDriverClassName+"\"" + " " +
               "--eas.jdbc.username="+jdbcUsername + " " +
               "--eas.jdbc.password="+jdbcPassword + " " +
               "--eas.web.address="+"\""+webAddress+"\"" + " " +
               "--eas.address="+"\""+address+"\"" +"" + " "
               ;

        Boolean isLocal = (boolean) easCfg.get("local");

        if (isLocal) {
            path = easCfg.get("appHome") + "/temp" + easPath;
            String java_home = System.getProperty("java.home");
            d += " JAVA_HOME="+java_home;
        }

        String shString = "sh" + " "+path+ "/startup.sh" + " " + d;
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

