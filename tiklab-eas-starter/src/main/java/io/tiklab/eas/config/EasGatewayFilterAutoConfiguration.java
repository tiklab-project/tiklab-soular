package io.tiklab.eas.config;

import io.tiklab.eam.author.Authenticator;
import io.tiklab.eam.client.author.config.AuthorConfig;
import io.tiklab.eam.client.author.config.AuthorConfigBuilder;
import io.tiklab.eam.client.author.filter.AuthorFilter;
import io.tiklab.gateway.router.Router;
import io.tiklab.gateway.router.RouterBuilder;
import io.tiklab.gateway.router.config.RouterConfig;
import io.tiklab.gateway.router.config.RouterConfigBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EasGatewayFilterAutoConfiguration {

    @Value("${eas.address:null}")
    String authAddress;

    @Value("${eas.embbed.enable:false}")
    Boolean enableEam;

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

        if (enableEam){
            s = new String[]{};
        }

        return RouterConfigBuilder.instance()
                .preRoute(s, authAddress)
                .get();
    }

    //认证filter
    @Bean
    AuthorFilter authorFilter(Authenticator authenticator, AuthorConfig ignoreConfig){
        return new AuthorFilter()
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
                        "/data/import"
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
