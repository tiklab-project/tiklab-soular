package com.tiklab.eas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * PortalApplication
 */
@SpringBootApplication
@EnableEas
@PropertySource(value = "classpath:application-eas-${env:dev}.properties")
public class EasApplication {

    public static final Logger logger = LoggerFactory.getLogger(EasApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EasApplication.class, args);
    }

}

