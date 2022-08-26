package com.tiklab.eas.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import tiklab.mysql.MysqlConfig;

import java.io.IOException;

@Configuration
@PropertySource(value = "classpath:application-${env:dev}.properties")
public class EnableConfig {

    @Autowired
    Environment environment;

    private static final Logger logger = LoggerFactory.getLogger(EnableConfig.class);

    @Bean
    public void startMysql() throws IOException, InterruptedException {

        String mysqlType = environment.getProperty("mysql.type");

        if (mysqlType == null || !mysqlType.equals("local")){
            return;
        }

        MysqlConfig mysqlConfig = new MysqlConfig();
        String mysqlName = environment.getProperty("mysql.name");

        Process process = mysqlConfig.startMysql(mysqlName);

        //执行启动脚本错误
        if (process == null){
            throw new IOException("MYSQL启动错误。");
        }
        Thread.sleep(5000);
        logger.info("MYSQL启动完成");
    }
}

