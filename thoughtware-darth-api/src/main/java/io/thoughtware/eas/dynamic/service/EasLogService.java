package io.thoughtware.eas.dynamic.service;

import java.util.HashMap;
import java.util.List;

public interface EasLogService {

    /**
     * 发送消息
     * @param logType 消息类型
     * @param templateId 模版id
     * @param map 消息类型
     */
    void log(String logType, String templateId, HashMap<String, Object> map);

    /**
     * 发送消息（站内信）
     * @param receiver 接收信息
     * @param map 信息
     */
    void message(HashMap<String, Object> map, List<String> receiver);


}
