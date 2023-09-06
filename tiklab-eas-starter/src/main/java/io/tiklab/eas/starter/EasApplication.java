package io.tiklab.eas.starter;

import io.tiklab.core.property.PropertyAndYamlSourceFactory;
import io.tiklab.eas.starter.annotation.EnableEas;
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
public class EasApplication {

    public static final Logger logger = LoggerFactory.getLogger(EasApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EasApplication.class, args);
    }

}

