package com.tiklab.eas.eanble.util;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class EasInlineCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Environment environment = context.getEnvironment();
        boolean isReadInlineCfg = Boolean.parseBoolean(environment.getProperty("eas.embbed.enable"));
        return isReadInlineCfg;
    }
}
