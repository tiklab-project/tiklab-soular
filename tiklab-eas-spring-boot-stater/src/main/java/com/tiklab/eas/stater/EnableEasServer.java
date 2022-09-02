package com.tiklab.eas.stater;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EasServerAutoConfiguration.class})
public @interface EnableEasServer {
}
