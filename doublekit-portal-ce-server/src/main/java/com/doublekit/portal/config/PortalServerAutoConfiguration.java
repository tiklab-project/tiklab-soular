package com.doublekit.portal.config;

import com.doublekit.datafly.starter.annotation.EnableDataFly;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * TccCommonApplication
 */
@Configuration
@EnableDataFly(location = {"scripts/portal.sql"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

