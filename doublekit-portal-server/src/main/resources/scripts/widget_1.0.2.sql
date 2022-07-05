
alter table work_widget_layout DROP COLUMN layout;

alter table work_widget_layout add right_dashboard LONGTEXT COMMENT '右侧面板的widget数据字符型数组';
alter table work_widget_layout add left_dashboard LONGTEXT COMMENT '左侧侧面板的widget数据字符型数组';

alter table work_widget add dashboard_type VARCHAR(8) COMMENT 'right、left或者 normal';
