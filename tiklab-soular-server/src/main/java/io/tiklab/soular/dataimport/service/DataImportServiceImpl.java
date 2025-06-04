package io.tiklab.soular.dataimport.service;

import io.tiklab.core.exception.ApplicationException;
import io.tiklab.core.exception.SystemException;
import io.tiklab.dal.jpa.annotation.Column;
import io.tiklab.dal.jpa.annotation.Entity;
import io.tiklab.dal.jpa.annotation.Table;
import io.tiklab.soular.dataimport.model.ImportDatabase;
import io.tiklab.soular.dataimport.model.ImportDateMessage;
import io.tiklab.licence.licence.service.VersionService;
import io.tiklab.message.message.model.MessageItem;
import io.tiklab.message.message.service.MessageItemService;
import io.tiklab.security.logging.logging.model.Logging;
import io.tiklab.security.logging.logging.service.LoggingService;
import io.tiklab.todotask.todo.model.Task;
import io.tiklab.todotask.todo.service.TaskService;
import io.tiklab.toolkit.beans.BeanMapper;
import io.tiklab.toolkit.beans.annotation.Mapper;
import io.tiklab.toolkit.resource.AnnotationResourceResolver;
import io.tiklab.user.directory.service.LdapDirCfgService;
import io.tiklab.user.directory.service.WeChatCfgService;
import io.tiklab.user.dmUser.service.UserRoleService;
import io.tiklab.user.orga.model.Orga;
import io.tiklab.user.orga.model.OrgaUser;
import io.tiklab.user.orga.service.OrgaService;
import io.tiklab.user.orga.service.OrgaUserService;
import io.tiklab.user.user.model.User;
import io.tiklab.user.user.model.UserQuery;
import io.tiklab.user.user.service.UserService;
import io.tiklab.user.usergroup.modal.UserGroup;
import io.tiklab.user.usergroup.modal.UserGroupUser;
import io.tiklab.user.usergroup.service.UserGroupService;
import io.tiklab.user.usergroup.service.UserGroupUserService;
import io.tiklab.user.util.util.CodeFinal;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 数据导入服务实现
 * @author admin
 */

@Service
public class DataImportServiceImpl implements DataImportService {

    private static final Logger logger = LoggerFactory.getLogger(DataImportServiceImpl.class);

    @Autowired
    UserService userService;


    @Autowired
    MessageItemService messageItemService;

    @Autowired
    LoggingService opLogService;

    @Autowired(required = false)
    TaskService taskService;

    @Autowired
    UserGroupService userGroupService;

    @Autowired
    UserGroupUserService userGroupUserService;

    @Autowired
    OrgaService orgaService;

    @Autowired
    OrgaUserService orgaUserService;

    @Autowired
    VersionService versionServer;

    @Autowired
    UserRoleService userRoleService;

    @Autowired(required = false)
    WeChatCfgService weChatCfgService;

    @Autowired(required = false)
    LdapDirCfgService ldapDirCfgService;

    @Autowired
    PlatformTransactionManager transactionManager;

    @Autowired
    JdbcTemplate jdbcTemplate;

    private Map<String,DriverManagerDataSource> dataSourceMap = new HashMap<>();

    // 状态
    private Boolean runState = false ;

    private Integer speed = 1;

    private String message;

    private ImportDatabase database;

    public ImportDatabase getDatabase() {
        return database;
    }

    public void setDatabase(ImportDatabase database) {
        this.database = database;
    }

    public Boolean getRunState() {
        return runState;
    }

