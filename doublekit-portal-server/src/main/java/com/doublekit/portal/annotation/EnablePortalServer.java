package com.doublekit.portal.annotation;

import com.doublekit.portal.config.PortalServerAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({PortalServerAutoConfiguration.class})
public @interface EnablePortalServer {
}
