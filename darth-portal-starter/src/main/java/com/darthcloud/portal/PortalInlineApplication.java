package com.darthcloud.portal;

import com.darthcloud.portal.annotation.EnablePortalServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * TccCommonApplication
 */
@SpringBootApplication
@PropertySource(value = "classpath:application-${env:local}.properties")
@EnablePortalServer
public class PortalInlineApplication {

    public static final Logger logger = LoggerFactory.getLogger(PortalInlineApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PortalInlineApplication.class, args);
    }

}

