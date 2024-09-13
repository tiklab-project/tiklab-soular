package io.thoughtware.soular.starter.config;

import io.thoughtware.dsm.boot.starter.annotation.EnableDsm;
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
import io.thoughtware.toolkit.boot.starter.annotation.EnableToolkit;
import io.thoughtware.rpc.boot.starter.annotation.EnableRpc;
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
@EnableDsm

//pcs
@EnableUserServer
@EnableEamServer
@EnableEamClient
@EnableLicenceServer
@EnableMessageServer
@EnableSecurityServer
@EnablePrivilegeServer

//other
@ComponentScan({"io.thoughtware.soular"})
public class SoularAutoConfiguration {
}

