package io.thoughtware.soular.starter;

import io.thoughtware.soular.starter.annotation.EnableSoular;
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
@EnableSoular
@EnableScheduling
@PropertySource(value = "classpath:application.yaml", factory = PropertyAndYamlSourceFactory.class)
public class SoularApplication {

    public static final Logger logger = LoggerFactory.getLogger(SoularApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SoularApplication.class, args);
    }

}

