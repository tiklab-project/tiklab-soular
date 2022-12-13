
-- 初始化功能权限
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('0c73e628fd5410c382f28a956304a9d7', '插件', 'plugin', NULL, 8, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('49e12c2b8fca01894886211df2b797d0', '权限', 'permission', NULL, 5, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('64bdf62686a4939c1061422394ded7cd', '版本与许可证', 'version', NULL, 10, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('9314739a13fedc65c948180d7702f518', '操作日志', 'log', NULL, 9, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('edb60bf65e4279e46ce21210b3213bd8', '待办任务', 'todotask', NULL, 7, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f344830df1f8a160f9fdfe11cee9abe7', '工作台', 'work', NULL, 1, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f6f51f9441339cd20013f4f20c378dc6', '消息通知', 'message', NULL, 6, '1', 'eas');


-- 初始化admin角色的权限功能
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('182f37b4128825052764e57b4df3320b', '1', '49e12c2b8fca01894886211df2b797d0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('26af453881d5cccd6e52e502be4775e6', '1', '9314739a13fedc65c948180d7702f518', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('3e682c2618a607562180eaa150e7bd2d', '1', '0c73e628fd5410c382f28a956304a9d7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('98450c504e3ee4fff09a7c50b2354d22', '1', 'f344830df1f8a160f9fdfe11cee9abe7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('986c25307b21df56e9d7b0022281f3cc', '1', '64bdf62686a4939c1061422394ded7cd', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('b0c186a33872c62a995c4e5da09ccb14', '1', 'edb60bf65e4279e46ce21210b3213bd8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('e5092e324e36e10d8ec24c37e34df346', '1', 'f6f51f9441339cd20013f4f20c378dc6', 'eas');



-- 项目管理 消息

-- apibox 消息

-- test on 消息

