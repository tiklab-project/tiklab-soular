-- 之前在pcs中
-- 系统级
-- 初始话管理员角色表
INSERT INTO pcs_prc_role (id, name, description, grouper, type, scope, default_role, business_type) VALUES ('1', '管理员角色', NULL, 'system', '1', 1, 1, 1);
-- 初始话普通色表
INSERT INTO pcs_prc_role (id, name, description, grouper, type, scope, default_role, business_type) VALUES ('2', '普通角色', NULL, 'system', '1', 1, 0, 0);
-- 管理员角色金和admin用户绑定 表
-- INSERT INTO pcs_prc_role_user (id, role_id, user_id) VALUES ('1', '1', '111111');


-- 项目级
-- 初始话管理员角色表
INSERT INTO pcs_prc_role (id, name, description, grouper, type, scope, default_role, business_type) VALUES ('3', '项目管理员', NULL, 'system', '2', 1, 1, 1);
-- 初始话普通色表
INSERT INTO pcs_prc_role (id, name, description, grouper, type, scope, default_role, business_type) VALUES ('4', '项目普通角色', NULL, 'system', '2', 1, 0, 0);

-- 项目管理员角色金和admin用户绑定 表
-- INSERT INTO pcs_prc_role_user (id, role_id,  user_id) VALUES ('2', '3', '111111');

-- 初始化admin角色平台的功能点关联数据
-- 用户模块 和 admin用户
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('1de76c3f04a1', '1', '5fb7863b09a8');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('c88134f7af2c', '1', '57a3bcd1e5fe');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('640892e368a7', '1', '428be660dea3');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('4d62ceac4ea8', '1', 'dd81bdbb52bc');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('6ae50d02d4ed', '1', '9633d9475886');

-- 部门模块 和 admin用户
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('35a204b61b65', '1', '6b61fbe5091a');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('6d56ee9b2518', '1', '9c99b8a096c8');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('95418992b599', '1', 'cb954a7c0be3');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('0ca3c8625274', '1', '325c2503007f');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('f8438284b4ab', '1', 'e8bf9843bc9d');

-- 用户目录 和 admin用户
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('e64e932f43a1', '1', '585d26bcbdf3');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('ae443de5001a', '1', '043e412151db');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('d026551cfc33', '1', '925371be8ec6');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('c5fe246887fa', '1', '890e7d41decf');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('70978ef54363', '1', '447d9998fc00');

-- 初始化admin角色的权限功能
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('182f37b41288', '1', '49e12c2b8fca');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('26af453881d5', '1', '9314739a13fe');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('3e682c2618a6', '1', '0c73e628fd54');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('98450c504e3e', '1', 'f344830df1f8');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('986c25307b21', '1', '64bdf62686a4');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('b0c186a33872', '1', 'edb60bf65e42');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('e5092e324e36', '1', 'f6f51f944133');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('3123092e324e', '1', 'dasdwefas133');


-- 用户组信息
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('7aa081e75888', '1', '4235d2624bdf');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('048474ad31d1', '1', 'hf43e412151e');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('6db0011966d1', '1', 'hfg5371be8ec');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('10e8d88e5205', '1', 'oug5371be8ec');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('7c20bbaa6827', '1', '43e7d41decf7');
INSERT INTO pcs_prc_role_function (id, role_id, function_id) VALUES ('887d1fc798ae', '1', 'wqre9998fc00');



-- 初始化功能权限
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('0c73e628fd54', '插件', 'plugin', NULL, 8, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('49e12c2b8fca', '权限', 'permission', NULL, 5, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('64bdf62686a4', '版本与许可证', 'version', NULL, 10, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('9314739a13fe', '操作日志', 'log', NULL, 9, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('edb60bf65e42', '待办任务', 'todotask', NULL, 7, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('f344830df1f8', '工作台', 'work', NULL, 1, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('f6f51f944133', '消息通知', 'message', NULL, 6, '1');
INSERT INTO pcs_prc_function (id, name, code, parent_function_id, sort, type) VALUES ('dasdwefas133', '应用授权', 'product_auth', NULL, 12, '1');



