package io.tiklab.eas;

import io.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SQL(modules = {"eas","easDefaultData"}, order = 100)
@ComponentScan({"io.tiklab.eas"})
public class EasServerAutoConfiguration {
}
