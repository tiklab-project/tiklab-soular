package com.tiklab.eas.enable;

import com.tiklab.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@SQL(modules = {"portal","easDefaultData"})
@ComponentScan({"com.tiklab.eas.enable"})
public class EasInlineServerAutoConfiguration {
}
