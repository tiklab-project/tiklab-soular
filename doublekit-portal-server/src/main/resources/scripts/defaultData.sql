INSERT INTO `work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('2ec80cbe7129b358715cdcf1f0e13fcd', '消息通知', 'portal_message', '项目全家桶的消息收集器', 'portal', 'http://192.168.10.14', 'http://192.168.10.14', 'left');
INSERT INTO `work_widget` (`id`, `name`, `code`, `description`, `type`, `web_url`, `api_url`, `dashboard_type`) VALUES ('a75f20fe300d9f7610084ead0d63a354', '项目快捷入口', 'portal_application', '项目全家桶的快捷入口，可以快速进入某个项目中', 'portal', 'http://192.168.10.14', 'http://192.168.10.14', 'right');
INSERT INTO `work_widget_layout` (`id`, `uid`, `tenant`, `right_dashboard`, `left_dashboard`) VALUES ('a30ec3fccf22ded7ab06e15e73e64ddd', '111111', NULL, '[{\"id\":\"a75f20fe300d9f7610084ead0d63a354\",\"name\":\"项目快捷入口\",\"code\":\"portal_application\",\"description\":\"项目全家桶的快捷入口，可以快速进入某个项目中\",\"type\":\"portal\",\"webUrl\":\"http://192.168.10.14\",\"apiUrl\":\"http://192.168.10.14\",\"dashboardType\":\"right\"}]', '[{\"id\":\"2ec80cbe7129b358715cdcf1f0e13fcd\",\"name\":\"消息通知\",\"code\":\"portal_message\",\"description\":\"项目全家桶的消息收集器\",\"type\":\"portal\",\"webUrl\":\"http://192.168.10.14\",\"apiUrl\":\"http://192.168.10.14\",\"dashboardType\":\"left\"}]');


INSERT INTO `mec_message` (`id`, `message_template_id`, `data`, `sender`, `receive_time`, `total_num`, `success_num`, `application`) VALUES ('4505ce2af9fb3763e9581f133f137d61', '60ea6c910b092a0e68bd5a55fddcdc46', '{\"userName\":\"管理员\",\"users\":\"\",\"roleName\":\"管理员角色\"}', NULL, '2022-07-28 08:53:16', NULL, NULL, 'portal');
INSERT INTO `mec_message_send_type` (`id`, `name`, `code`, `description`) VALUES ('942591eeee4a3100f2ea2cb871539c65', '站内信', 'site', '在系统中通知消息类型');
INSERT INTO `mec_message_type` (`id`, `name`, `description`) VALUES ('2ba9b35136183577a6973fbf900d5b3b', '角色通知', '角色变动的消息类型管理');
INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('5ea6acf0883ead208d8e75f031ca93df', '站内信', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/');
INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('60ea6c910b092a0e68bd5a55fddcdc46', '角色添加成员站内消息模板', '2ba9b35136183577a6973fbf900d5b3b', '942591eeee4a3100f2ea2cb871539c65', '角色通知', 1, '用户${userName} ,邀请${users}用户到\"${roleName}\"角色中。', NULL, '/system/role');


INSERT INTO `prc_role_user` (`id`, `role_id`, `user_id`) VALUES ('5dc992cdf70798f3f943c9dcf838d35e', '93025c12c3a4e904046f1720c019998b', '5e7e8790eccf6d5fc675b09bc10ca28c');
INSERT INTO `prc_role_user` (`id`, `role_id`, `user_id`) VALUES ('91248faacdb4a559c64b5c403aadf414', '5c97159bf546a988b75a9e0963cc2602', '111111');

INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('0131607170102a03f7bb10b2cac96a10', '93025c12c3a4e904046f1720c019998b', '0afd449318cff90bea00c0dbc458972c');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('0905f24642f1565ca529d60ed1745a56', '5c97159bf546a988b75a9e0963cc2602', '2ec3a2259c05e4172aa1f193fa72cf59');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('1cbef50a11fbaa307662e3104c4c4fdd', '5c97159bf546a988b75a9e0963cc2602', 'a2b442614036a4cfc2af1d39bd34e057');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('1f852750177e1ab0f28741ed631f9cb2', '93025c12c3a4e904046f1720c019998b', '1ce48d70b72480efaa7892fc2ac76b2f');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('224ee184753b29f52f6e52778c4260f7', '93025c12c3a4e904046f1720c019998b', 'c762b62ff7bb1eff6b2c07e50614b825');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('2552dfef964572e0ae829de5b58cd5f2', '93025c12c3a4e904046f1720c019998b', '0d841c9636e3e5f80d1cc3fa882311a5');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('34e365c54cb24fae3530ffa8fe715b14', '5c97159bf546a988b75a9e0963cc2602', '149840d175f7c0e2d055561a8cc6be1b');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('387508317b9d6c3daf2dde3c82ac38f6', '5c97159bf546a988b75a9e0963cc2602', 'c762b62ff7bb1eff6b2c07e50614b825');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('548b4c633ae6d2ed08eec2c33cddbe3e', '5c97159bf546a988b75a9e0963cc2602', '0d841c9636e3e5f80d1cc3fa882311a5');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('59b848c03ad31163bddef37b7646ca76', '5c97159bf546a988b75a9e0963cc2602', '1ce48d70b72480efaa7892fc2ac76b2f');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('5ae5760ff57677969013e31020f06470', '5c97159bf546a988b75a9e0963cc2602', '56d73b0fbef2489acf6e5f06236ccbc0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('6f318afe027ac6f5e2bc73f7f28fef0e', '5c97159bf546a988b75a9e0963cc2602', '4ec3d621872b6262c1be8189b75c1c78');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('70af65ef37a1fc630c39662b8bc1d384', '5c97159bf546a988b75a9e0963cc2602', 'bb6bd9002a8afdb7cf8a67ba8b5a5809');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('8525dad1a1814793b0d04240f9115496', '5c97159bf546a988b75a9e0963cc2602', 'dadf107f5f644c1eba9abd35008363cf');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('9495accd462cc2151f28eef7bb79f6ea', '93025c12c3a4e904046f1720c019998b', 'dadf107f5f644c1eba9abd35008363cf');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('94e5bdb0eb8b2a863fe2eac4a61be3ac', '93025c12c3a4e904046f1720c019998b', 'bb6bd9002a8afdb7cf8a67ba8b5a5809');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('97eb5785d44da4ca1553f431be029359', '5c97159bf546a988b75a9e0963cc2602', '0afd449318cff90bea00c0dbc458972c');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('9ebc8e8833641598706d186f60376ad6', '93025c12c3a4e904046f1720c019998b', '2ec3a2259c05e4172aa1f193fa72cf59');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('a0ec5e3a97aee610a9668cfbd0ec93f6', '93025c12c3a4e904046f1720c019998b', 'a9fbf0c450ef34c32fdea0c4001a04d0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('be00091483dcda3c693f5b2ded15a3a2', '93025c12c3a4e904046f1720c019998b', '149840d175f7c0e2d055561a8cc6be1b');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c00947cd073e5f618c77aab318ebe3e9', '5c97159bf546a988b75a9e0963cc2602', 'a9fbf0c450ef34c32fdea0c4001a04d0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('cb75f3b31ee15b4819a7aea5b8907f05', '5c97159bf546a988b75a9e0963cc2602', '90d527109d996117ef18ddf1cb9c17a8');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('d82c3aff5d999f90b8527e24c7e228f5', '5c97159bf546a988b75a9e0963cc2602', 'b79a194a1ba302eec683f48a637288d4');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('d8c9929ac32a2e6edb916f531f5cc81a', '93025c12c3a4e904046f1720c019998b', '90d527109d996117ef18ddf1cb9c17a8');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('e7999dc33e375d33f329f72af1f004db', '93025c12c3a4e904046f1720c019998b', '56d73b0fbef2489acf6e5f06236ccbc0');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('f0be296adf1055f05441bb3abfa7c658', '93025c12c3a4e904046f1720c019998b', '4ec3d621872b6262c1be8189b75c1c78');
INSERT INTO `prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('f21a59fdcd4e920c55b84d054c13d998', '93025c12c3a4e904046f1720c019998b', 'b79a194a1ba302eec683f48a637288d4');

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



