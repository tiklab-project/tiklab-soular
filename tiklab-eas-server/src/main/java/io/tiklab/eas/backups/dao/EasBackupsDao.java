package io.tiklab.eas.backups.dao;

import io.tiklab.beans.BeanMapper;
import io.tiklab.dal.jpa.JpaTemplate;
import io.tiklab.dal.jpa.criterial.condition.QueryCondition;
import io.tiklab.dal.jpa.criterial.conditionbuilder.QueryBuilders;
import io.tiklab.eas.backups.entity.EasBackupsEntity;
import io.tiklab.eas.backups.model.Backups;
import io.tiklab.eas.backups.model.BackupsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Repository
public class EasBackupsDao {

    @Autowired
    JpaTemplate jpaTemplate;

    public String createBackups(Backups backups){
        EasBackupsEntity easBackupsEntity = BeanMapper.map(backups, EasBackupsEntity.class);
        return jpaTemplate.save(easBackupsEntity, String.class);
    }

    public void updateBackups(Backups backups){
        EasBackupsEntity easBackupsEntity = BeanMapper.map(backups, EasBackupsEntity.class);
         jpaTemplate.update(easBackupsEntity);
    }

    public void deleteBackups(String backupsId){
        jpaTemplate.delete(EasBackupsEntity.class,backupsId);
    }


    public Backups findBackups(String backupsId){
        EasBackupsEntity backupsEntity = jpaTemplate.findOne(EasBackupsEntity.class, backupsId);
        return BeanMapper.map(backupsEntity, Backups.class);
    }


    public List<Backups> findAllBackups(){
        List<EasBackupsEntity> backupsEntityList = jpaTemplate.findAll(EasBackupsEntity.class);
        if (backupsEntityList == null || backupsEntityList.isEmpty()){
            return Collections.emptyList();
        }
        return BeanMapper.mapList(backupsEntityList, Backups.class);
    }


    public List<Backups> findBackupsList (BackupsQuery backupsQuery) {
        QueryCondition queryCondition = QueryBuilders.createQuery(EasBackupsEntity.class)
                .eq("type", backupsQuery.getType())
                .orders(backupsQuery.getOrderParams())
                .get();
        List<EasBackupsEntity> easBackupsEntities = jpaTemplate.findList(queryCondition, EasBackupsEntity.class);
        if (Objects.isNull(easBackupsEntities) || easBackupsEntities.isEmpty()){
            return Collections.emptyList();
        }
        return BeanMapper.mapList(easBackupsEntities, Backups.class);
    }

}




