    public void setRunState(Boolean runState) {
        this.runState = runState;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void dataImport(ImportDatabase database) {
        TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
        new Thread(() -> {
            transactionTemplate.execute(status -> {
                setRunState(true);
                setDatabase(database);
                setMessage(null);
                try {
                    updateMessage(1,"连接数据库...");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    findPostgresql(database);
                    updateMessage(5,"数据库连接建立完成");

                    logger.info("开始同步数据...");
                    sync(database);
                    logger.info("数据同步完成。");
                    updateMessage(100,"数据同步完成。");

                    dataSourceMap = new HashMap<>();

                } catch (Throwable throwable) {
                    String eMessage = throwable.getMessage();
                    logger.error("同步失败,回滚数据:{}", eMessage);
                    status.setRollbackOnly(); // 回滚事务
                    updateMessage(getSpeed(),eMessage);
                    dataSourceMap = new HashMap<>();
                    setRunState(false);
                }
                setRunState(false);
                return null;
            });
        }).start();
    }

    @Override
    public ImportDateMessage findImportMessage(){
        ImportDateMessage message = new ImportDateMessage();
        message.setState(getRunState());
        message.setSpeed(getSpeed());
        message.setMessage(getMessage());
        message.setDatabase(getDatabase());
        return message;
    }

    /**
     * 同步数据
     * @param database 数据库信息
     */
    private void sync(ImportDatabase database){

        updateMessage(10,"开始同步用户数据...");
        syncUserData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(15,"用户同步完成。");

        updateMessage(20,"开始同步消息数据...");
        syncMessageData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(30,"消息同步完成。");


        updateMessage(35,"开始同步日志数据...");
        syncOplogData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(50,"日志同步完成。");

        updateMessage(55,"开始同步待办数据...");
        syncTodoDaskData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(60,"待办同步完成。");


        updateMessage(65,"开始同步用户组数据...");
        syncUserGroupData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(75,"用户组同步完成。");

        updateMessage(77,"开始同步用户组用户数据...");
        syncUserGroupUserData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(80,"用户组用户同步完成。");

        updateMessage(83,"开始同步组织数据...");
        syncOrgaData(database);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        updateMessage(85,"组织同步完成。");

        updateMessage(90,"开始同步组织用户数据...");
        syncOrgaUserData(database);
        updateMessage(99,"组织用户同步完成。");

        // updateMessage(1,"开始同步微信配置...");
        // syncWeChatCfgData(database);
        //
        // updateMessage(1,"开始同步Ldap配置...");
        // syncLdapCfgData(database);
    }

    private void updateMessage(int seep,String message){
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String data =  "[" + format + "]" + "  ";
        setSpeed(seep);
        if (Objects.isNull(getMessage())){
            setMessage(data + message);
        }else {
            setMessage( getMessage() +"\n" + data + message);
        }
    }

    /**
     * 获取user需要导入的数据
     * @param database 数据信息
     */
    private void syncUserData(ImportDatabase database){

        List<User> userList = findImportData(database, User.class);
        if (userList.isEmpty()){
            return;
        }

        updateMessage(getSpeed(),"同步用户数："+ userList.size());

        for (User user : userList) {
            String id = user.getId();
            if (CodeFinal.ROOT_ID_CODE.equals(id)){
                continue;
            }
            User user1 = userService.findUser(id);
            if (!Objects.isNull(user1)){
                continue;
            }
            UserQuery userQuery = new UserQuery();
            userQuery.setName(user.getName());
            List<User> userList1 = userService.findUserList(userQuery);
            if (!userList1.isEmpty()){
                continue;
            }
            logger.info("同步用户：{}", user.getName());

            Boolean importData = createImportData(user);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
            updateMessage(getSpeed(),"添加授权："+user.getName());
            userRoleService.createSystemDefaultRoles(user.getId());
        }

    }

    /**
     * 获取消息需要导入的数据
     * @param database 数据库信息
     */
    private void syncMessageData(ImportDatabase database){

        List<MessageItem> messageItemList = findImportData(database, MessageItem.class);

        if (messageItemList.isEmpty()){
            return ;
        }
        updateMessage(getSpeed(),"同步消息数:" + messageItemList.size());
        for (MessageItem messageItem : messageItemList) {
            String id = messageItem.getId();
            try {
                MessageItem  messageDispatchItem = messageItemService.findMessageDispatchItem(id);
                if (!Objects.isNull(messageDispatchItem)){
                    continue;
                }
            } catch (Exception e) {
                continue;
            }
            logger.info("同步message:" + messageItem.getId());
            Boolean importData = createImportData(messageItem);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }
    }

    /**
     * 获取日志需要导入的数据
     * @param database 数据库信息
     */
    private void syncOplogData(ImportDatabase database){

        List<Logging> loggingList = findImportData(database, Logging.class);

        if (loggingList.isEmpty()){
            return ;
        }
        updateMessage(getSpeed(), "同步日志数:"+loggingList.size());
        for (Logging logging : loggingList) {
            String id = logging.getId();
            try {
                Logging oneLog = opLogService.findOne(id);
                if (!Objects.isNull(oneLog)){
                    continue;
                }
            } catch (Exception e) {
                continue;
            }
            logger.info("同步日志:"+logging.getId());
            Boolean importData = createImportData(logging);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }

    }

    /**
     * 获取待办需要同步的数据
     * @param database 数据库信息
     */
    private void syncTodoDaskData(ImportDatabase database){

        List<Task> taskList = findImportData(database, Task.class);
        if (taskList.isEmpty()){
            return ;
        }
        updateMessage(getSpeed(), "同步待办数:"+taskList.size());
        for (Task task : taskList) {
            String id = task.getId();
            Task oneTask = taskService.findOne(id);
            if (!Objects.isNull(oneTask)){
                continue;
            }
            logger.info("同步待办:" + task.getId());
            Boolean importData = createImportData(task);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }
    }

    /**
     * 获取用户组需要同步的数据
     * @param database 数据信息
     */
    private void syncUserGroupData(ImportDatabase database){

        List<UserGroup> userGroupList = findImportData(database, UserGroup.class);
        if (userGroupList.isEmpty()){
            return;
        }
        updateMessage(getSpeed(), "同步用户组数:" + userGroupList.size());
        for (UserGroup userGroup : userGroupList) {
            String id = userGroup.getId();
            UserGroup oneUserGroup = userGroupService.findOne(id);
            if (!Objects.isNull(oneUserGroup)){
                continue;
            }
            Boolean importData = createImportData(userGroup);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }
    }

    /**
     * 获取用户组用户需要同步的数据
     * @param database 数据信息
     */
    private void syncUserGroupUserData(ImportDatabase database){
        List<UserGroupUser> userGroupUserList = findImportData(database, UserGroupUser.class);
        if (userGroupUserList.isEmpty()){
            return ;
        }
        updateMessage(getSpeed(), "同步用户组数:" + userGroupUserList.size());
        for (UserGroupUser userGroupUser : userGroupUserList) {
            String id = userGroupUser.getId();
            UserGroupUser oneUserGroup = userGroupUserService.findOne(id);
            if (!Objects.isNull(oneUserGroup)){
                continue;
            }
            logger.info("同步用户组用户:" + id);
            Boolean importData = createImportData(userGroupUser);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }
    }

    /**
     * 获取部门需要同步的数据
     * @param database 数据信息
     */
    private void syncOrgaData(ImportDatabase database){

        List<Orga> orgaList = findImportData(database, Orga.class);
        if (orgaList.isEmpty()){
            return;
        }
        updateMessage(getSpeed(), "同步部门数:" + orgaList.size());
        for (Orga orga : orgaList) {
            String id = orga.getOrgaId();
            Orga oneOrga = orgaService.findOne(id);
            if (!Objects.isNull(oneOrga)){
                continue;
            }
            logger.info("同步部门:" + id);
            Boolean importData = createImportData(orga);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }

    }

    /**
     * 获取部门用户需要同步的数据
     * @param database 数据信息
     */
    private void syncOrgaUserData(ImportDatabase database){

        List<OrgaUser> orgaUserList = findImportData(database, OrgaUser.class);
        if (orgaUserList.isEmpty()){
            return;
        }
        updateMessage(getSpeed(), "同步部门用户数:" + orgaUserList.size());
        for (OrgaUser orgaUser : orgaUserList) {
            String id = orgaUser.getId();
            OrgaUser oneOrga = orgaUserService.findUserOrga(id);
            if (!Objects.isNull(oneOrga)){
                continue;
            }
            Boolean importData = createImportData(orgaUser);
            if (!importData){
                throw new SystemException("数据插入失败！");
            }
        }
    }

    /**
     * 获取实体对应的数据
     * @param database 数据库信息
     * @param modelClass 实体类
     * @return 数据集合
     * @param <T> 数据类型
     */
    private <T> List<T> findImportData(ImportDatabase database, Class<T> modelClass){
        // 获取实体类信息
        Mapper mapper = modelClass.getAnnotation(Mapper.class);
        String entityName =  mapper.targetAlias();

        if (StringUtils.isEmpty(entityName)){
            entityName = modelClass.getSimpleName()+"Entity";
        }

        Class<?> entityClass = findEntityClass(entityName);
        if (Objects.isNull(entityClass)){
            logger.error("获取模型对应实体失败：{}", modelClass.getName());
            throw new SystemException("获取模型对应实体失败：" + entityName);
        }

        // 获取数据库连接信息
        DriverManagerDataSource dataSource = findPostgresql(database);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Table table = entityClass.getAnnotation(Table.class);
        String tableName = table.name();

        String sql = "SELECT * FROM "+" "+ tableName;

        List<T> entityList ;

        try {
            entityList = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance((Class<T>)entityClass));
        }catch (Exception e){
            String message = e.getMessage();
            logger.info("error message:{}", message);
            dataSourceMap.remove(database.getApplication());

            throw new SystemException("执行查询数据库信息失败！"+e.getMessage());
        }

        if (entityList.isEmpty()){
            return Collections.emptyList();
        }

        return  BeanMapper.mapList(entityList, modelClass);
    }

