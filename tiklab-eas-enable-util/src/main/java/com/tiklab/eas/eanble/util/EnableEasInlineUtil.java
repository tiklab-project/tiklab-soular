package com.tiklab.eas.eanble.util;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EasInlineUtilAutoConfiguration.class})
public @interface EnableEasInlineUtil {
}
