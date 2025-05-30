
INSERT INTO pcs_mec_message_type (id, name, description, bgroup)
VALUES
    ('USER_CREATE', '创建用户', '创建用户', 'soular'),
    ('USER_LOGIN', '登录应用', '登录应用', 'soular'),
    ('USER_UPDATE', '更新用户信息', '更新用户信息', 'soular'),
    ('USER_DELETE', '删除用户', '删除用户', 'soular')
    ON CONFLICT (id) DO NOTHING;

INSERT INTO pcs_op_log_type (id, name, bgroup)
VALUES
    ('USER_LOGIN', '登录应用', 'soular'),
    ('USER_UPDATE', '修改用户信息', 'soular'),
    ('USER_CREATE', '创建用户', 'soular'),
    ('USER_DELETE', '删除用户', 'soular')
    ON CONFLICT (id) DO NOTHING;

