package com.tiklab.eas.enable.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

//@Conditional(EasInlineCondition.class)
@Configuration
public class EnableEasConfig {
    private static Logger logger = LoggerFactory.getLogger(EnableEasConfig.class);


    @DependsOn("putEas")
    @Bean
    public void startEas() throws IOException {

        //获取环境变量
        EasEmbedUtil easEmbedUtil = new EasEmbedUtil();
        Process process = easEmbedUtil.startShellEasProcess();

        if (process == null){
            throw new IOException("EAS启动错误。");
        }

        //输出执行过程
        InputStreamReader inputStreamReader;
        if (getSystemType()==1){
            inputStreamReader = new InputStreamReader(process.getInputStream(), Charset.forName("GBK"));
        }else {
            inputStreamReader = new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8);
        }
        String s;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while ((s = bufferedReader.readLine()) != null) {
            logger.info("EAS ："+s);
        }
        inputStreamReader.close();
        bufferedReader.close();
        logger.info("EAS启动完成");
    }

    public int getSystemType(){
        String property = System.getProperty("os.name");
        String[] s1 = property.split(" ");
        if (s1[0].equals("Windows")){
            return 1;
        }else {
            return 2;
        }
    }
}
