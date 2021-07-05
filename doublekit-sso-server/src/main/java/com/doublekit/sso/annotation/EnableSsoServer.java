package com.doublekit.sso.annotation;

import com.doublekit.sso.SsoServerAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({SsoServerAutoConfiguration.class})
public @interface EnableSsoServer {
}
