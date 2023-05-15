-- @dsm.cmd.id="1001"
-- CREATE TABLE eas_work_widget(
--     id VARCHAR(32) PRIMARY KEY,
--     name VARCHAR(32) NOT NULL COMMENT 'widget名称',
--     code VARCHAR(32) NOT NULL COMMENT 'widget编码',
--     description VARCHAR(32) COMMENT '描述',
--     type VARCHAR(32) NOT NULL COMMENT 'protal、project、postin',
--     web_url VARCHAR(64) NOT NULL COMMENT 'widget的页面跳转url',
--     api_url VARCHAR(64) NOT NULL COMMENT 'widget的接口url',
--     dashboard_type VARCHAR(8) COMMENT 'right、left或者 normal'
-- );

CREATE TABLE eas_work_widget (
    id VARCHAR(32) PRIMARY KEY,
    name VARCHAR(32) NOT NULL,
    code VARCHAR(32) NOT NULL,
    description VARCHAR(32),
    type VARCHAR(32) NOT NULL,
    web_url VARCHAR(64) NOT NULL,
    api_url VARCHAR(64) NOT NULL,
    dashboard_type VARCHAR(8)
);

COMMENT ON COLUMN eas_work_widget.name IS 'widget 名称';
COMMENT ON COLUMN eas_work_widget.code IS 'widget 编码';
COMMENT ON COLUMN eas_work_widget.description IS '描述';
COMMENT ON COLUMN eas_work_widget.type IS 'protal、project、postin';
COMMENT ON COLUMN eas_work_widget.web_url IS 'widget 的页面跳转 URL';
COMMENT ON COLUMN eas_work_widget.api_url IS 'widget 的接口 URL';
COMMENT ON COLUMN eas_work_widget.dashboard_type IS 'right、left 或者 normal';



-- @dsm.cmd.id="1002"
-- CREATE TABLE eas_work_widget_layout(
--        id VARCHAR(32) PRIMARY KEY,
--        right_dashboard LONGTEXT COMMENT '右侧面板的widget数据字符型数组',
--        left_dashboard LONGTEXT COMMENT '左侧侧面板的widget数据字符型数组'
-- );

CREATE TABLE eas_work_widget_layout(
    id VARCHAR(32) PRIMARY KEY,
    right_dashboard TEXT,
    left_dashboard TEXT
);

COMMENT ON COLUMN eas_work_widget_layout.right_dashboard IS '右侧面板的 widget 数据字符型数组';
COMMENT ON COLUMN eas_work_widget_layout.left_dashboard IS '左侧面板的 widget 数据字符型数组';