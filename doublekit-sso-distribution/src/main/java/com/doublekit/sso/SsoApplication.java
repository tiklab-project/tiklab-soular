package com.doublekit.sso;

import com.doublekit.sso.annotation.EnableSsoServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * TccCommonApplication
 */
@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@EnableSsoServer
public class SsoApplication {

    public static final Logger logger = LoggerFactory.getLogger(SsoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SsoApplication.class, args);
    }

}

