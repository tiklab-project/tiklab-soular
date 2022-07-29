INSERT INTO `work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('2ec80cbe7129b358715cdcf1f0e13fcd', '消息通知', 'portal_message', '项目全家桶的消息收集器', 'portal', 'http://192.168.10.14', 'http://192.168.10.14', 'left');
INSERT INTO `work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a75f20fe300d9f7610084ead0d63a354', '项目快捷入口', 'portal_application', '项目全家桶的快捷入口，可以快速进入某个项目中', 'portal', 'http://192.168.10.14', 'http://192.168.10.14', 'right');
INSERT INTO `work_widget_layout` (`id`, `uid`, `tenant`, `right_dashboard`, `left_dashboard`) VALUES ('a30ec3fccf22ded7ab06e15e73e64ddd', '111111', NULL, '[{\"id\":\"a75f20fe300d9f7610084ead0d63a354\",\"name\":\"项目快捷入口\",\"code\":\"portal_application\",\"description\":\"项目全家桶的快捷入口，可以快速进入某个项目中\",\"type\":\"portal\",\"webUrl\":\"http://192.168.10.14\",\"apiUrl\":\"http://192.168.10.14\",\"dashboardType\":\"right\"}]', '[{\"id\":\"2ec80cbe7129b358715cdcf1f0e13fcd\",\"name\":\"消息通知\",\"code\":\"portal_message\",\"description\":\"项目全家桶的消息收集器\",\"type\":\"portal\",\"webUrl\":\"http://192.168.10.14\",\"apiUrl\":\"http://192.168.10.14\",\"dashboardType\":\"left\"}]');


