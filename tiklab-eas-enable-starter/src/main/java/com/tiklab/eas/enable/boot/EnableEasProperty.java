package com.tiklab.eas.enable.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

//@Conditional(EasInlineCondition.class)
@RestController
public class EnableEasProperty {
    public static final HashMap<String,Object> map = new HashMap<>();

    @Value("${eas.embbed.enable}")
    private boolean embbedEnable;

    @Value("${eas.server.port}")
    private Integer serverPort;

    @Value("${eas.address}")
    private String address;

    @Value("${eas.web.address}")
    private String webAddress;

    //数据库
    @Value("${eas.mysql.embbed.enable}")
    private boolean mysqlEmbbedEnable;

    @Value("${eas.mysql.server.port}")
    private Integer mysqlServerPort;

    @Value("${eas.mysql.name}")
    private String mysqlName;

    //数据库配置
    @Value("${eas.jdbc.url}")
    private String jdbcUrl;

    @Value("${eas.jdbc.driverClassName}")
    private String jdbcDriverClassName;

    @Value("${eas.jdbc.username}")
    private String jdbcUsername;

    @Value("${eas.jdbc.password}")
    private String jdbcPassword;

    @Bean
    public void putEas(){

        map.put("embbedEnable", embbedEnable);
        map.put("serverPort", serverPort);
        map.put("address", address);
        map.put("webAddress", webAddress);

        map.put("mysqlEmbbedEnable", mysqlEmbbedEnable);
        map.put("mysqlServerPort", mysqlServerPort);
        map.put("mysqlName", mysqlName);

        map.put("jdbcUrl", jdbcUrl);
        map.put("jdbcDriverClassName", jdbcDriverClassName);
        map.put("jdbcUsername", jdbcUsername);
        map.put("jdbcPassword", jdbcPassword);
    }
}