    /**
     * 插入表数据
     * @param modelObject 数据信息
     * @return 是否插入成功
     * @param <T> 类型
     */
    private <T> Boolean createImportData(Object modelObject){

        // 获取实体类信息
        Class<?> modelClass = modelObject.getClass();
        Mapper mapper = modelClass.getAnnotation(Mapper.class);
        String entityName =  mapper.targetAlias();

        if (StringUtils.isEmpty(entityName)){
            entityName = modelClass.getSimpleName()+"Entity";
        }

        Class<?> entityClass = findEntityClass(entityName);
        if (Objects.isNull(entityClass)){
            throw new SystemException("获取模型对应实体失败：" + entityName);
        }

        Object entityObject = BeanMapper.map(modelObject, entityClass);

        Table table = entityClass.getAnnotation(Table.class);
        String tableName = table.name();

        Field[] fields = entityClass.getDeclaredFields();
        int length = fields.length;

        StringBuilder columns = new StringBuilder();
        Object[] params = new Object[length];
        int i = 0;
        for (Field field : fields) {

            boolean annotationPresent = field.isAnnotationPresent(Column.class);
            if (!annotationPresent){
                continue;
            }

            field.setAccessible(true);
            Column column = field.getAnnotation(Column.class);
            String columnName = column.name();

            columns.append(columnName).append(",");
            try {
                Object o = field.get(entityObject);
                params[i] = o;
            } catch (IllegalAccessException e) {
                throw new ApplicationException("获取字段值错误："+e);
            }
            i++;
        }
        String string = columns.toString();
        String substring = string.substring(0, string.length() - 1);

        // 构建插入语句
        String sql = "INSERT INTO " +
                tableName + "(" + substring + ") " +
                " VALUES (" + "?" + ",?".repeat(Math.max(0, length - 1)) + ")";
        logger.info("sql:"+sql+"     params:"+ Arrays.toString(params));

        updateMessage(getSpeed(), sql);
        updateMessage(getSpeed(), Arrays.toString(params));
        int update = jdbcTemplate.update(sql, params);
        return update > 0;
    }

