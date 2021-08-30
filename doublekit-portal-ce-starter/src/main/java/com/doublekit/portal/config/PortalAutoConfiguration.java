package com.doublekit.portal.config;

import com.doublekit.apibox.client.annotation.EnableApiboxClient;
import com.doublekit.dal.starter.annotation.EnableDal;
import com.doublekit.datafly.starter.annotation.EnableDataFly;
import com.doublekit.dcs.starter.annotation.EnableDcs;
import com.doublekit.dfs.starter.annotation.EnableDfs;
import com.doublekit.dss.starter.annotation.EnableDss;
import com.doublekit.eam.annotation.EnableEamServer;
import com.doublekit.eam.authenticator.annotation.EnableEamAuthenticator;
import com.doublekit.framework.starter.annotation.EnableFramework;
import com.doublekit.message.annotation.EnableMessageServer;
import com.doublekit.plugin.annotation.EnablePluginServer;
import com.doublekit.portal.annotation.EnablePortalServer;
import com.doublekit.privilege.annotation.EnablePrivilegeServer;
import com.doublekit.toolkit.annotation.EnableToolkitServer;
import com.doublekit.user.annotation.EnableUserServer;
import com.doublekit.web.starter.annotation.EnableWeb;
import org.springframework.context.annotation.Configuration;

/**
 * TccCommonApplication
 */
@Configuration
//common
@EnableFramework
@EnableWeb
@EnableDal
@EnableDfs
@EnableDcs
@EnableDss
//modules
@EnablePortalServer
@EnableUserServer
@EnableEamServer
@EnableEamAuthenticator
@EnablePrivilegeServer
@EnableMessageServer
@EnablePluginServer
@EnableToolkitServer
@EnableApiboxClient
public class PortalAutoConfiguration {
}

