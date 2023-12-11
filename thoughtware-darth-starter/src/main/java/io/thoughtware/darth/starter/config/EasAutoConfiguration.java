package io.thoughtware.darth.starter.config;

import io.thoughtware.licence.boot.starter.annotation.EnableLicenceServer;
import io.thoughtware.user.boot.starter.annotation.EnableUserServer;
import io.thoughtware.dal.boot.starter.annotation.EnableDal;
import io.thoughtware.dcs.boot.starter.annotation.EnableDcsClient;
import io.thoughtware.dcs.boot.starter.annotation.EnableDcsServer;
import io.thoughtware.eam.boot.starter.annotation.EnableEamClient;
import io.thoughtware.eam.boot.starter.annotation.EnableEamServer;
import io.thoughtware.messsage.boot.starter.annotation.EnableMessageServer;
import io.thoughtware.gateway.boot.starter.annotation.EnableGateway;
import io.thoughtware.privilege.boot.starter.annotation.EnablePrivilegeServer;
import io.thoughtware.security.boot.stater.annotation.EnableSecurityServer;
import io.thoughtware.todotask.boot.stater.annotation.EnableTodoTaskServer;
import io.thoughtware.toolkit.boot.starter.annotation.EnableToolkit;
import io.thoughtware.rpc.boot.starter.annotation.EnableRpc;
import io.thoughtware.plugin.starter.EnablePluginServer;
import io.thoughtware.postgresql.EnablePostgresql;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * PortalAutoConfiguration
 */
@Configuration
//platform
@EnableToolkit
@EnablePostgresql
@EnableDal
@EnableDcsServer
@EnableDcsClient
@EnableRpc
@EnableGateway
@EnablePluginServer

//pcs
@EnableUserServer
@EnableEamServer
@EnableEamClient
@EnableLicenceServer
@EnableMessageServer
@EnableTodoTaskServer
@EnableSecurityServer
@EnablePrivilegeServer

//other
@ComponentScan({"io.thoughtware.darth"})
public class  EasAutoConfiguration {
}

