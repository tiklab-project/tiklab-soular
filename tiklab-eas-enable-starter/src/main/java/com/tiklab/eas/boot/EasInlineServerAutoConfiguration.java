package com.tiklab.eas.boot;

import com.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@SQL(modules = {"portal","easDefaultData"})
@ComponentScan({"com.tiklab.eas.boot"})
public class EasInlineServerAutoConfiguration {
}
