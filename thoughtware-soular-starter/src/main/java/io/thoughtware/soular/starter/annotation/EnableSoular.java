package io.thoughtware.soular.starter.annotation;

import io.thoughtware.soular.starter.config.SoularAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({SoularAutoConfiguration.class})
public @interface EnableSoular {
}
