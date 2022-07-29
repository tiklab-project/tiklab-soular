package com.doublekit.portal.stater;

import com.doublekit.dsm.annotation.SQL;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@SQL(modules = {"portal", "widget","defaultData"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

