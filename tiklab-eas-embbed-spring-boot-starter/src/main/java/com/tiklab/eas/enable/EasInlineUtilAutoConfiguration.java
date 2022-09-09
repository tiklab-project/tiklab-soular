package com.tiklab.eas.enable;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(EasInlineCondition.class)
@Configuration
@ComponentScan({"com.tiklab.eas.enable"})
public class EasInlineUtilAutoConfiguration {
}
