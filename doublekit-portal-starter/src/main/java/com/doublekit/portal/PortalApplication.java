package com.doublekit.portal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * PortalApplication
 */
@SpringBootApplication
@EnablePortal
@PropertySource(value = "classpath:application-${env:dev}.properties")
public class PortalApplication {

    public static final Logger logger = LoggerFactory.getLogger(PortalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

}

