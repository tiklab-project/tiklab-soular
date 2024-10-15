package io.tiklab.soular.starter.annotation;

import io.tiklab.soular.starter.config.SoularAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({SoularAutoConfiguration.class})
public @interface EnableSoular {
}
