
INSERT INTO eas_work_widget (id, name, code, description, type, web_url, api_url, dashboard_type) VALUES ('2ec80cbe7129', '消息通知', 'eas_message', '项目全家桶的消息收集器', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'left');
INSERT INTO eas_work_widget (id, name, code, description, type, web_url, api_url, dashboard_type) VALUES ('a75f20fe300d', '项目快捷入口', 'eas_application', '项目全家桶的快捷入口，可以快速进入某个项目中', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'right');
INSERT INTO eas_work_widget (id, name, code, description, type, web_url, api_url, dashboard_type) VALUES ('666b38b9cca8', '日志', 'eas_oplog', '日志', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'left');
INSERT INTO eas_work_widget (id, name, code, description, type, web_url, api_url, dashboard_type) VALUES ('a2021e623644', '任务待办', 'eas_todo', '任务待办', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'right');

-- 初始化work_widget_layout
INSERT INTO eas_work_widget_layout (id, right_dashboard, left_dashboard) VALUES ('a30ec3fccf22ded7ab06e15e73e64ddd','[{\"id\": \"a75f20fe300d\",\"name\": \"项目快捷入口\",\"code\": \"eas_application\",	\"description\": \"项目全家桶的快捷入口，可以快速进入某个项目中\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14\",\n\"apiUrl\": \"http://192.168.10.14\",	\"dashboardType\": \"right\"},{	\"id\": \"a2021e623644\",	\"name\": \"任务待办\",\"code\": \"eas_todo\",	\"description\": \"任务待办\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"right\"},{	\"id\": \"666b38b9cca8\",\"name\": \"日志\",	\"code\": \"eas_oplog\",\"description\": \"日志\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"left\"}]','');
