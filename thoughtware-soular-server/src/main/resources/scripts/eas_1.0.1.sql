
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('eabbd80b955f', '1', '3c73e628fd54');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('ea2dd86200e1', '1', '1314739a13fe');

-- 初始化功能权限
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('3c73e628fd54', '备份', 'backups', NULL, 38, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('1314739a13fe', '恢复', 'restore', NULL, 39, '1');



