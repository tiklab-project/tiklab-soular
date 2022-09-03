package com.tiklab.eas.stater;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class EnableEasProperty {
    public static final HashMap<String,Object> map = new HashMap<>();

    @Value("${eas.embbed.enable}")
    private Boolean embbedEnable;

    @Value("${eas.server.port}")
    private Integer serverPort;

    @Value("${eas.address}")
    private String address;

    @Value("${eas.web.address}")
    private String webAddress;

    //数据库
    @Value("${mysql.embbed.enable}")
    private Boolean mysqlEmbbedEnable;

    @Value("${mysql.server.port}")
    private Integer mysqlServerPort;

    @Value("${mysql.name}")
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
