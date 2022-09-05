package com.tiklab.eas.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EasInlineAutoConfiguration.class})
public @interface EnableEasInline {
}
