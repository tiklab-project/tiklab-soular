INSERT INTO `pcs_mec_message_send_type` (`id`, `name`, `code`, `description`, `bgroup`) VALUES ('站内发送', '站内发送', 'site', '站内发送', 'matflow');

INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('MES_TEM_PIPELINE_CREATE', '流水线消息', 'PIPELINE', '站内发送', '流水线创建信息', 1, '<span style=\"color: #003c7f \">${userName}</span>\n<span style=\"padding: 0 5px\">创建了</span>\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span>${pipelineName}</span>', NULL, '${pipelineId}', 'matflow');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('MES_TEM_PIPELINE_DELETE', '流水线删除消息', 'PIPELINE', '站内发送', '流水线删除信息', 1, '<span style=\"color: #003c7f\">${userName}</span>\n<span style=\"padding: 0 5px\">删除了流水线</span>\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span>${pipelineName}</span>', NULL, '${pipelineId}', 'matflow');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('MES_TEM_PIPELINE_EXEC', '流水线执行消息', 'PIPELINERUN', '站内发送', '流水线执行信息', 1, '<span  style=\"color: #003c7f \">${userName}</span>\n<span style=\"padding: 0 5px\">执行了</span>\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span>${pipelineName}</span>', NULL, '${pipelineId}', 'matflow');
INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('MES_TEM_PIPELINE_RUN', '流水线运行消息', '07d0194bd6e2a8eb730f1240d050c964', '站内发送', '流水线运行信息', 1, '<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span>${pipelineName}</span>\n<span style=\"padding-left: 5px\">执行${message}</span>\n', NULL, '${pipelineId}', 'matflow');


INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`, `bgroup`) VALUES ('MES_PIPELINE', '流水线', '流水线消息', 'matflow');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`, `bgroup`) VALUES ('MES_PIPELINE_RUN', '运行', '流水线运行消息', 'matflow');



INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_CONFIG_CREATE', '配置创建', '<span><font color=\"#1890ff\">${user}</font></span>添加了\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span><span><font color=\"#1890ff\">${pipelineName}</font></span>的${message}', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_CONFIG_DELETE', '配置删除', '<span><font color=\"#1890ff\">${user}</font></span>\n删除了\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span><font color=\"#1890ff\">${pipelineName}</font></span>\n的${message}', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_CONFIG_UPDATE', '配置更新', '<span><font color=\"#1890ff\">${user}</font></span>创建了\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span><font color=\"#1890ff\">${pipelineName}</font></span>的${message}', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_CREATE', '流水线创建', '<span><font color=\"#1890ff\">${user}</font></span>创建了流水线\n <span class=\"mf-message-pipelinename icon-${color}\">${name}</span><span> <font color=\"#1890ff\">${pipelineName}</font></span>', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_DELETE', '流水线删除', '<span><font color=\"#1890ff\">${user}</font></span>删除了流水线\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span><span><font color=\"#1890ff\">${pipelineName}</font></span>', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_EXEC', '流水线执行', '<span><font color=\"#1890ff\">${user}</font></span>执行了流水线\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span><font color=\"#1890ff\">${pipelineName}</font></span>', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_RUN', '流水线运行', '流水线\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span><font color=\"#1890ff\">${pipelineName}</font></span>执行<img src=${image} height=25px width=25px>${message}', '${pipelineId}', 'matflow');
INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_TEM_PIPELINE_UPDATE', '流水线更新', '<span><font color=\"#1890ff\">${user}</font></span>更新流水线\n<span class=\"mf-message-pipelinename icon-${color}\">${name}</span>\n<span><font color=\"#1890ff\">${pipelineName}</font></span>的${message}', '${pipelineId}', 'matflow');


INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('LOG_PIPELINE', '流水线', 'matflow');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('LOG_PIPELINE_AUTH', '权限变更', 'matflow');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('LOG_PIPELINE_CONFIG', '配置', 'matflow');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('LOG_PIPELINE_RUN', '运行', 'matflow');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('LOG_PIPELINE_USER', '成员邀请', 'matflow');



