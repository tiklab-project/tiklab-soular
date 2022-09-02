-- 项目管理 消息

INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('5ea6acf0883ead208d8e75f031ca93de', '事项变更通知', '8066e0357e4bb181b2f7bc438c36dc29', '942591eeee4a3100f2ea2cb871539c65', '事项变更', 1, '有新的消息！', NULL, '/index/message/{id}');
INSERT INTO `mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`) VALUES ('ba7505f829345af0eb42c7fcc4cf76db', '任务待办通知', 'fb26b5b84646b11f1ed091367e8ea156', '942591eeee4a3100f2ea2cb871539c65', '任务待办通知', 1, '你有新任务!', NULL, '/index/organ');
INSERT INTO `mec_message_type` (`id`, `name`, `description`) VALUES ('8066e0357e4bb181b2f7bc438c36dc29', '事项变更', '事项变更');
INSERT INTO `mec_message_type` (`id`, `name`, `description`) VALUES ('fb26b5b84646b11f1ed091367e8ea156', '任务通知', '任务通知');


-- apibox 消息
INSERT INTO `mec_message_template` VALUES ('5ea6acf0883ead208d8e75f031ca94df', '接口空间创建通知模板', '2ba9b35136183577a6973fbf900d5b4b', '942591eeee4a3100f2ea2cb871539c65', '空间创建通知', 1, '你创建了一个空间！', NULL, '/workspacepage/apis/detail/interface/detail');
INSERT INTO `mec_message_type` VALUES ('2ba9b35136183577a6973fbf900d5b4b', '创建空间通知', NULL);



-- test on 消息
INSERT INTO `mec_message_template` VALUES ('5ea6acf0883ead208d8e75f031ca94d0', '仓库创建通知模板', '2ba9b35136183577a6973fbf900d5b4b', '942591eeee4a3100f2ea2cb871539c65', '空间创建通知', 1, '你创建了一个仓库！', NULL, '/repositorypage/detail');


