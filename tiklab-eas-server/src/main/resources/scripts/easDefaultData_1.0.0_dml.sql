-- 之前在pcs中
-- 系统级
-- 初始话管理员角色表
INSERT INTO `pcs_prc_role` (`id`, `name`, `description`, `grouper`, `type`, `scope`, `default_role`, `business_type`) VALUES ('1', '管理员角色', NULL, 'system', '1', 1, 1, 1);
-- 初始话普通色表
INSERT INTO `pcs_prc_role` (`id`, `name`, `description`, `grouper`, `type`, `scope`, `default_role`, `business_type`) VALUES ('2', '普通角色', NULL, 'system', '1', 1, 0, 0);
-- 管理员角色金和admin用户绑定 表
-- INSERT INTO `pcs_prc_role_user` (`id`, `role_id`, `user_id`) VALUES ('1', '1', '111111');


-- 项目级
-- 初始话管理员角色表
INSERT INTO `pcs_prc_role` (`id`, `name`, `description`, `grouper`, `type`, `scope`, `default_role`, `business_type`) VALUES ('3', '项目管理员', NULL, 'system', '2', 1, 1, 1);
-- 初始话普通色表
INSERT INTO `pcs_prc_role` (`id`, `name`, `description`, `grouper`, `type`, `scope`, `default_role`, `business_type`) VALUES ('4', '项目普通角色', NULL, 'system', '2', 1, 0, 0);

-- 项目管理员角色金和admin用户绑定 表
-- INSERT INTO `pcs_prc_role_user` (`id`, `role_id`,  `user_id`) VALUES ('2', '3', '111111');

-- 初始化admin角色平台的功能点关联数据
-- 用户模块 和 admin用户
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('1de76c3f04a1c5b62b1bff44065b34f7', '1', '5fb7863b09a8d0c99cef173e18106fb3');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c88134f7af2c99626e62ca498d6c3216', '1', '57a3bcd1e5fedd77824359d06b06fe49');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('640892e368a7d9b05f1b1e88abcda964', '1', '428be660dea3db2a2c5a613420b3ead7');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('4d62ceac4ea82c6eb1a81d4b13c4d7d1', '1', 'dd81bdbb52bca933d1e7336f9c877f8e');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('6ae50d02d4ed17f971bc6c61c0bb67ea', '1', '9633d947588684a5881ccff9eaa3aba0');

-- 部门模块 和 admin用户
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('35a204b61b65576b34a507fb5fab96f4', '1', '6b61fbe5091a8e04d2b016f15d598f1f');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('6d56ee9b2518fd0403ffcd5b0478c298', '1', '9c99b8a096c8788bc27be5122d0700e8');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('95418992b599c9fdedb92f22deb76d97', '1', 'cb954a7c0be3b37fcc96ec023924262c');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('0ca3c8625274a9a0fb0996a7b2ca40c8', '1', '325c2503007fd5127baca9d7618e8291');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('f8438284b4abb8cfcc01074e7c5c66b3', '1', 'e8bf9843bc9da8d3c4c33e31174496b3');

-- 用户目录 和 admin用户
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('e64e932f43a121ffbc19f3846ec6de0d', '1', '585d26bcbdf3047e502e4aa51c816090');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('ae443de5001adc8d498cb02456d332bd', '1', '043e412151db118d27f2ab60d8ff73a0');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('d026551cfc33d036de61208a413a9607', '1', '925371be8ec674a06613bf8e37ec356c');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('c5fe246887fa2115ec1cb8a07a77aef5', '1', '890e7d41decf71cfe3b0e80b0c4179cf');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('70978ef543639b3d373ac70071a16903', '1', '447d9998fc00fe64c96c6f09f0d41c32');

-- 初始化admin角色的权限功能
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('182f37b4128825052764e57b4df3320b', '1', '49e12c2b8fca01894886211df2b797d0');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('26af453881d5cccd6e52e502be4775e6', '1', '9314739a13fedc65c948180d7702f518');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('3e682c2618a607562180eaa150e7bd2d', '1', '0c73e628fd5410c382f28a956304a9d7');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('98450c504e3ee4fff09a7c50b2354d22', '1', 'f344830df1f8a160f9fdfe11cee9abe7');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('986c25307b21df56e9d7b0022281f3cc', '1', '64bdf62686a4939c1061422394ded7cd');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('b0c186a33872c62a995c4e5da09ccb14', '1', 'edb60bf65e4279e46ce21210b3213bd8');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('e5092e324e36e10d8ec24c37e34df346', '1', 'f6f51f9441339cd20013f4f20c378dc6');


-- 用户组信息
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('7aa081e7588865a6ab75c14caf8317b7', '1', '4235d2624bdf30ye502e4aa51c816090');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('048474ad31d1948f35f39313f6496f7b', '1', 'hf43e412151eqwqd27f2ab60d8ff73a0');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('6db0011966d136925c0895bf5d459bcb', '1', 'hfg5371be8ec674a06613bf8e37ec343');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('10e8d88e520509822ac64455fff8b59c', '1', 'oug5371be8ec674a06613bf8e37ec343');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('7c20bbaa68277053c89933b73a3b4bba', '1', '43e7d41decf71cfe3b0e80b0c417976g');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`) VALUES ('887d1fc798ae06acfc4e2439b2f9236e', '1', 'wqre9998fc00fe64c96c6f09f0d45343');



-- 初始化功能权限
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('0c73e628fd5410c382f28a956304a9d7', '插件', 'plugin', NULL, 8, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('49e12c2b8fca01894886211df2b797d0', '权限', 'permission', NULL, 5, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('64bdf62686a4939c1061422394ded7cd', '版本与许可证', 'version', NULL, 10, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('9314739a13fedc65c948180d7702f518', '操作日志', 'log', NULL, 9, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('edb60bf65e4279e46ce21210b3213bd8', '待办任务', 'todotask', NULL, 7, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('f344830df1f8a160f9fdfe11cee9abe7', '工作台', 'work', NULL, 1, '1');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`) VALUES ('f6f51f9441339cd20013f4f20c378dc6', '消息通知', 'message', NULL, 6, '1');



