package com.doublekit.portal.config;

import com.doublekit.datafly.starter.annotation.DataFly;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@DataFly(locations = {"scripts/portal.sql"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

