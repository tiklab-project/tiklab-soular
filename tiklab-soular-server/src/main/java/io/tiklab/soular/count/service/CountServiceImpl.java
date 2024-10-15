package io.tiklab.soular.count.service;

import io.tiklab.soular.count.CountService;
import io.tiklab.licence.appauth.service.ApplyAuthService;
import io.tiklab.licence.licence.model.Version;
import io.tiklab.licence.licence.service.VersionService;
import io.tiklab.message.message.service.MessageNoticeService;
import io.tiklab.message.setting.service.MessageSendTypeService;
import io.tiklab.privilege.role.service.RoleService;
import io.tiklab.security.backups.service.BackupsDbService;
import io.tiklab.user.directory.service.UserDirService;
import io.tiklab.user.orga.service.OrgaService;
import io.tiklab.user.user.service.UserService;
import io.tiklab.user.usergroup.service.UserGroupService;
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























