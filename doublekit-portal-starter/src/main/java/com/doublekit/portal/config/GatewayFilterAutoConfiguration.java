package com.doublekit.portal.config;

import com.doublekit.eam.author.Authenticator;
import com.doublekit.eam.client.config.TicketConfig;
import com.doublekit.eam.client.config.TicketConfigBuilder;
import com.doublekit.eam.client.handler.TicketHandler;
import com.doublekit.gateway.filter.GatewayFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayFilterAutoConfiguration {

    @Bean
    public FilterRegistrationBean ticketFilterRegistration(TicketHandler ticketHandler) {
        GatewayFilter gatewayFilter = new GatewayFilter();
        gatewayFilter.addHandler(ticketHandler);

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(gatewayFilter);
        registration.setName("gatewayFilter");
        registration.addUrlPatterns("/*");
        registration.setOrder(-1);
        return registration;
    }

    //初始化TicketHandler

    @Autowired
    Authenticator authenticator;

    @Bean
    public TicketHandler ticketHandler(TicketConfig ticketConfig){
        TicketHandler ticketFilter = new TicketHandler();
        ticketFilter.setTicketConfig(ticketConfig);
        ticketFilter.setAuthenticator(authenticator);

        return ticketFilter;
    }

    @Bean
    public TicketConfig ticketConfig(){
        return TicketConfigBuilder.instance()
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
                        "/ldap/passport/logout"
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
