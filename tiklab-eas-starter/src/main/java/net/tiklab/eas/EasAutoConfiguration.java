package net.tiklab.eas;

import net.tiklab.dal.starter.annotation.EnableDal;
import net.tiklab.dcs.starter.EnableDcs;
import net.tiklab.dfs.starter.EnableDfs;
import net.tiklab.dsm.starter.annotation.EnableDsm;
import net.tiklab.dss.starter.EnableDss;
import net.tiklab.eam.starter.EnableEam;
import net.tiklab.flow.starter.EnableFlowServer;
import net.tiklab.form.starter.EnableFormServer;
import net.tiklab.gateway.starter.EnableGateway;
import net.tiklab.licence.starter.EnableLicenceServer;
import net.tiklab.message.starter.EnableMessage;
import net.tiklab.mysql.starter.EnableMysql;
import net.tiklab.oplog.stater.EnableLog;
import net.tiklab.pluginx.starter.EnablePluginServer;
import net.tiklab.postin.client.EnablePostInClient;
import net.tiklab.privilege.stater.EnablePrivilegeServer;
import net.tiklab.rpc.starter.annotation.EnableRpc;
import net.tiklab.tks.annotation.EnableTks;
import net.tiklab.todotask.stater.EnableTodoTask;
import net.tiklab.toolkit.EnableToolkitServer;
import net.tiklab.user.starter.EnableUser;
import net.tiklab.web.starter.annotation.EnableWeb;
import net.tiklab.widget.starter.EnableWidget;
import org.springframework.context.annotation.Configuration;

/**
 * PortalAutoConfiguration
 */
@Configuration
//platform
@EnableTks
@EnableWeb

@EnableMysql

@EnableDal
@EnableDsm
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
@EnableTodoTask
@EnableLog
@EnableWidget


@EnableFormServer
@EnableFlowServer

//other
@EnablePostInClient

@EnableEasServer


public class  EasAutoConfiguration {
}

