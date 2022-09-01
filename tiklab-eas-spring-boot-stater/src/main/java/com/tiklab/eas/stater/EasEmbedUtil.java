package com.tiklab.eas.stater;


import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * PortalServerAutoConfiguration
 */
@Component
public class EasEmbedUtil {
    private static Logger logger = LoggerFactory.getLogger(EasEmbedUtil.class);

    /**
     *
     * @param sqlUrl  mysql地址
     * @param sqlName  数据库名称
     * @param sqlPassword 数据库密码
     * @param javaHome java环境变量地址
     * @param type 1:独立部署，2：嵌入其他项目运行
     * @param port eas端口
     */
    public Process startShellEasProcess(String type, String sqlUrl, String sqlName, String sqlPassword, String javaHome, String port) throws IOException,NullPointerException {
        Runtime runtime=Runtime.getRuntime();
        String property = System.getProperty("os.name");
        Process process;
        String[] s = property.split(" ");
        // 获取主工程启动文件的目录
        String rootPath = System.getProperty("user.dir");
        String easPath = "/tiklab-eas/bin";

        String path =new File(rootPath).getParent()+easPath;


        String shString ="sh" + " "+path+ "/startup.sh" +" "+ sqlUrl +" " + sqlName + " " +  sqlPassword + " " + javaHome+ " " + type +" " + port;
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

