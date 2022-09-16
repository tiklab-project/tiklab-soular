package net.tiklab.eas;

import net.tiklab.beans.starter.annotation.EnableBeans;
import net.tiklab.dal.starter.annotation.EnableDal;
import net.tiklab.dcs.starter.EnableDcs;
import net.tiklab.dfs.starter.EnableDfs;
import net.tiklab.dsm.starter.annotation.EnableDsm;
import net.tiklab.dss.starter.EnableDss;
import net.tiklab.eam.starter.EnableEam;
import net.tiklab.gateway.starter.EnableGateway;
import net.tiklab.join.starter.annotation.EnableJoin;
import net.tiklab.licence.starter.EnableLicenceServer;
import net.tiklab.message.starter.EnableMessage;
import net.tiklab.mysql.starter.EnableMysql;
import net.tiklab.pluginx.starter.EnablePluginServer;
import net.tiklab.postin.client.EnablePostInClient;
import net.tiklab.privilege.stater.EnablePrivilegeServer;
import net.tiklab.rpc.starter.annotation.EnableRpc;
import net.tiklab.toolkit.EnableToolkitServer;
import net.tiklab.user.starter.EnableUser;
import net.tiklab.web.starter.annotation.EnableWeb;
import org.springframework.context.annotation.Configuration;

/**
 * PortalAutoConfiguration
 */
@Configuration
//platform
@EnableBeans
@EnableWeb

@EnableMysql

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

@EnableEasServer


public class  EasAutoConfiguration {
}

