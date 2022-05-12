package com.doublekit.portal;

import com.doublekit.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@SQL(modules = {"portal"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

