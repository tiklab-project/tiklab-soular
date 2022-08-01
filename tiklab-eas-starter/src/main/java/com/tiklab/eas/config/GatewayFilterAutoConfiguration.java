package com.tiklab.eas.config;

import com.tiklab.eam.author.Authenticator;
import com.tiklab.eam.server.author.config.IgnoreConfig;
import com.tiklab.eam.server.author.config.IgnoreConfigBuilder;
import com.tiklab.eam.server.handler.AuthorHandler;
import com.tiklab.gateway.GatewayFilter;
import com.tiklab.gateway.router.RouterHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterAutoConfiguration {

    //网关filter
    @Bean
    GatewayFilter gatewayFilter(AuthorHandler authorHandler){
        return new GatewayFilter()
                .addHandler(authorHandler);
    }

    //认证handler
    @Bean
    AuthorHandler authorHandler(Authenticator authenticator, IgnoreConfig ignoreConfig){
        return new AuthorHandler()
                .setAuthenticator(authenticator)
                .setIgnoreConfig(ignoreConfig);

    }

    @Bean
    public IgnoreConfig ignoreConfig(){
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
                        ".ftl"
                })
                .ignoreUrls(new String[]{
                        "/",
                        "/passport/login",
                        "/eam/auth/logout",
                        "/passport/valid",
                        "/auth/valid",
                        "/document/view",
                        "/comment/view",
                        "/share/verifyAuthCode",
                        "/share/judgeAuthCode",
                        "/user/findAllUser",
                        "/orga/findAllOrga",
                        "/userOrga/findAllUserOrga",
                        "/dingdingcfg/findId",
                        "/dingding/passport/login",
                        "/dingding/passport/valid",
                        "/wechatcfg/findWechatById",
                        "/wechat/passport/login",
                        "/wechat/passport/internallogin",
                        "/wechat/passport/internalacclogin",
                        "/ldap/passport/login",
                        "/version/getVersion",
                        "/licence/import",
                        "/wechatCallback/instruct"
                })
                .ignorePreUrls(new String[]{
                        "/service",
                        "/apis/list",
                        "/apis/detail",
                        "/file",
                        "/plugin",
                        "/authConfig",
                        "/ws",
                        "/socket"
                })
                .get();
    }
}
