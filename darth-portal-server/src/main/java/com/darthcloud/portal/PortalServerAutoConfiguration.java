package com.darthcloud.portal;

import com.darthcloud.apibox.client.annotation.EnableApiboxClient;
import org.springframework.context.annotation.Configuration;
import com.darthcloud.user.annotation.EnableUserServer;
import com.darthcloud.privilege.annotation.EnablePrivilegeServer;
import com.darthcloud.message.annotation.EnableMessageServer;
import com.darthcloud.plugin.annotation.EnablePluginServer;
import com.darthcloud.gateway.annotation.EnableGateway;

/**
 * TccCommonApplication
 */
@Configuration
@EnableUserServer
@EnablePrivilegeServer
@EnableMessageServer
@EnablePluginServer
@EnableGateway
@EnableApiboxClient
public class PortalServerAutoConfiguration {
}

