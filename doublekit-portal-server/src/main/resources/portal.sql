CREATE TABLE tool_work_app_link(
        id VARCHAR(32) PRIMARY KEY,
        app_type VARCHAR(32) NOT NULL,
        grouper VARCHAR(32) NOT NULL,
        icon_url VARCHAR(256),
        app_url VARCHAR(256) NOT NULL,
        sort int
);