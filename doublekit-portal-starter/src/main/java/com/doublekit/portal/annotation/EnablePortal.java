package com.doublekit.portal.annotation;

import com.doublekit.portal.config.PortalAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({PortalAutoConfiguration.class})
public @interface EnablePortal {
}
