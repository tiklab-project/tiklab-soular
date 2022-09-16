package net.tiklab.eas.boot;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({EasAutoConfiguration.class})
public @interface EnableEas {
}
