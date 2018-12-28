package com.panyu.panyuprojectims.service.Impl;

import com.panyu.panyuprojectims.dao.MachineRoomDao;
import com.panyu.panyuprojectims.entity.MachineRoom;
import com.panyu.panyuprojectims.service.MachineRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MachineRoomServiceImpl implements MachineRoomService{
    @Autowired
    private MachineRoomDao machineRoomDao;


    //添加
    @Override
    public boolean insertMachineRoom(String machineRoomId, String machineRoomConstructionMode, String machineRoomTypeName, String machineRoomConstructionName, String civilEngineeringContacts, String machineRoomDecorateName, String decorationUnitContacts) {
        boolean flag = true;
        if(machineRoomId != null){
            int i = machineRoomDao.insertMachineRoom(machineRoomId,machineRoomConstructionMode,machineRoomTypeName,machineRoomConstructionName,civilEngineeringContacts,machineRoomDecorateName,decorationUnitContacts);
            if(i > 0){
                flag = true;
            }else {
                flag = false;
            }
        }else {
            return flag;
        }
        return flag;
    }


    @Override
    public boolean deleteMachineRoomById(String machineRoomId){
        boolean flag = true;
        int i = machineRoomDao.deleteMachineRoomById(machineRoomId);
        if (i>0){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

//查询机房ID
    @Override
    public List<MachineRoom> selectBymachineRoomId() {
        return machineRoomDao.selectBymachineRoomId();
    }
//根据机房ID查询建设方式、机房类型
    @Override
    public MachineRoom SelectByMachineRoomId(String machineRoomId) {
        return machineRoomDao.SelectByMachineRoomId(machineRoomId);
    }
}