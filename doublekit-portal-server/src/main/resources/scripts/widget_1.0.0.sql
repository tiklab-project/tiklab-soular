CREATE TABLE work_widget(
    id VARCHAR(32) PRIMARY KEY,
    name VARCHAR(32) NOT NULL COMMENT 'widget名称',
    code VARCHAR(32) NOT NULL COMMENT 'widget编码',
    description VARCHAR(32) COMMENT '描述',
    type VARCHAR(32) NOT NULL COMMENT 'protal、project、apibox'
);


CREATE TABLE work_widget_layout(
    id VARCHAR(32) PRIMARY KEY,
    uid VARCHAR(32) NOT NULL COMMENT '用户id',
    tenant VARCHAR(32) COMMENT '企业租户id',
    layout LONGTEXT COMMENT 'widget的坐标，[]数组字符串'
);