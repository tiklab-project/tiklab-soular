package io.thoughtware.eas.starter.config;

import io.thoughtware.eam.author.Authenticator;
import io.thoughtware.eam.client.author.config.AuthorConfig;
import io.thoughtware.eam.client.author.config.AuthorConfigBuilder;
import io.thoughtware.eam.client.author.handler.AuthorHandler;
import io.thoughtware.gateway.router.Router;
import io.thoughtware.gateway.router.RouterBuilder;
import io.thoughtware.gateway.router.config.RouterConfig;
import io.thoughtware.gateway.router.config.RouterConfigBuilder;
import io.thoughtware.user.util.util.CodeUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EasGatewayFilterAutoConfiguration {

    @Autowired
    CodeUtilService codeUtilService;

    //路由
    @Bean
    Router router(RouterConfig routerConfig){
        return RouterBuilder.newRouter(routerConfig);
    }

    //路由配置
    @Bean
    RouterConfig routerConfig(){
        String[] s = {
        };

        if (codeUtilService.findEmbedEnable()){
            s = new String[]{};
        }

        return RouterConfigBuilder.instance()
                .preRoute(s, codeUtilService.findEmbedAddress())
                .get();
    }

    //认证filter
    @Bean
    AuthorHandler authorFilter(Authenticator authenticator, AuthorConfig ignoreConfig){
        return new AuthorHandler()
                .setAuthenticator(authenticator)
                .setAuthorConfig(ignoreConfig);
    }

    @Bean
    public AuthorConfig authorConfig(){
        return AuthorConfigBuilder.instance()
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
