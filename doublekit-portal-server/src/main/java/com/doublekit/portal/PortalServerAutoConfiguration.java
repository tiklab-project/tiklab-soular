package com.doublekit.portal;

import com.doublekit.dsm.annotation.SQL;
import com.doublekit.eam.server.EnableEamServer;
import com.doublekit.user.EnableUserServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@EnableUserServer
@EnableEamServer
@SQL(modules = {"portal"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

