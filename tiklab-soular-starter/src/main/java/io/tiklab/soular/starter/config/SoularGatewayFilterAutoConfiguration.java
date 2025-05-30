package io.tiklab.soular.starter.config;

import io.tiklab.eam.author.Authenticator;
import io.tiklab.eam.client.author.config.AuthorConfig;
import io.tiklab.eam.client.author.config.AuthorConfigBuilder;
import io.tiklab.eam.client.author.handler.AuthorHandler;
import io.tiklab.gateway.router.Router;
import io.tiklab.gateway.router.RouterBuilder;
import io.tiklab.gateway.router.config.RouterConfig;
import io.tiklab.gateway.router.config.RouterConfigBuilder;
import io.tiklab.user.util.util.CodeUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoularGatewayFilterAutoConfiguration {

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
