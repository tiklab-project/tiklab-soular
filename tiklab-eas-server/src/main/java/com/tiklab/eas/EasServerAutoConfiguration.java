package com.tiklab.eas;

import com.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SQL(modules = {"portal","easDefaultData"})
@ComponentScan({"com.tiklab.eas"})
public class EasServerAutoConfiguration {
}
