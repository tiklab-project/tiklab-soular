package com.doublekit.portal;

import com.doublekit.portal.annotation.EnablePortalServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * PortalApplication
 */
@SpringBootApplication
@PropertySource(value = "classpath:application.properties")
@EnablePortalServer
public class PortalApplication {

    public static final Logger logger = LoggerFactory.getLogger(PortalApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
    }

}

