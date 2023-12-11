package io.thoughtware.darth.starter;

import io.thoughtware.darth.starter.annotation.EnableEas;
import io.thoughtware.core.property.PropertyAndYamlSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * PortalApplication
 * @author admin
 */
@SpringBootApplication
@EnableEas
@EnableScheduling
@PropertySource(value = "classpath:application.yaml", factory = PropertyAndYamlSourceFactory.class)
public class DarthApplication {

    public static final Logger logger = LoggerFactory.getLogger(DarthApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DarthApplication.class, args);
    }

}

