package com.tiklab.eas.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(EasCondition.class)
@Configuration
@ComponentScan({"com.tiklab.eas.boot"})
public class EasAutoConfiguration {
}
