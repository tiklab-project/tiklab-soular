package com.tiklab.eas.eanble.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(EasInlineCondition.class)
@Configuration
@ComponentScan({"com.tiklab.eas.eanble.util"})
public class EasInlineUtilAutoConfiguration {
}
