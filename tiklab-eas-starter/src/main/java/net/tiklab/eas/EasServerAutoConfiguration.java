package net.tiklab.eas;

import net.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SQL(modules = {"easDefaultData", "matflow", "postin"}, order = 100)
@ComponentScan({"net.tiklab.eas"})
public class EasServerAutoConfiguration {
}
