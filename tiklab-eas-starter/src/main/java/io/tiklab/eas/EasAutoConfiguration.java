package io.tiklab.eas;

import io.tiklab.dal.starter.annotation.EnableDal;
import io.tiklab.dcs.starter.EnableDcs;
import io.tiklab.dfs.starter.EnableDfs;
import io.tiklab.dsm.starter.annotation.EnableDsm;
import io.tiklab.dss.starter.EnableDss;
import io.tiklab.eam.starter.EnableEam;
import io.tiklab.gateway.starter.EnableGateway;
import io.tiklab.integration.starter.EnableIntegration;
import io.tiklab.join.starter.EnableToolkit;
import io.tiklab.licence.starter.EnableLicenceServer;
import io.tiklab.messsage.starter.EnableMessage;
import io.tiklab.pluginx.starter.EnablePluginServer;
import io.tiklab.postgresql.EnablePostgresql;
import io.tiklab.privilege.EnablePrivilegeServer;
import io.tiklab.rpc.starter.annotation.EnableRpc;
import io.tiklab.security.stater.EnableSecurity;
import io.tiklab.todotask.stater.EnableTodoTask;
import io.tiklab.user.starter.EnableUser;
import org.springframework.context.annotation.Configuration;

/**
 * PortalAutoConfiguration
 */
@Configuration
//platform
@EnableToolkit
@EnablePostgresql
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
//@EnablePrivilegeServer
@EnablePluginServer
@EnableIntegration
@EnableLicenceServer
@EnableTodoTask
@EnableSecurity

//other
//@EnablePostInClient
@EnablePrivilegeServer
@EnableEasServer


public class  EasAutoConfiguration {
}

