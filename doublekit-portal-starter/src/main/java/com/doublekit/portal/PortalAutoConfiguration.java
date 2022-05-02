package com.doublekit.portal;

import com.doublekit.apibox.client.EnableApiboxClient;
import com.doublekit.beans.starter.annotation.EnableBeans;
import com.doublekit.dal.starter.annotation.EnableDal;
import com.doublekit.dsm.starter.annotation.EnableDsm;
import com.doublekit.dss.starter.EnableDss;
import com.doublekit.eam.server.EnableEamServer;
import com.doublekit.gateway.starter.EnableGateway;
import com.doublekit.join.starter.annotation.EnableJoin;
import com.doublekit.licence.EnableLicenceServer;
import com.doublekit.message.starter.EnableMessage;
import com.doublekit.pluginx.EnablePluginServer;
import com.doublekit.privilege.EnablePrivilegeServer;
import com.doublekit.rpc.starter.annotation.EnableRpc;
import com.doublekit.toolkit.EnableToolkitServer;
import com.doublekit.user.EnableUserServer;
import com.doublekit.web.starter.annotation.EnableWeb;
import org.springframework.context.annotation.Configuration;

/**
 * PortalAutoConfiguration
 */
@Configuration
//platform
@EnableBeans
@EnableWeb
@EnableDal
@EnableDsm
@EnableJoin
@EnableDss
@EnableRpc
@EnableMessage
@EnableGateway
//pcs
@EnableUserServer
@EnableEamServer
@EnablePrivilegeServer
@EnablePluginServer
@EnableToolkitServer
@EnableLicenceServer
//other
@EnablePortalServer
@EnableApiboxClient
public class  PortalAutoConfiguration {
}

