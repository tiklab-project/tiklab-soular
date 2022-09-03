package com.tiklab.eas.stater;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(EasInlineCondition.class)
@Configuration
@ComponentScan({"com.tiklab.eas.stater"})
public class EasInlintAutoConfiguration {



}
