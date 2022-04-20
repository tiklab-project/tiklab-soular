package com.doublekit.portal;

import com.doublekit.datafly.annotation.DataFly;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@DataFly(modules = {"portal"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

