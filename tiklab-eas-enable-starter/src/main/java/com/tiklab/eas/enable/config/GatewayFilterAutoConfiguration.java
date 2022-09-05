//package com.tiklab.eas.enable.config;
//
//import com.tiklab.eam.author.Authenticator;
//import com.tiklab.eam.client.author.AuthorHandler;
//import com.tiklab.eam.client.author.config.IgnoreConfig;
//import com.tiklab.eam.client.author.config.IgnoreConfigBuilder;
//import com.tiklab.gateway.GatewayFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GatewayFilterAutoConfiguration {
//    //网关filter
//    @Bean
//    GatewayFilter gatewayFilter(AuthorHandler authorHandler){
//        return new GatewayFilter()
//                .addHandler(authorHandler);
//    }
//
//    //认证handler
//    @Bean
//    AuthorHandler authorHandler(Authenticator authenticator, IgnoreConfig ignoreConfig){
//        return new AuthorHandler()
//                .setAuthenticator(authenticator)
//                .setIgnoreConfig(ignoreConfig);
//
//    }
//
//    @Bean
//    public IgnoreConfig ignoreConfig(){
//        return IgnoreConfigBuilder.instance()
//                .ignoreTypes(new String[]{
//                        ".ico",
//                        ".jpg",
//                        ".jpeg",
//                        ".png",
//                        ".gif",
//                        ".html",
//                        ".js",
//                        ".css",
//                        ".json",
//                        ".xml",
//                        ".ftl"
//                })
//                .ignoreUrls(new String[]{
//                        "/",
//                        "/eam/auth/login",
//                        "/eam/auth/logout",
//                        "/eam/passport/valid",
//                        "/auth/valid",
//                        "/document/view",
//                        "/comment/view",
//                        "/share/verifyAuthCode",
//                        "/share/judgeAuthCode",
//                        "/user/findAllUser",
//                        "/orga/findAllOrga",
//                        "/userOrga/findAllUserOrga",
//                        "/dingdingcfg/findId",
//                        "/dingding/passport/login",
//                        "/dingding/passport/valid",
//                        "/wechatcfg/findWechatById",
//                        "/wechat/passport/login",
//                        "/wechat/passport/internallogin",
//                        "/wechat/passport/internalacclogin",
//                        "/ldap/passport/login",
//                        "/version/getVersion",
//                        "/licence/import",
//                        "/wechatCallback/instruct"
//                })
//                .ignorePreUrls(new String[]{
//                        "/service",
//                        "/apis/list",
//                        "/apis/detail",
//                        "/file",
//                        "/plugin",
//                        "/authConfig",
//                        "/ws",
//                        "/socket"
//                })
//                .get();
//    }
//
//}
