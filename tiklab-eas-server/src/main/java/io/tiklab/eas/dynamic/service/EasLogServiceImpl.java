package io.tiklab.eas.dynamic.service;

import com.alibaba.fastjson.JSONObject;
import io.tiklab.eam.common.context.LoginContext;
import io.tiklab.eas.dynamic.service.EasLogService;
import io.tiklab.message.message.model.Message;
import io.tiklab.message.message.model.MessageReceiver;
import io.tiklab.message.message.service.SendMessageNoticeService;
import io.tiklab.message.message.service.SingleSendMessageService;
import io.tiklab.message.setting.model.MessageType;
import io.tiklab.security.logging.model.Logging;
import io.tiklab.security.logging.model.LoggingType;
import io.tiklab.security.logging.service.LoggingByTemplService;
import io.tiklab.user.user.model.User;
import io.tiklab.user.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class EasLogServiceImpl implements EasLogService {

    @Autowired
    UserService userService;

    @Autowired
    SingleSendMessageService sendMessage;

    @Autowired
    LoggingByTemplService logService;

    @Autowired
    SendMessageNoticeService dispatchNoticeService;


    @Value("${base.url:null}")
    String baseUrl;


    /**
     * 创建日志
     * @param logType 日志类型
     * @param templateId 模板code
     * @param map 日志信息
     */
    @Override
    public void log(String logType, String templateId, HashMap<String, Object> map){

        Logging log = new Logging();

        //消息类型
        LoggingType opLogType = new LoggingType();
        opLogType.setId(logType);
        log.setActionType(opLogType);
        String[] s = templateId.split("_");
        map.put("img","pip_config.svg");
        map.put("title","流水线");

        log.setModule(s[s.length-1]);

        log.setLoggingTemplateId(templateId);
        log.setCreateTime(new Timestamp(System.currentTimeMillis()));

        //用户信息
        String userId = LoginContext.getLoginId();
        User user = userService.findOne(userId);
        log.setUser(user);
        log.setBaseUrl(baseUrl);
        log.setBgroup("eas");
        log.setContent(JSONObject.toJSONString(map));

        logService.createLog(log);

    }


    /**
     * 发送消息（站内信）
     * @param receiver 接收信息
     * @param map 信息
     */
    @Override
    public void message(HashMap<String, Object> map, List<String> receiver){

        Message message = new Message();

        String sendWay = (String)map.get("sendWay");
        String mesType = (String)map.get("mesType");

        //消息类型
        MessageType messageType = new MessageType();
        messageType.setId(mesType);

        message.setMessageType(messageType);
        //发送方式
        message.setMessageSendTypeId(sendWay);
        message.setData(map);
        message.setBaseUrl(baseUrl);

        List<MessageReceiver> list = new ArrayList<>();
        for (String s : receiver) {
            MessageReceiver messageReceiver = new MessageReceiver();
            messageReceiver.setUserId(s);
            messageReceiver.setPhone(s);
            messageReceiver.setEmail(s);
            list.add(messageReceiver);
        }
        message.setMessageReceiverList(list);

        sendMessage.sendMessage(message);
    }


}
