package io.thoughtware.eas.count.service;

import io.thoughtware.eas.count.CountService;
import io.thoughtware.licence.appauth.service.ApplyAuthService;
import io.thoughtware.licence.licence.model.Version;
import io.thoughtware.licence.licence.service.VersionService;
import io.thoughtware.message.message.service.MessageNoticeService;
import io.thoughtware.message.setting.service.MessageSendTypeService;
import io.thoughtware.privilege.role.service.RoleService;
import io.thoughtware.security.backups.service.BackupsDbService;
import io.thoughtware.user.directory.service.UserDirService;
import io.thoughtware.user.orga.service.OrgaService;
import io.thoughtware.user.user.service.UserService;
import io.thoughtware.user.usergroup.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CountServiceImpl implements CountService {


    @Autowired
    UserService userService;

    @Autowired
    OrgaService orgaService;

    @Autowired
    UserDirService userDirService;

    @Autowired
    UserGroupService userGroupService;

    @Autowired
    RoleService roleService;

    @Autowired
    MessageNoticeService noticeService;

    @Autowired
    MessageSendTypeService sendTypeService;

    // @Autowired
    // PluginManagerService pluginManagerService;

    @Autowired
    VersionService versionService;

    @Autowired
    ApplyAuthService applyAuthService;

    @Autowired
    BackupsDbService backupsDbService;

    public Map<String, Object> findCount(){

        Map<String,Object> map = new HashMap<>();

        Integer userNumber = userService.findUserNumber();
        map.put("userNumber",userNumber);

        Integer orgaNumber = orgaService.findOrgaNumber();
        map.put("orgaNumber",orgaNumber);

        Integer userDirNumber = userDirService.findUserDirNumber();
        map.put("userDirNumber",userDirNumber);

        Integer userGroupNumber = userGroupService.findUserGroupNumber();
        map.put("userGroupNumber",userGroupNumber);

        Integer roleNumber = roleService.findRoleNumber();
        map.put("roleNumber",roleNumber);

        Integer noticeNumber = noticeService.findNoticeNumber("eas");
        map.put("noticeNumber",noticeNumber);

        Integer sendTypeNumber = sendTypeService.findSendTypeNumber();
        map.put("sendTypeNumber",sendTypeNumber);

        Version version = versionService.getVersion();
        map.put("version",version.getExpired());

        Integer applyAuthNumber = applyAuthService.findApplyAuthNumber();
        map.put("applyAuthNumber",applyAuthNumber);

        String lastBackupsTime = backupsDbService.findLastBackupsTime();
        map.put("lastBackupsTime",lastBackupsTime);

        return map;
    }



}























