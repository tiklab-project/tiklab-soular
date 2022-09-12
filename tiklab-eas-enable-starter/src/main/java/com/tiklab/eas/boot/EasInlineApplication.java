package com.tiklab.eas.boot;

import com.tiklab.utils.property.PropertyAndYamlSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * PortalApplication
 */
@SpringBootApplication
@EnableEasInline
@PropertySource(value = "classpath:application.yaml", factory = PropertyAndYamlSourceFactory.class)
public class EasInlineApplication {

    public static final Logger logger = LoggerFactory.getLogger(EasInlineApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EasInlineApplication.class, args);
    }

}

