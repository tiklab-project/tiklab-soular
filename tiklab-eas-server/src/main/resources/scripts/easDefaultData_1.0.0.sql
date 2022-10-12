INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('2ec80cbe7129b358715cdcf1f0e13fcd', '消息通知', 'eas_message', '项目全家桶的消息收集器', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'left');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a75f20fe300d9f7610084ead0d63a354', '项目快捷入口', 'eas_application', '项目全家桶的快捷入口，可以快速进入某个项目中', 'eas', 'http://192.168.10.14', 'http://192.168.10.14', 'right');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('666b38b9cca899073f7e06f075a7d5de', '日志', 'eas_oplog', '日志', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'left');
INSERT INTO `eas_work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a2021e623644f5ebee836010f639a485', '任务待办', 'eas_todo', '任务待办', 'eas', 'http://192.168.10.14:3001', 'http://192.168.10.14:8080', 'right');

-- 初始化work_widget_layout
INSERT INTO `eas_work_widget_layout` (`id`, `right_dashboard`, `left_dashboard`) VALUES ('a30ec3fccf22ded7ab06e15e73e64ddd', '[{\"id\": \"a75f20fe300d9f7610084ead0d63a354\",\"name\": \"项目快捷入口\",\"code\": \"eas_application\",	\"description\": \"项目全家桶的快捷入口，可以快速进入某个项目中\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14\",\n\"apiUrl\": \"http://192.168.10.14\",	\"dashboardType\": \"right\"},{\"id\": \"2ec80cbe7129b358715cdcf1f0e13fcd\",	\"name\": \"消息通知\",	\"code\": \"eas_message\",	\"description\": \"项目全家桶的消息收集器\",\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14\",\"apiUrl\": \"http://192.168.10.14\",	\"dashboardType\": \"left\"},{	\"id\": \"a2021e623644f5ebee836010f639a485\",	\"name\": \"任务待办\",\"code\": \"eas_todo\",	\"description\": \"任务待办\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"right\"},{	\"id\": \"666b38b9cca899073f7e06f075a7d5de\",\"name\": \"日志\",	\"code\": \"eas_oplog\",\"description\": \"日志\",	\"type\": \"eas\",	\"webUrl\": \"http://192.168.10.14:3001\",	\"apiUrl\": \"http://192.168.10.14:8080\",	\"dashboardType\": \"left\"}]', '');

INSERT INTO `pcs_mec_message` (`id`, `message_template_id`, `data`, `sender`, `receive_time`, `total_num`, `success_num`, `application`) VALUES ('4505ce2af9fb3763e9581f133f137d61', '60ea6c910b092a0e68bd5a55fddcdc46', '{\"userName\":\"管理员\",\"users\":\"\",\"roleName\":\"管理员角色\"}', NULL, '2022-07-28 08:53:16', NULL, NULL, 'eas');
INSERT INTO `pcs_mec_message_send_type` (`id`, `name`, `code`, `description`,`bgroup`) VALUES ('942591eeee4a3100f2ea2cb871539c65', '站内信', 'site', '在系统中通知消息类型', 'eas');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`,`bgroup`) VALUES ('2ba9b35136183577a6973fbf900d5b3b', '角色通知', '角色变动的消息类型管理', 'eas');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`,`bgroup`) VALUES ('5ea6acf0883ead208d8e75f031ca93df', '站内信', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/', 'eas');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`,`bgroup`) VALUES ('60ea6c910b092a0e68bd5a55fddcdc46', '角色添加成员站内消息模板', '2ba9b35136183577a6973fbf900d5b3b', '942591eeee4a3100f2ea2cb871539c65', '角色通知', 1, '用户${userName} ,邀请${users}用户到\"${roleName}\"角色中。', NULL, '/system/role', 'eas');



