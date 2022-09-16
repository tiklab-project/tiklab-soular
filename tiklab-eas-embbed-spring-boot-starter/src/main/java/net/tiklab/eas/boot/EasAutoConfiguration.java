package net.tiklab.eas.boot;

import net.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SQL(modules = {"portal","easDefaultData"})
@ComponentScan({"net.tiklab.eas.boot", "net.tiklab.eas"})
public class EasAutoConfiguration {
}
