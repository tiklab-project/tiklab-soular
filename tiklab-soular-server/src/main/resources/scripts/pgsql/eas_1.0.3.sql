-- 更改消息模板
UPDATE pcs_mec_message_template SET msg_type_id = 'USER_CREATE', msg_send_type_id = 'qywechat', title = NULL, content = '## 创建用户\n
> 创建人：<font color=comment>${userName}</font>\n
> 用户：<font color=info>**${name}**</font>\n', link = '/setting/user', bgroup = 'soular', link_params = NULL WHERE id = '34d48bf413a7';

UPDATE pcs_mec_message_template SET msg_type_id = 'USER_DELETE', msg_send_type_id = 'qywechat', title = NULL, content = '## 删除用户\n
> 操作人：<font color=comment>${userName}</font>\n
> 删除用户：<font color=warning>**${name}**</font>', link = '', bgroup = 'soular', link_params = NULL WHERE id = 'c9fe98a3344a';

UPDATE pcs_mec_message_template SET msg_type_id = 'USER_UPDATE', msg_send_type_id = 'qywechat', title = NULL, content = '## 更新用户信息\n
> 操作人：<font color=comment>${userName}</font>\n
> 更新类型：<font color=warning>${update}</font>\n
> 更新用户：<font color=warning>**${name}**</font>', link = '/setting/user', bgroup = 'soular', link_params = NULL WHERE id = '41dd07a55856';

UPDATE pcs_mec_message_template SET msg_type_id = 'USER_LOGIN', msg_send_type_id = 'qywechat', title = NULL, content = '## 登录应用\n
> 登录用户：<font color=info>${userName}</font>\n
> 时间：<font color=comment>${time}</font>', link = '/work', bgroup = 'eas', link_params = NULL WHERE id = 'd8d2e673fbb6';