-- 初始化功能权限
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('0afd449318cff90bea00c0dbc458972c', '消息模板管理', 'sys_message_template', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('0d841c9636e3e5f80d1cc3fa882311a5', '功能管理', 'sys_feature', '4ec3d621872b6262c1be8189b75c1c78', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('149840d175f7c0e2d055561a8cc6be1b', '消息中心', 'sys_message_center', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('1ce48d70b72480efaa7892fc2ac76b2f', '消息类型管理', 'sys_message_type', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('2ec3a2259c05e4172aa1f193fa72cf59', '插件管理', 'plugin', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('30ac3e732b746c9527f2a5928963a6c5', '任务待办', 'todo_list', 'b604d7879bd10d31919969ebc5dcacd7', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('4ec3d621872b6262c1be8189b75c1c78', '系统权限', 'sys_permission', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('51fdb28c871c4da452b890152046b7d8', '我的待办', 'my_todo', 'b604d7879bd10d31919969ebc5dcacd7', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('56d73b0fbef2489acf6e5f06236ccbc0', '消息发送方式', 'sys_message_send', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('626ddfff470fcfeb25ca483459aaae93', '待办模板', 'todo_template', 'b604d7879bd10d31919969ebc5dcacd7', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('90d527109d996117ef18ddf1cb9c17a8', '用户目录', 'sys_directory', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('a03673c3482a27c6576f867b62591a1f', '日志列表', 'oplog_list', 'f3cdaf11b3e0451a5f19ca171bbd8208', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('a2b442614036a4cfc2af1d39bd34e057', '用户管理', 'sys_user', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('a9fbf0c450ef34c32fdea0c4001a04d0', '角色管理', 'sys_role', '4ec3d621872b6262c1be8189b75c1c78', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('b604d7879bd10d31919969ebc5dcacd7', '任务', 'todo', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('b79a194a1ba302eec683f48a637288d4', 'License管理', 'license', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('bb6bd9002a8afdb7cf8a67ba8b5a5809', 'Widget管理', 'widget', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('c5289521b5cda99ae9dcc6cda4b8aba8', '日志模板', 'oplog_template', 'f3cdaf11b3e0451a5f19ca171bbd8208', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('c762b62ff7bb1eff6b2c07e50614b825', '消息管理', 'sys_message_management', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('dadf107f5f644c1eba9abd35008363cf', '组织管理', 'sys_orga', NULL, NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f0f311598f39f14b2c0ba3abbed28dae', '我的日志', 'my_oplog', 'f3cdaf11b3e0451a5f19ca171bbd8208', NULL, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f3cdaf11b3e0451a5f19ca171bbd8208', '日志', 'oplog', NULL, NULL, '1', 'eas');


-- 初始化admin角色的权限功能
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('0c1f05b09b2943a62ef366dcc4086d98', '1', 'bb6bd9002a8afdb7cf8a67ba8b5a5809', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('21594614c071747fffdd184832af4093', '1', 'a9fbf0c450ef34c32fdea0c4001a04d0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('234a5d4f8d1c69297f81d65d551eccbc', '1', 'dadf107f5f644c1eba9abd35008363cf', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('2c7a843f661b1ccad201c5fbdc0f194a', '1', '56d73b0fbef2489acf6e5f06236ccbc0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('3472ec612bdd716895f04134b8619128', '1', '4ec3d621872b6262c1be8189b75c1c78', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('3e5620134ccd3641be94057acc2763a5', '1', '51fdb28c871c4da452b890152046b7d8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('4268380c9f52765aa78aa87936b4a771', '1', '0afd449318cff90bea00c0dbc458972c', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('647268a714b7f1ab5e8564cfc816f4a4', '1', '2ec3a2259c05e4172aa1f193fa72cf59', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('695cf8f1289346b16dea18056580d480', '1', 'b604d7879bd10d31919969ebc5dcacd7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('8473d00da60dba072e1223afdb4a89a0', '1', '90d527109d996117ef18ddf1cb9c17a8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('8ed4b03df3de4e01115796ff9bae7e8f', '1', '149840d175f7c0e2d055561a8cc6be1b', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('93999c0e286f20ef3ef8438b2e3f5e2a', '1', 'c5289521b5cda99ae9dcc6cda4b8aba8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('94e78d51d22abb4f304a6f2c49bad312', '1', 'f3cdaf11b3e0451a5f19ca171bbd8208', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('9eba39b6e84040e2abd0674698d45a04', '1', '626ddfff470fcfeb25ca483459aaae93', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('a0b8466fb719f4be2d0d4ad3ed05e3fb', '1', 'b79a194a1ba302eec683f48a637288d4', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('a36df2b017c99016164429d7584da0ef', '1', '30ac3e732b746c9527f2a5928963a6c5', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('c29419cc1879313001ae44dd7c901fbb', '1', 'a2b442614036a4cfc2af1d39bd34e057', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('cb98b67bc194173a4041ad4cff630035', '1', 'a03673c3482a27c6576f867b62591a1f', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('ec650027ffce666328bd64dcf01975f6', '1', 'c762b62ff7bb1eff6b2c07e50614b825', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('f4fccc1571a0a510b45decd72f7c91f9', '1', 'f0f311598f39f14b2c0ba3abbed28dae', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('fb792a8b96f55d9e50448404357cc211', '1', '0d841c9636e3e5f80d1cc3fa882311a5', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('ff2264573de1c766ebd17208f382d898', '1', '1ce48d70b72480efaa7892fc2ac76b2f', 'eas');



-- 项目管理 消息
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('5ea6acf0883ead208d8e75f031ca93de', '事项变更通知', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/index/message/{id}', 'teamwire');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('ba7505f829345af0eb42c7fcc4cf76db', '任务待办通知', 'fb26b5b84646b11f1ed091367e8ea156', '942591eeee4a3100f2ea2cb871539c65', '任务待办通知', 1, '你有新任务!', NULL, '/index/organ', 'teamwire');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`, `bgroup`) VALUES ('8066e0357e4bb181b2f7bc438c36dc29', '事项变更', '事项变更', 'teamwire');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`, `bgroup`) VALUES ('fb26b5b84646b11f1ed091367e8ea156', '任务通知', '任务通知', 'teamwire');


-- apibox 消息
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('5ea6acf0883ead208d8e75f031ca94df', '接口空间创建通知模板', '2ba9b35136183577a6973fbf900d5b4b', '942591eeee4a3100f2ea2cb871539c65', '空间创建通知', 1, '你创建了一个空间！', NULL, '/workspacepage/apis/detail/interface/detail', 'postin');
INSERT INTO `pcs_mec_message_type`  (`id`, `name`, `description`, `bgroup`) VALUES ('2ba9b35136183577a6973fbf900d5b4b', '创建空间通知', NULL,  'postin');

-- test on 消息
INSERT INTO `pcs_mec_message_template`  (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('5ea6acf0883ead208d8e75f031ca94d0', '仓库创建通知模板', '2ba9b35136183577a6973fbf900d5b4b', '942591eeee4a3100f2ea2cb871539c65', '空间创建通知', 1, '你创建了一个仓库！', NULL, '/repositorypage/detail', 'teston');

-- 初始话管理员角色表
INSERT INTO `pcs_prc_role` (`id`, `name`, `description`, `grouper`, `type`, `bgroup`) VALUES ('1', 'admin', NULL, 'system', '1', 'eas');

-- 管理员角色金和admin用户绑定 表
INSERT INTO `pcs_prc_role_user` (`id`, `role_id`, `user_id`, `bgroup`) VALUES ('1', '1', '111111', 'eas');

-- 初始化登录退出模板
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('111111', '登录退出模板', '用户<span style=\"color:blue\">${user}</span>在${timestamp}时间操作${actionType}了', NULL, 'eas');

