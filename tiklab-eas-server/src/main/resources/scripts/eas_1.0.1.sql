
CREATE TABLE eas_work_widget(
    id VARCHAR(32) PRIMARY KEY,
    name VARCHAR(32) NOT NULL COMMENT 'widget名称',
    code VARCHAR(32) NOT NULL COMMENT 'widget编码',
    description VARCHAR(32) COMMENT '描述',
    type VARCHAR(32) NOT NULL COMMENT 'protal、project、postin',
    web_url VARCHAR(64) NOT NULL COMMENT 'widget的页面跳转url',
    api_url VARCHAR(64) NOT NULL COMMENT 'widget的接口url',
    dashboard_type VARCHAR(8) COMMENT 'right、left或者 normal'
);


CREATE TABLE eas_work_widget_layout(
       id VARCHAR(32) PRIMARY KEY,
       right_dashboard LONGTEXT COMMENT '右侧面板的widget数据字符型数组',
       left_dashboard LONGTEXT COMMENT '左侧侧面板的widget数据字符型数组'
);

INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('2ec80cbe7129b358715cdcf1f0e13fcd', '消息通知', 'eas_message', '项目全家桶的消息收集器', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'left');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a75f20fe300d9f7610084ead0d63a354', '项目快捷入口', 'eas_application', '项目全家桶的快捷入口，可以快速进入某个项目中', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'right');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('666b38b9cca899073f7e06f075a7d5de', '日志', 'eas_oplog', '日志', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'left');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a2021e623644f5ebee836010f639a485', '任务待办', 'eas_todo', '任务待办', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'right');

-- 初始化work_widget_layout
INSERT INTO `eas_work_widget_layout` (`id`, `right_dashboard`, `left_dashboard`) VALUES ('a30ec3fccf22ded7ab06e15e73e64ddd','[{\"id\": \"a75f20fe300d9f7610084ead0d63a354\",\"name\": \"项目快捷入口\",\"code\": \"eas_application\",	\"description\": \"项目全家桶的快捷入口，可以快速进入某个项目中\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14\",\n\"apiUrl\": \"http://192.168.10.14\",	\"dashboardType\": \"right\"},{	\"id\": \"a2021e623644f5ebee836010f639a485\",	\"name\": \"任务待办\",\"code\": \"eas_todo\",	\"description\": \"任务待办\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"right\"},{	\"id\": \"666b38b9cca899073f7e06f075a7d5de\",\"name\": \"日志\",	\"code\": \"eas_oplog\",\"description\": \"日志\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"left\"}]','');
