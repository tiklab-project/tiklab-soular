
INSERT INTO `pcs_mec_message` (`id`, `message_template_id`, `data`, `sender`, `receive_time`, `total_num`, `success_num`, `application`) VALUES ('4505ce2af9fb3763e9581f133f137d61', '60ea6c910b092a0e68bd5a55fddcdc46', '{\"userName\":\"管理员\",\"users\":\"\",\"roleName\":\"管理员角色\"}', NULL, '2022-07-28 08:53:16', NULL, NULL, 'eas');
INSERT INTO `pcs_mec_message_send_type` (`id`, `name`, `code`, `description`,`bgroup`) VALUES ('942591eeee4a3100f2ea2cb871539c65', '站内信', 'site', '在系统中通知消息类型', 'eas');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`,`bgroup`) VALUES ('2ba9b35136183577a6973fbf900d5b3b', '角色通知', '角色变动的消息类型管理', 'eas');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`,`bgroup`) VALUES ('5ea6acf0883ead208d8e75f031ca93df', '站内信', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/', 'eas');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`,`bgroup`) VALUES ('60ea6c910b092a0e68bd5a55fddcdc46', '角色添加成员站内消息模板', '2ba9b35136183577a6973fbf900d5b3b', '942591eeee4a3100f2ea2cb871539c65', '角色通知', 1, '用户${userName} ,邀请${users}用户到\"${roleName}\"角色中。', NULL, '/system/role', 'eas');



-- 初始化功能权限
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('043e412151db118d27f2ab60d8ff73a0', '同步数据', 'user_dir_sync', '585d26bcbdf3047e502e4aa51c816090', 19, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('0c73e628fd5410c382f28a956304a9d7', '插件', 'plugin', NULL, 8, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('325c2503007fd5127baca9d7618e8291', '编辑组织', 'orga_update_orga', '6b61fbe5091a8e04d2b016f15d598f1f', 13, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('428be660dea3db2a2c5a613420b3ead7', '编辑用户', 'user_update_user', '5fb7863b09a8d0c99cef173e18106fb3', 16, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('447d9998fc00fe64c96c6f09f0d41c32', '禁止', 'user_dir_forbid', '585d26bcbdf3047e502e4aa51c816090', 21, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('49e12c2b8fca01894886211df2b797d0', '权限', 'permission', NULL, 5, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('57a3bcd1e5fedd77824359d06b06fe49', '添加用户', 'user_add_user', '5fb7863b09a8d0c99cef173e18106fb3', 15, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('585d26bcbdf3047e502e4aa51c816090', '用户目录', 'user_dir', NULL, 4, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('5fb7863b09a8d0c99cef173e18106fb3', '成员', 'user', NULL, 3, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('64bdf62686a4939c1061422394ded7cd', '版本与许可证', 'version', NULL, 10, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('6b61fbe5091a8e04d2b016f15d598f1f', '部门', 'orga', NULL, 2, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('890e7d41decf71cfe3b0e80b0c4179cf', '配置', 'user_dir_config', '585d26bcbdf3047e502e4aa51c816090', 22, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('925371be8ec674a06613bf8e37ec356c', '开启', 'user_dir_open', '585d26bcbdf3047e502e4aa51c816090', 20, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('9314739a13fedc65c948180d7702f518', '操作日志', 'log', NULL, 9, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('9633d947588684a5881ccff9eaa3aba0', '修改角色', 'user_update_role', '5fb7863b09a8d0c99cef173e18106fb3', 18, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('9c99b8a096c8788bc27be5122d0700e8', '添加组织', 'orga_add_orga', '6b61fbe5091a8e04d2b016f15d598f1f', 11, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('cb954a7c0be3b37fcc96ec023924262c', '添加用户', 'orga_add_user', '6b61fbe5091a8e04d2b016f15d598f1f', 12, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('dd81bdbb52bca933d1e7336f9c877f8e', '删除用户', 'user_delete_user', '5fb7863b09a8d0c99cef173e18106fb3', 17, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('e8bf9843bc9da8d3c4c33e31174496b3', '删除组织', 'orga_delete_orga', '6b61fbe5091a8e04d2b016f15d598f1f', 14, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('edb60bf65e4279e46ce21210b3213bd8', '待办任务', 'todotask', NULL, 7, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f344830df1f8a160f9fdfe11cee9abe7', '工作台', 'work', NULL, 1, '1', 'eas');
INSERT INTO `pcs_prc_function` (`id`, `name`, `code`, `parent_function_id`, `sort`, `type`, `bgroup`) VALUES ('f6f51f9441339cd20013f4f20c378dc6', '消息通知', 'message', NULL, 6, '1', 'eas');


-- 初始化admin角色的权限功能
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('0ca3c8625274a9a0fb0996a7b2ca40c8', '1', '325c2503007fd5127baca9d7618e8291', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('182f37b4128825052764e57b4df3320b', '1', '49e12c2b8fca01894886211df2b797d0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('1de76c3f04a1c5b62b1bff44065b34f7', '1', '5fb7863b09a8d0c99cef173e18106fb3', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('26af453881d5cccd6e52e502be4775e6', '1', '9314739a13fedc65c948180d7702f518', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('35a204b61b65576b34a507fb5fab96f4', '1', '6b61fbe5091a8e04d2b016f15d598f1f', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('3e682c2618a607562180eaa150e7bd2d', '1', '0c73e628fd5410c382f28a956304a9d7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('4d62ceac4ea82c6eb1a81d4b13c4d7d1', '1', 'dd81bdbb52bca933d1e7336f9c877f8e', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('640892e368a7d9b05f1b1e88abcda964', '1', '428be660dea3db2a2c5a613420b3ead7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('6ae50d02d4ed17f971bc6c61c0bb67ea', '1', '9633d947588684a5881ccff9eaa3aba0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('6d56ee9b2518fd0403ffcd5b0478c298', '1', '9c99b8a096c8788bc27be5122d0700e8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('70978ef543639b3d373ac70071a16903', '1', '447d9998fc00fe64c96c6f09f0d41c32', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('95418992b599c9fdedb92f22deb76d97', '1', 'cb954a7c0be3b37fcc96ec023924262c', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('98450c504e3ee4fff09a7c50b2354d22', '1', 'f344830df1f8a160f9fdfe11cee9abe7', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('986c25307b21df56e9d7b0022281f3cc', '1', '64bdf62686a4939c1061422394ded7cd', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('ae443de5001adc8d498cb02456d332bd', '1', '043e412151db118d27f2ab60d8ff73a0', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('b0c186a33872c62a995c4e5da09ccb14', '1', 'edb60bf65e4279e46ce21210b3213bd8', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('c5fe246887fa2115ec1cb8a07a77aef5', '1', '890e7d41decf71cfe3b0e80b0c4179cf', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('c88134f7af2c99626e62ca498d6c3216', '1', '57a3bcd1e5fedd77824359d06b06fe49', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('d026551cfc33d036de61208a413a9607', '1', '925371be8ec674a06613bf8e37ec356c', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('e5092e324e36e10d8ec24c37e34df346', '1', 'f6f51f9441339cd20013f4f20c378dc6', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('e64e932f43a121ffbc19f3846ec6de0d', '1', '585d26bcbdf3047e502e4aa51c816090', 'eas');
INSERT INTO `pcs_prc_role_function` (`id`, `role_id`, `function_id`, `bgroup`) VALUES ('f8438284b4abb8cfcc01074e7c5c66b3', '1', 'e8bf9843bc9da8d3c4c33e31174496b3', 'eas');



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
-- INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('111111', '登录退出模板', '用户<span style=\"color:blue\">${user}</span>在${timestamp}时间操作${actionType}了', NULL, 'eas');

