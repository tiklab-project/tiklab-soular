package com.doublekit.portal;

import com.doublekit.dsm.annotation.Dsm;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalServerAutoConfiguration
 */
@Configuration
@Dsm(modules = {"portal"})
@ComponentScan({"com.doublekit.portal"})
public class PortalServerAutoConfiguration {
}

