package com.doublekit.portal.config;

import com.doublekit.gateway.author.config.IgnoreConfig;
import com.doublekit.gateway.author.config.IgnoreConfigBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterAutoConfiguration {

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
                        "/passport/logout",
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
                        "/dingding/passport/logout",
                        "/dingding/passport/valid",
                        "/wechatcfg/findWechatById",
                        "/wechat/passport/login",
                        "/ldap/passport/login",
                        "/ldap/passport/logout",
                        "/version/getVersion",
                        "/licence/import"
                })
                .ignorePreUrls(new String[]{
                        "/service",
                        "/apis/list",
                        "/apis/detail",
                        "/file",
                        "/plugin",
                        "/authConfig"
                })
                .get();
    }
}
