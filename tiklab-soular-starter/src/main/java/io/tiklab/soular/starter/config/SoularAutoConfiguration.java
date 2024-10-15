package io.tiklab.soular.starter.config;

import io.tiklab.dsm.boot.starter.annotation.EnableDsm;
import io.tiklab.licence.boot.starter.annotation.EnableLicenceServer;
import io.tiklab.user.boot.starter.annotation.EnableUserServer;
import io.tiklab.dal.boot.starter.annotation.EnableDal;
import io.tiklab.dcs.boot.starter.annotation.EnableDcsClient;
import io.tiklab.dcs.boot.starter.annotation.EnableDcsServer;
import io.tiklab.eam.boot.starter.annotation.EnableEamClient;
import io.tiklab.eam.boot.starter.annotation.EnableEamServer;
import io.tiklab.messsage.boot.starter.annotation.EnableMessageServer;
import io.tiklab.gateway.boot.starter.annotation.EnableGateway;
import io.tiklab.privilege.boot.starter.annotation.EnablePrivilegeServer;
import io.tiklab.security.boot.stater.annotation.EnableSecurityServer;
import io.tiklab.toolkit.boot.starter.annotation.EnableToolkit;
import io.tiklab.rpc.boot.starter.annotation.EnableRpc;
import io.tiklab.postgresql.EnablePostgresql;
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
@ComponentScan({"io.tiklab.soular"})
public class SoularAutoConfiguration {
}
