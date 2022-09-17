package net.tiklab.eas.config;

import net.tiklab.eam.author.Authenticator;

import net.tiklab.eam.client.author.AuthorHandler;
import net.tiklab.eam.client.author.config.IgnoreConfig;
import net.tiklab.eam.client.author.config.IgnoreConfigBuilder;
import net.tiklab.gateway.GatewayFilter;
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
                        "/eam/auth/login",
                        "/eam/auth/logout",
                        "/eam/passport/valid",
                        "/auth/valid",
                        "/wechat/passport/login",
                        "/wechat/passport/internallogin",
                        "/wechat/passport/internalacclogin",


                        "/document/view",
                        "/comment/view",
                        "/share/verifyAuthCode",
                        "/share/judgeAuthCode",

                        "/dingding/passport/login",
                        "/dingding/passport/valid",

                        "/user/wechatcfg/findWechatById",
                        "/user/user/findAllUser",
                        "/user/orga/findAllOrga",
                        "/user/userOrga/findAllUserOrga",
                        "/user/dingdingcfg/findId",



                        "/wechatCallback/instruct",
                        "/eam/ldap/passport/login",
                        "/version/getVersion",
                        "/licence/import",

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
