package io.tiklab.soular.starter.config;

import io.tiklab.eam.author.Authenticator;
import io.tiklab.eam.client.author.handler.DefaultAuthorHandler;
import io.tiklab.gateway.config.*;
import io.tiklab.gateway.handler.author.AuthorHandler;
import io.tiklab.rpc.client.router.Router;
import io.tiklab.user.util.util.CodeUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoularGatewayFilterAutoConfiguration {

    @Bean
    AuthorHandler authorHandler(Authenticator authenticator, IgnoreConfig ignoreConfig){
        DefaultAuthorHandler authorHandler = new DefaultAuthorHandler();
        authorHandler.setAuthenticator(authenticator);
        authorHandler.setIgnoreConfig(ignoreConfig);
        return authorHandler;
    }

    @Bean
    GatewayConfig gatewayConfig(IgnoreConfig ignoreConfig){
        GatewayConfig gatewayConfig = new GatewayConfig();
        gatewayConfig.setIgnoreConfig(ignoreConfig);

        return gatewayConfig;
    }

    @Bean
    public IgnoreConfig authorConfig(){
        return IgnoreConfigBuilder.instance()
                .ignoreTypes(new String[]{
                        ".ico",
                        ".jpg",
                        ".jpeg",
                        ".png",
                        ".gif",
                        ".html",
                        ".js",
                        ".css",
                        ".json",
                        ".xml",
                        ".ftl",
                        ".map",
                        ".gz",
                        ".svg",
                        ".txt"
                })
                .ignoreUrls(new String[]{
                        "/",
                        // login
                        "/eam/ldap/passport/login",
                        "/eam/ldap/passport/logout",
                        "/eam/wechat/passport/login",
                        "/eam/wechat/passport/logout",
                        "/eam/dingding/passport/login",
                        "/eam/auth/login",
                        "/eam/auth/logout",
                        "/eam/auth/valid",
                        "/eam/wechat/passport/internallogin",
                        "/eam/auth/valid",

                        "/auth/valid",
                        "/share/verifyAuthCode",
                        "/share/judgeAuthCode",
                        "/user/user/findAllUser",
                        "/user/user/recoverPassword",
                        "/user/orga/findAllOrga",
                        "/userOrga/findAllUserOrga",

                        "/user/dingdingcfg/findId",
                        "/dingding/passport/logout",
                        "/dingding/passport/valid",
                        "/user/wechatcfg/findWechatById",
                        "/wechat/passport/internallogin",
                        "/wechat/passport/internalacclogin",
                        "/version/getVersion",
                        "/licence/import",
                        "/wechatCallback/instruct",
                        "/gui",
                        "/licence/tryLicence",
                        "/test/test",
                        "/data/import",
                        "/dingding/sync",
                        "/backups/findBackups",
                        "/backups/backups",
                        "/backups/uploadBackups",
                        "/backups/restore",
                        "/backups/findRestore",
                        // 同步接口
                        "/oplog/type/syncLogType",
                        "/todo/type/syncTaskType",
                        "/message/messageType/syncMessageType",
                        "/init/install/findStatus",
                        "/openapi/doc"
                })
                .ignorePreUrls(new String[]{
                        "/service",
                        "/apis/list",
                        "/apis/detail",
                        "/file",
                        "/plugin",
                        "/authConfig",
                        "/ws",
                        "/socket",
                        "/start",
                        "/eas",
                        "/sql"
                })
                .get();
    }
}
