INSERT INTO `pcs_op_log_template` (`id`, `title`, `content`, `link`, `bgroup`) VALUES ('LOG_CODE', '空间', '<div>\n<span style=\"\n    color: #4581b7;\n\">${user}</span> <span>${actionType} </span><span>${mode}： </span><img src=\"${images}\" alt=\"\" width=\"16px\" height=\"16px\"/><span style=\"\nmargin: 0 5px;\n    font-weight: 600;\n    color: #4b768a;\n\">${name}</span></div>', '/workspacePage', 'postin');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('CREATE_TYPE', '新增', 'postin');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('DELETE_TYPE', '删除', 'postin');
INSERT INTO `pcs_op_log_type` (`id`, `name`, `bgroup`) VALUES ('UPDATE_TYPE', '更新', 'postin');


INSERT INTO `pcs_mec_message_template` (`id`, `name`, `msg_type_id`, `msg_send_type_id`, `title`, `content_config_type`, `content`, `content_url`, `link`, `bgroup`) VALUES ('WORKSPACE_CREATE', '空间创建通知模板', 'WORKSPACE_CREATE_TYPE', '942591eeee4a3100f2ea2cb871539c65', '空间创建通知', 1, '<div style=\"\n    display: flex;\n    align-items: center;\n\"> <span style=\"\n    color: #6c8ca0;\n    margin: 0 5px 0 0;\n\">${userName}</span>创建了:<img src=\"${images}\" alt=\"\" width=\"16px\" height=\"16px\" style=\"\n    margin: 0 5px;\"/><span  style=\"font-weight:600\">${name}</span></div>', NULL, '/workspacePage', 'postin');
INSERT INTO `pcs_mec_message_type` (`id`, `name`, `description`, `bgroup`) VALUES ('WORKSPACE_CREATE_TYPE', '创建空间通知', NULL, 'postin');

