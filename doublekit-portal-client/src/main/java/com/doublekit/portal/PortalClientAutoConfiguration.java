package com.doublekit.portal;

import com.doublekit.eam.client.EnableEamClient;
import com.doublekit.user.client.EnableUserClient;
import org.springframework.context.annotation.Configuration;

/**
 * PortalClientAutoConfiguration
 */
@Configuration
@EnableUserClient
@EnableEamClient
public class PortalClientAutoConfiguration {
}

