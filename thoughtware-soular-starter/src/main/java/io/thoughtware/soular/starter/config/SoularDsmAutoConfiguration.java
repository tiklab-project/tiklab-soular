package io.thoughtware.soular.starter.config;

import io.thoughtware.dsm.config.model.DsmConfig;
import io.thoughtware.dsm.support.DsmConfigBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoularDsmAutoConfiguration {

    /**
     * 初始化dsm
     */
    @Bean("EasDsm")
    DsmConfig initDsmConfig() {
        DsmConfig dsmConfig = DsmConfigBuilder.instance();
        //1.0.0
        dsmConfig.newVersion("1.0.0", new String[]{
                //PrivilegeDsm
                "privilege_1.0.0",
                //UserDsm
                "user_1.0.0",
                "userCe_1.0.0",
                //IntegrationDsm
                "tool_1.0.0",
                //LicenceDsm
                "app-authorization_1.0.0",
                //MessageDsm
                "message_1.0.0",
                //SecurityDsm
                "oplog_1.0.0",
                "backups_1.0.0",
                //TodoTaskDsm
                "todotask_1.0.0",
                //EasDsm
                "eas_1.0.0"
        });
        dsmConfig.newVersion("1.0.1", new String[]{
                "privilege_1.0.1",
                "eas_1.0.1",
                "oplog_1.0.1",
                "message_1.0.1",
                "todotask_1.0.1",
                "user-update_1.0.1",
                "apply-auth_1.0.1"
        });
        dsmConfig.newVersion("1.0.2", new String[]{
                "message_1.0.2",
                "oplog_1.0.2",
                "privilege_1.0.2",
                "eas_1.0.2",
                "apply-auth_1.0.2"
        });
        dsmConfig.newVersion("1.0.3", new String[]{
                "message_1.0.3",
                "oplog_1.0.3",
                "apply-auth_1.0.3",
                "privilege_1.0.3",
        });
        dsmConfig.newVersion("1.0.4", new String[]{
                "message_1.0.4",
                "oplog_1.0.4",
                "apply-auth_1.0.4",
                "privilege_1.0.4",
        });
        dsmConfig.newVersion("1.0.5", new String[]{
                "message_1.0.5",
                "eas_1.0.5"
        });
        dsmConfig.newVersion("1.0.6", new String[]{
                "message_1.0.6",
                "eas_1.0.6"
        });
        dsmConfig.newVersion("1.0.7", new String[]{
                "message_1.0.7",
        });
        dsmConfig.newVersion("1.0.8", new String[]{
                "message_1.0.8",
        });
        return dsmConfig;
    }


}
























