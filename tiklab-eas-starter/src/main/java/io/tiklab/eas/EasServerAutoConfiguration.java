package io.tiklab.eas;

import net.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SQL(modules = {"eas","easDefaultData"}, order = 100)
@ComponentScan({"net.tiklab.eas"})
public class EasServerAutoConfiguration {
}
