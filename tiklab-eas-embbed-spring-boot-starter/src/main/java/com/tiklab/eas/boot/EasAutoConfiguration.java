package com.tiklab.eas.boot;

import com.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(EasCondition.class)
@Configuration
@SQL(modules = {"portal","easDefaultData"})
@ComponentScan({"com.tiklab.eas.boot", "com.tiklab.eas"})
public class EasAutoConfiguration {
}
