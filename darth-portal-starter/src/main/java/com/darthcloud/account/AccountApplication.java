package com.darthcloud.account;

import com.darthcloud.account.annotation.EnableAccountServer;
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
@EnableAccountServer
public class AccountApplication {

    public static final Logger logger = LoggerFactory.getLogger(AccountApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}

