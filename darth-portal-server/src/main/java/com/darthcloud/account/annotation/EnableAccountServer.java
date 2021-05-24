package com.darthcloud.account.annotation;

import com.darthcloud.account.AccountServerAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({AccountServerAutoConfiguration.class})
public @interface EnableAccountServer {
}
