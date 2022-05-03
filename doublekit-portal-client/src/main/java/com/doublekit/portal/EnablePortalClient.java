package com.doublekit.portal;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({PortalClientAutoConfiguration.class})
public @interface EnablePortalClient {
}
