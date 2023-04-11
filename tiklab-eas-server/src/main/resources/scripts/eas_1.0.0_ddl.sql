-- @dsm.cmd.id="1001"
CREATE TABLE eas_work_widget(
    id VARCHAR(32) PRIMARY KEY,
    name VARCHAR(32) NOT NULL COMMENT 'widget名称',
    code VARCHAR(32) NOT NULL COMMENT 'widget编码',
    description VARCHAR(32) COMMENT '描述',
    type VARCHAR(32) NOT NULL COMMENT 'protal、project、postin',
    web_url VARCHAR(64) NOT NULL COMMENT 'widget的页面跳转url',
    api_url VARCHAR(64) NOT NULL COMMENT 'widget的接口url',
    dashboard_type VARCHAR(8) COMMENT 'right、left或者 normal'
);

-- @dsm.cmd.id="1002"
CREATE TABLE eas_work_widget_layout(
       id VARCHAR(32) PRIMARY KEY,
       right_dashboard LONGTEXT COMMENT '右侧面板的widget数据字符型数组',
       left_dashboard LONGTEXT COMMENT '左侧侧面板的widget数据字符型数组'
);
