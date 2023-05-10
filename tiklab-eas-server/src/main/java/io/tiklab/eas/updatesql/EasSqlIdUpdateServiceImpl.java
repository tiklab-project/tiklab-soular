package io.tiklab.eas.updatesql;


import io.tiklab.dal.jpa.annotation.Column;
import io.tiklab.dal.jpa.annotation.Id;
import io.tiklab.dal.jpa.annotation.Table;
import io.tiklab.user.user.model.User;
import io.tiklab.user.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
public class EasSqlIdUpdateServiceImpl {

    @Autowired
    private UserService userService;


    public void updateSqlUuid(){

        List<User> allUser = userService.findAllUser();




    }

    private void updateId(Class<?> tclass,String sourceId,String trgerId){
        Table table = tclass.getAnnotation(Table.class);
        String entityName = table.name();
        Field[] declaredFields = tclass.getDeclaredFields();
        // 字段名称
        String name = null;
        // 数据库字段名称
        String idName = null;
        for (Field field : declaredFields) {
            boolean idAnnotation = field.isAnnotationPresent(Id.class);
            if (!idAnnotation){
                continue;
            }
            name = field.getName();
            Column column = field.getAnnotation(Column.class);
            idName = column.name();
        }

        String sql = "update " +" "+ entityName + " set" + " "+idName +" = " + trgerId +" where" + idName +" = "+ sourceId;

        System.out.println(sql);
    }

    private void updateUserId(){

    }






}































