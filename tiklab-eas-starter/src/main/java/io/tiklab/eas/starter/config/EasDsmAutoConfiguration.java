package io.tiklab.eas.starter.config;

import io.tiklab.dal.dsm.config.model.DsmConfig;
import io.tiklab.dal.dsm.support.DsmConfigBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EasDsmAutoConfiguration {

    /**
     * 初始化dsm
     * @return
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
                //TodoTaskDsm
                "todotask_1.0.0",
                //EasDsm
                "eas_1.0.0"
        });
        dsmConfig.newVersion("1.0.1", new String[]{
                "privilege_1.0.1",
                "eas_1.0.1",
        });
        dsmConfig.newVersion("1.0.2", new String[]{
                "eas_1.0.2",
        });
        return dsmConfig;
    }


}
