    /**
     * 创建pgsql连接
     * @param database 连接信息
     * @return 数据库连接
     */
    private DriverManagerDataSource createDatabase(ImportDatabase database){

        String application = database.getApplication();
        String url = database.getUrl();
        // jdbc:postgresql://172.10.1.10:5432/tiklab_matflow?currentSchema=tiklab_matflow&stringtype=unspecified
        if (!url.contains("stringtype=unspecified")){
            if (url.contains("?")){
                url = url + "&stringtype=unspecified";
            }else {
                url = url + "?stringtype=unspecified";
            }
        }

        logger.info("创建数据库连接：{}", url);

        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        dataSource.setDriverClassName(database.getDriverClassName());
        dataSource.setUrl(url);

        String username = database.getUsername();
        if (StringUtils.isEmpty(username)) {
            username = "postgres";
        }
        String password = database.getPassword();
        if (StringUtils.isEmpty(password)) {
            password = "darth2020";
        }
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSourceMap.put(application,dataSource);

        try {
            dataSource.getConnection();
        } catch (SQLException e) {
            String message= e.getMessage();
            logger.error("message:"+message);
            dataSourceMap.remove(application);
            if(message.contains("password authentication failed for user")){
                throw new ApplicationException("无法连接到数据库，数据库用户名或密码错误！");
            }
            if (message.contains("Unable to parse URL ")|| message.contains("尝试连线已失败 ")
                    || message.contains("Check that the hostname and port are correct ")){
                throw new ApplicationException("无法连接到数据库，数据库地址或端口配置错误！");
            }
            throw new SystemException(e.getMessage());
        }

        return dataSource;
    }

    /**
     * 获取数据库连接信息
     * @param database 连接信息
     * @return 连接信息
     */
    private DriverManagerDataSource findPostgresql(ImportDatabase database){
        DriverManagerDataSource dataSource = dataSourceMap.get(database.getApplication());
        if (!Objects.isNull(dataSource)){
            return dataSource;
        }
        return createDatabase(database);
    }

    // 实体名称 --》实体类
    private final Map<String,Class<?>> classMap = new HashMap<>();

    /**
     * 获取所有实体类
     */
    private void findSetClass(){
        logger.info("加载实体类信息...");
        String basePackage = "io.tiklab";
        Set<Class> classSets = AnnotationResourceResolver.resolve(basePackage, Entity.class);
        if(!classSets.isEmpty()){
            for(Class<?> cls:classSets){
                String name = cls.getName();
                String[] split = name.split("\\.");
                String s = split[split.length - 1];
                classMap.put(s,cls);
            }
        }
    }

    /**
     * 获取实体类
     * @param entityName 实体类名称
     * @return 实体类
     */
    private Class<?> findEntityClass(String entityName){
        Class<?> aClass = classMap.get(entityName);

        if (!Objects.isNull(aClass)){
            return aClass;
        }
        findSetClass();
        Class<?> entityClass = classMap.get(entityName);

        if (Objects.isNull(entityClass)){
            return null;
        }

        return entityClass;
    }





}