INSERT INTO `mec_message` (`id`, `message_template_id`, `data`, `sender`, `receive_time`, `total_num`, `success_num`, `application`) VALUES ('4505ce2af9fb3763e9581f133f137d61', '60ea6c910b092a0e68bd5a55fddcdc46', '{\"userName\":\"管理员\",\"users\":\"\",\"roleName\":\"管理员角色\"}', NULL, '2022-07-28 08:53:16', NULL, NULL, 'portal');
INSERT INTO `mec_message_send_type` (`id`, `name`, `code`, `description`) VALUES ('942591eeee4a3100f2ea2cb871539c65', '站内信', 'site', '在系统中通知消息类型');
INSERT INTO `mec_message_type` (`id`, `name`, `description`) VALUES ('2ba9b35136183577a6973fbf900d5b3b', '角色通知', '角色变动的消息类型管理');
INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('5ea6acf0883ead208d8e75f031ca93df', '站内信', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/');
INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('60ea6c910b092a0e68bd5a55fddcdc46', '角色添加成员站内消息模板', '2ba9b35136183577a6973fbf900d5b3b', '942591eeee4a3100f2ea2cb871539c65', '角色通知', 1, '用户${userName} ,邀请${users}用户到\"${roleName}\"角色中。', NULL, '/system/role');



-- 初始化功能权限
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('0afd449318cff90bea00c0dbc458972c', '消息模板管理', 'sys_message_template', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('0d841c9636e3e5f80d1cc3fa882311a5', '功能管理', 'sys_feature', '4ec3d621872b6262c1be8189b75c1c78', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('149840d175f7c0e2d055561a8cc6be1b', '消息中心', 'sys_message_center', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('1ce48d70b72480efaa7892fc2ac76b2f', '消息类型管理', 'sys_message_type', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('2ec3a2259c05e4172aa1f193fa72cf59', '插件管理', 'plugin', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('4ec3d621872b6262c1be8189b75c1c78', '系统权限', 'sys_permission', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('56d73b0fbef2489acf6e5f06236ccbc0', '消息发送方式', 'sys_message_send', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('90d527109d996117ef18ddf1cb9c17a8', '用户目录', 'sys_directory', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('a2b442614036a4cfc2af1d39bd34e057', '用户管理', 'sys_user', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('a9fbf0c450ef34c32fdea0c4001a04d0', '角色管理', 'sys_role', '4ec3d621872b6262c1be8189b75c1c78', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('b79a194a1ba302eec683f48a637288d4', 'License管理', 'license', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('bb6bd9002a8afdb7cf8a67ba8b5a5809', 'Widget管理', 'widget', NULL, NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('c762b62ff7bb1eff6b2c07e50614b825', '消息管理', 'sys_message_management', '149840d175f7c0e2d055561a8cc6be1b', NULL, '1');
INSERT INTO `prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('dadf107f5f644c1eba9abd35008363cf', '组织管理', 'sys_orga', NULL, NULL, '1');


-- 初始化admin角色的权限功能
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('0c1f05b09b2943a62ef366dcc4086d98', '97a7db718273636659fc5e146a00edd2', 'bb6bd9002a8afdb7cf8a67ba8b5a5809');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('21594614c071747fffdd184832af4093', '97a7db718273636659fc5e146a00edd2', 'a9fbf0c450ef34c32fdea0c4001a04d0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('234a5d4f8d1c69297f81d65d551eccbc', '97a7db718273636659fc5e146a00edd2', 'dadf107f5f644c1eba9abd35008363cf');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('2c7a843f661b1ccad201c5fbdc0f194a', '97a7db718273636659fc5e146a00edd2', '56d73b0fbef2489acf6e5f06236ccbc0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('3472ec612bdd716895f04134b8619128', '97a7db718273636659fc5e146a00edd2', '4ec3d621872b6262c1be8189b75c1c78');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('4268380c9f52765aa78aa87936b4a771', '97a7db718273636659fc5e146a00edd2', '0afd449318cff90bea00c0dbc458972c');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('647268a714b7f1ab5e8564cfc816f4a4', '97a7db718273636659fc5e146a00edd2', '2ec3a2259c05e4172aa1f193fa72cf59');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('8473d00da60dba072e1223afdb4a89a0', '97a7db718273636659fc5e146a00edd2', '90d527109d996117ef18ddf1cb9c17a8');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('8ed4b03df3de4e01115796ff9bae7e8f', '97a7db718273636659fc5e146a00edd2', '149840d175f7c0e2d055561a8cc6be1b');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('a0b8466fb719f4be2d0d4ad3ed05e3fb', '97a7db718273636659fc5e146a00edd2', 'b79a194a1ba302eec683f48a637288d4');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c29419cc1879313001ae44dd7c901fbb', '97a7db718273636659fc5e146a00edd2', 'a2b442614036a4cfc2af1d39bd34e057');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('ec650027ffce666328bd64dcf01975f6', '97a7db718273636659fc5e146a00edd2', 'c762b62ff7bb1eff6b2c07e50614b825');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('fb792a8b96f55d9e50448404357cc211', '97a7db718273636659fc5e146a00edd2', '0d841c9636e3e5f80d1cc3fa882311a5');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('ff2264573de1c766ebd17208f382d898', '97a7db718273636659fc5e146a00edd2', '1ce48d70b72480efaa7892fc2ac76b2f');

-- 初始化项目角色的权限功能
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('151fa1ac728f32fb809154263214a66e', '7cfee91edf221ae1deed232ca14c03af', '0afd449318cff90bea00c0dbc458972c');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('1891348aa9c2aa12ad7e4ad6fec7f3f2', '7cfee91edf221ae1deed232ca14c03af', 'a2b442614036a4cfc2af1d39bd34e057');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('275f8e3b9196342f37853c4028f618cb', '7cfee91edf221ae1deed232ca14c03af', '56d73b0fbef2489acf6e5f06236ccbc0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('58e074b2b686df2651f287c878591a18', '7cfee91edf221ae1deed232ca14c03af', 'dadf107f5f644c1eba9abd35008363cf');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('70ea71ccc98ee5b58844f1230b4f26be', '7cfee91edf221ae1deed232ca14c03af', '4ec3d621872b6262c1be8189b75c1c78');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('a10f95ec2cf33da08d2bd1f4fed1b26a', '7cfee91edf221ae1deed232ca14c03af', 'a9fbf0c450ef34c32fdea0c4001a04d0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('aa151a27c4665db393120af1d4baab41', '7cfee91edf221ae1deed232ca14c03af', '1ce48d70b72480efaa7892fc2ac76b2f');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c0f2d7a432deb9350d69db4430ddff20', '7cfee91edf221ae1deed232ca14c03af', '149840d175f7c0e2d055561a8cc6be1b');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c9a5ecc00dc9ec150dab639bacef1f09', '7cfee91edf221ae1deed232ca14c03af', '0d841c9636e3e5f80d1cc3fa882311a5');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('eeec306f82eb749655583e11a1e6e3a6', '7cfee91edf221ae1deed232ca14c03af', '90d527109d996117ef18ddf1cb9c17a8');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('fb0594b8ded1805c8f73f60e708def86', '7cfee91edf221ae1deed232ca14c03af', 'bb6bd9002a8afdb7cf8a67ba8b5a5809');

