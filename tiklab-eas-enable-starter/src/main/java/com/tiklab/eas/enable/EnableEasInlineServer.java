package com.tiklab.eas.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EasInlineServerAutoConfiguration.class})
public @interface EnableEasInlineServer {
}
