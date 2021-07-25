package com.doublekit.portal;

import com.doublekit.apibox.client.annotation.EnableApiboxClient;
import com.doublekit.datafly.starter.annotation.EnableDatafly;
import com.doublekit.toolkit.annotation.EnableToolkitServer;
import org.springframework.context.annotation.Configuration;
import com.doublekit.user.annotation.EnableUserServer;
import com.doublekit.privilege.annotation.EnablePrivilegeServer;
import com.doublekit.message.annotation.EnableMessageServer;
import com.doublekit.plugin.annotation.EnablePluginServer;

/**
 * TccCommonApplication
 */
@Configuration
@EnableUserServer
@EnablePrivilegeServer
@EnableMessageServer
@EnablePluginServer
@EnableToolkitServer
@EnableDatafly(location = {"scripts/portal.sql"})
@EnableApiboxClient
public class PortalServerAutoConfiguration {
}

