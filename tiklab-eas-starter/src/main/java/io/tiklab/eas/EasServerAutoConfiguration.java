package io.tiklab.eas;

import io.tiklab.dsm.model.SQL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"io.tiklab.eas","io.tiklab.eas.updatesql",})
public class EasServerAutoConfiguration {
    @Bean
    SQL initSQL(){
        return new SQL(new String[] {
                "eas",
                "easDefaultData"
        }, 100);
    }
}
