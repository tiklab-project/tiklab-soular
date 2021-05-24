package com.darthcloud.account;

import com.darthcloud.apibox.client.annotation.EnableApiboxClient;
import com.darthcloud.gateway.annotation.EnableGateway;
import com.darthcloud.message.annotation.EnableMessageServer;
import com.darthcloud.orga.annotation.EnableOrgaServer;
import com.darthcloud.plugin.annotation.EnablePluginServer;
import com.darthcloud.privilege.annotation.EnablePrivilegeServer;
import org.springframework.context.annotation.Configuration;

/**
 * TccCommonApplication
 */
@Configuration
@EnableOrgaServer
@EnablePrivilegeServer
@EnableMessageServer
@EnablePluginServer
@EnableGateway
@EnableApiboxClient
public class AccountServerAutoConfiguration {
}

