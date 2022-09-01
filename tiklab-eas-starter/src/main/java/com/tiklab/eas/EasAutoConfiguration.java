package com.tiklab.eas;

import com.tiklab.beans.starter.annotation.EnableBeans;
import com.tiklab.dal.starter.annotation.EnableDal;
import com.tiklab.dcs.starter.EnableDcs;
import com.tiklab.dfs.starter.EnableDfs;
import com.tiklab.dsm.starter.annotation.EnableDsm;
import com.tiklab.dss.starter.EnableDss;
import com.tiklab.eam.starter.EnableEam;
import com.tiklab.gateway.starter.EnableGateway;
import com.tiklab.join.starter.annotation.EnableJoin;
import com.tiklab.licence.starter.EnableLicenceServer;
import com.tiklab.message.starter.EnableMessage;
import com.tiklab.pluginx.starter.EnablePluginServer;
import com.tiklab.postin.client.EnablePostInClient;
import com.tiklab.privilege.stater.EnablePrivilegeServer;
import com.tiklab.rpc.starter.annotation.EnableRpc;
import com.tiklab.toolkit.EnableToolkitServer;
import com.tiklab.user.starter.EnableUser;
import com.tiklab.web.starter.annotation.EnableWeb;
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
@EnableDfs
@EnableDcs
@EnableDss
@EnableRpc
@EnableMessage
@EnableGateway
//pcs
@EnableUser
@EnableEam
@EnablePrivilegeServer
@EnablePluginServer
@EnableToolkitServer
@EnableLicenceServer
//other
@EnablePostInClient
public class  EasAutoConfiguration {
}

