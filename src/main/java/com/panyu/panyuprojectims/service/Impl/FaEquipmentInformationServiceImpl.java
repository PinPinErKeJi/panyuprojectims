package com.panyu.panyuprojectims.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.panyu.panyuprojectims.dao.*;
import com.panyu.panyuprojectims.entity.*;
import com.panyu.panyuprojectims.service.FaEquipmentInformationService;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class FaEquipmentInformationServiceImpl implements FaEquipmentInformationService{
    @Autowired
    private FaEquipmentInformationDao faEquipmentInformationDao;
    @Autowired
    private FaCabinetPowerFrameDao faCabinetPowerFrameDao;
    @Autowired
    private FaBoardcardDilatationDao faBoardcardDilatationDao;
    @Autowired
    private FaPowerNetworkLineDao faPowerNetworkLineDao;
    @Autowired
    private FaPigtailSkipFiberDao faPigtailSkipFiberDao;
    @Autowired
    private FaWalkingFrameDao faWalkingFrameDao;
    @Autowired
    private FaFiberOpticChannelDao faFiberOpticChannelDao;
    @Autowired
    private EquipmentSpecialityDao equipmentSpecialityDao;

    @Override
    public PageHelperUtil selectFaEquipmentInformation(
            int page, int rows,
            String province,
            String city,
            String county,
            String buildYear,
            String buildingProject,
            String operator,
            String onSiteSupervision,
            String projectLeader) {
        int start = (page-1)*rows+1;
        int end = page*rows;

        if (province !=null && !province.equals("")){
            province = "%"+province+"%";
        }else {
            province = null;
        }
        if (city !=null && !city.equals("")){
            city = "%"+city+"%";
        }else {
            city = null;
        }
        if (county !=null && !county.equals("")){
            county = "%"+county+"%";
        }else {
            county = null;
        }
        if (buildYear !=null && !buildYear.equals("")){
            buildYear = "%"+buildYear+"%";
        }else {
            buildYear = null;
        }
        if (buildingProject !=null && !buildingProject.equals("")){
            buildingProject = "%"+buildingProject+"%";
        }else {
            buildingProject = null;
        }
        if (operator !=null && !operator.equals("")){
            operator = "%"+operator+"%";
        }else {
            operator = null;
        }
        if (onSiteSupervision !=null && !onSiteSupervision.equals("")){
            onSiteSupervision = "%"+onSiteSupervision+"%";
        }else {
            onSiteSupervision = null;
        }
        if (projectLeader !=null && !projectLeader.equals("")){
            projectLeader = "%"+projectLeader+"%";
        }else {
            projectLeader = null;
        }
        //分页处理
        PageHelper.startPage(start,rows);
        List<FaEquipmentInformation> faEquipmentInformationList = faEquipmentInformationDao.selectFaEquipmentInformation(page,rows, province, city, county, buildYear, buildingProject, operator, onSiteSupervision,
                 projectLeader);
        //创建一个返回值对象
        PageHelperUtil pageHelperUtil = new PageHelperUtil();
        pageHelperUtil.setRows(faEquipmentInformationList);
        //设置返回总记录数
        PageInfo<FaEquipmentInformation> info = new PageInfo<FaEquipmentInformation>(faEquipmentInformationList);
        pageHelperUtil.setTotal(faEquipmentInformationDao.getFaEquipmentInformationRowCount(province,city,county,buildYear,buildingProject,operator, onSiteSupervision,
                 projectLeader));
        return pageHelperUtil;
    }

    @Override
    public FaEquipmentInformation selectFaEquipmentInformationById(String id){
        return faEquipmentInformationDao.selectFaEquipmentInformationById(id);
    }

    //添加
    @Override
    public boolean insertFaEquipmentInformation(String equipmentInformationId,
                                                String operator,
                                                String buildYear,
                                                String buildingProject,
                                                String motorRoomName,
                                                String motorRoomLongitude,
                                                String motorRoomLatitude,
                                                String province,
                                                String city,
                                                String county,
                                                String onSiteSupervision,
                                                String projectLeader,
                                                String equipmentId,
                                                String boardCardDilatationId,
                                                String powerNetworkLineId,
                                                String pigtailSkipFiberId,
                                                String walkingFrameId,
                                                String fiberOpticChannelId){
        //经纬度数据处理
        //①
        int i11 = motorRoomLongitude.indexOf(".");
        //System.out.println("i1:"+i11);
        if(i11>0){
            String str = motorRoomLongitude.substring(i11);
            System.out.println("str1:"+str);
            int length = str.length();
            //System.out.println("length1:"+length);
            if(length>6){
                motorRoomLongitude = motorRoomLongitude.substring(0, i11+7);
                //System.out.println("大于6:"+motorRoomLongitude);
            }else {
                motorRoomLongitude = motorRoomLongitude.substring(0, i11+length);
                //System.out.println("小于6:"+motorRoomLongitude);
            }
        }else {
            motorRoomLongitude = motorRoomLongitude+".000000";
        }
        //②
        int i31 = motorRoomLatitude.indexOf(".");
        if(i31>0){
            String str = motorRoomLatitude.substring(i31);
            int length = str.length();
            if(length>6){
                motorRoomLatitude = motorRoomLatitude.substring(0, i31+7);
                System.out.println("大于6:"+motorRoomLatitude);
            }else {
                motorRoomLatitude = motorRoomLatitude.substring(0, i31 + length);
                //System.out.println("小于6:"+motorRoomLatitude);
            }
        }else {
            motorRoomLatitude = motorRoomLatitude+".000000";
        }


        equipmentInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();

        boolean flag = true;
        if(equipmentId !=null&&boardCardDilatationId !=null&&powerNetworkLineId !=null&&pigtailSkipFiberId !=null&&walkingFrameId !=null&&fiberOpticChannelId !=null){
            int i = faEquipmentInformationDao.insertFaEquipmentInformation(equipmentInformationId,
                    operator,
                    buildYear,
                    buildingProject,
                    motorRoomName,
                    motorRoomLongitude,
                    motorRoomLatitude,
                    province,
                    city,
                    county,
                    onSiteSupervision,
                    projectLeader,
                    equipmentId,
                    boardCardDilatationId,
                    powerNetworkLineId,
                    pigtailSkipFiberId,
                    walkingFrameId,
                    fiberOpticChannelId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据设备基本工程信息表字段的ID查询关联的其他表ID字段
    @Override
    public String selectFaCabinetPowerFrameIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaCabinetPowerFrameIdByEquipmentInformationId(equipmentInformationId);
    }

    @Override
    public String selectFaBoardcardDilatationIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaBoardcardDilatationIdByEquipmentInformationId(equipmentInformationId);
    }

    @Override
    public String selectFaPowerNetworkLineIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaPowerNetworkLineIdByEquipmentInformationId(equipmentInformationId);
    }

    @Override
    public String selectFaPigtailSkipFiberIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaPigtailSkipFiberIdByEquipmentInformationId(equipmentInformationId);
    }

    @Override
    public String selectFaWalkingFrameIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaWalkingFrameIdByEquipmentInformationId(equipmentInformationId);
    }

    @Override
    public String selectFaFiberOpticChannelIdByEquipmentInformationId(String equipmentInformationId) {
        return faEquipmentInformationDao.selectFaFiberOpticChannelIdByEquipmentInformationId(equipmentInformationId);
    }

    //根据设备基本工程信息表字段的ID删除选中项
    @Override
    public int deleteFaEquipmentInformationById(String equipmentInformationId){
        return faEquipmentInformationDao.deleteFaEquipmentInformationById(equipmentInformationId);
    }

    @Override
    public int updateFaEquipmentInformationById(FaEquipmentInformation enti){
        return faEquipmentInformationDao.updateFaEquipmentInformationById(enti);
    }

    //导出设备基本工程信息空Excel表格
    @Override
    public List<FaEquipmentInformation> FAExportEquipmentNullExcel() {
        return faEquipmentInformationDao.FAExportEquipmentNullExcel();
    }

    //导出设备基本工程信息Excel表格
    @Override
    public List<FaEquipmentInformation> FAExportEquipmentInfoExcel(String[] ids) {
        return faEquipmentInformationDao.FAExportEquipmentInfoExcel(ids);
    }
    //导入数据的添加
    @Override
    public boolean add(String fiberOpticChannelId, String fiberOpticNumber, String fiberOpticDesignLength,
                       String fiberOpticSupplier, String fiberOpticContacts, String pigtailSkipFiberId,
                       String pigtailNumber, String fiberCableType, String fiberSpecificationModel,
                       String fiberNumberOfBranches, String fiberSingleLength, String forms, String to2,
                       String fiberSupplier, String fiberContacts, String powerNetworkLineId, String powerNumber,
                       String cableType, String specificationModel, String numberOfBranches, String singleLength,
                       String totalLength, String froms, String to1, String powerSupplier, String powerContacts,
                       String walkingFrameId, String walkingNumber, String walkingDesignLength, String walkingFrameSupplier,
                       String walkingFrameContacts, String boardCardDilatationId, String boardCardNumber, String boardCardName,
                       String veneerFunction, String placeEquipment, String boardCardDesignQuantity, String boardCardSupplier,
                       String boardCardContacts, String equipmentId, String equipmentNumber, String equipmentType,
                       String equipmentName, String equipmentModel, String equipmentDesignQuantity, String equipmentSize,
                       String equipmentSupplier, String equipmentContacts, String equipmentInformationId, String operator,
                       String buildYear, String buildingProject, String motorRoomName, String motorRoomLongitude,
                       String motorRoomLatitude, String province, String city, String county, String onSiteSupervision,
                       String projectLeader) {
        //1.设备，机柜，电源柜，配线架表 -----》数据处理
        //设计数量----》数据处理
        int i11 = equipmentDesignQuantity.indexOf(".");
        if(i11>0){
            equipmentDesignQuantity = equipmentDesignQuantity.substring(0, i11);
        }else {
            equipmentDesignQuantity = equipmentDesignQuantity.substring(0);
        }
        //2.板卡扩容表-----》数据处理
        //设计数量
        int i2 = boardCardDesignQuantity.indexOf(".");
        if(i2>0){
            boardCardDesignQuantity = boardCardDesignQuantity.substring(0, i2);
        }else {
            boardCardDesignQuantity = boardCardDesignQuantity.substring(0);
        }
        //3.电源线,网线,2M线-----》数据处理
        int i31 = numberOfBranches.indexOf(".");
        if(i31>0){
            numberOfBranches = numberOfBranches.substring(0, i31);
        }else {
            numberOfBranches = numberOfBranches.substring(0);
        }
        //单挑长度数据处理
        int i32 = singleLength.indexOf(".");
        if(i32>0){
            String str = singleLength.substring(i32);
            int length = str.length();
            if(length>2){
                singleLength = singleLength.substring(0, i32+3);
                //System.out.println("大于2:"+singleLength);
            }else {
                singleLength = singleLength.substring(0, i32 + length);
                //System.out.println("小于2:"+singleLength);
            }
        }else {
            singleLength = singleLength+".00";
        }
        //总条数长度数据处理
        int i33 = totalLength.indexOf(".");
        if(i33>0){
            String str = totalLength.substring(i33);
            int length = str.length();
            if(length>2){
                totalLength = totalLength.substring(0, i33+3);
                //System.out.println("大于2:"+totalLength);
            }else {
                totalLength = totalLength.substring(0, i33 + length);
                //System.out.println("小于2:"+totalLength);
            }
        }else {
            totalLength = totalLength+".00";
        }

        //4.尾纤,跳纤-----》数据处理
        //条数数据处理
        int i41 = fiberNumberOfBranches.indexOf(".");
        if(i41>0){
            fiberNumberOfBranches = fiberNumberOfBranches.substring(0, i41);
        }else {
            fiberNumberOfBranches = fiberNumberOfBranches.substring(0);
        }
        //单条长度
        int i42 = fiberSingleLength.indexOf(".");
        if(i42>0){
            System.out.println("i42:"+i42);
            String str = fiberSingleLength.substring(i42);
            int length = str.length();
            if(length>2){
                fiberSingleLength = fiberSingleLength.substring(0, i42+3);
                //System.out.println("大于2:"+fiberSingleLength);
            }else {
                fiberSingleLength = fiberSingleLength.substring(0, i42+length);
                //System.out.println("小于2:"+fiberSingleLength);
            }
        }else {
            //System.out.println("i42**:"+i42);
            fiberSingleLength = fiberSingleLength+".00";
        }
        //5.走线架表-----》数据处理
        int i5 = walkingDesignLength.indexOf(".");
        if(i5>0){
            String str = walkingDesignLength.substring(i5);
            int length = str.length();
            if(length>2){
                walkingDesignLength = walkingDesignLength.substring(0, i5+3);
                System.out.println("大于2:"+walkingDesignLength);
            }else {
                walkingDesignLength = walkingDesignLength.substring(0, i5 + length);
                //System.out.println("小于2:"+walkingDesignLength);
            }
        }else {
            walkingDesignLength = walkingDesignLength+".00";
        }
        //6.光纤槽道-----》数据处理
        int i6 = fiberOpticDesignLength.indexOf(".");
        if(i6>0){
            String str = fiberOpticDesignLength.substring(i6);
            int length = str.length();
            if(length>2){
                fiberOpticDesignLength = fiberOpticDesignLength.substring(0, i6+3);
                //System.out.println("大于2:"+fiberOpticDesignLength);
            }else {
                fiberOpticDesignLength = fiberOpticDesignLength.substring(0, i6 + length);
                //System.out.println("小于2:"+fiberOpticDesignLength);
            }
        }else {
            fiberOpticDesignLength = fiberOpticDesignLength+".00";
        }
        //7.设备信息-----》经纬度数据处理
        //①
        int i71 = motorRoomLongitude.indexOf(".");
        //System.out.println("i1:"+i71);
        if(i71>0){
            String str = motorRoomLongitude.substring(i71);
            //System.out.println("str1:"+str);
            int length = str.length();
            System.out.println("length1:"+length);
            if(length>6){
                motorRoomLongitude = motorRoomLongitude.substring(0, i71+7);
                //System.out.println("大于6:"+motorRoomLongitude);
            }else {
                motorRoomLongitude = motorRoomLongitude.substring(0, i71+length);
                //System.out.println("小于6:"+motorRoomLongitude);
            }
        }else {
            motorRoomLongitude = motorRoomLongitude+".000000";
        }
        //②
        int i72 = motorRoomLatitude.indexOf(".");
        if(i72>0){
            String str = motorRoomLatitude.substring(i72);
            int length = str.length();
            if(length>6){
                motorRoomLatitude = motorRoomLatitude.substring(0, i72+7);
                //System.out.println("大于6:"+motorRoomLatitude);
            }else {
                motorRoomLatitude = motorRoomLatitude.substring(0, i72 + length);
                //System.out.println("小于6:"+motorRoomLatitude);
            }
        }else {
            motorRoomLatitude = motorRoomLatitude+".000000";
        }



        boolean flag = true;
        fiberOpticChannelId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        equipmentId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        boardCardDilatationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        powerNetworkLineId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        pigtailSkipFiberId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        walkingFrameId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        equipmentInformationId = UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        int i1 = faFiberOpticChannelDao.insertFaFiberOpticChannel(fiberOpticChannelId,
                fiberOpticNumber,
                fiberOpticDesignLength,
                fiberOpticSupplier,
                fiberOpticContacts);
        int i22 = faCabinetPowerFrameDao.insertFaCabinetPowerFrame(equipmentId,
                equipmentNumber,
                equipmentType,
                equipmentName,
                equipmentModel,
                equipmentDesignQuantity,
                equipmentSize,
                equipmentSupplier,
                equipmentContacts);
        int i3 = faBoardcardDilatationDao.insertFaBoardcardDilatation(boardCardDilatationId,
                boardCardNumber,
                boardCardName,
                veneerFunction,
                placeEquipment,
                boardCardDesignQuantity,
                boardCardSupplier,
                boardCardContacts);
        int i4 = faPigtailSkipFiberDao.insertFaPigtailSkipFiber(pigtailSkipFiberId,
                pigtailNumber,
                fiberCableType,
                fiberSpecificationModel,
                fiberNumberOfBranches,
                fiberSingleLength,
                forms,
                to2,
                fiberSupplier,
                fiberContacts);
        int i55 = faPowerNetworkLineDao.insertFaPowerNetworkLine(powerNetworkLineId,
                powerNumber,
                cableType,
                specificationModel,
                numberOfBranches,
                singleLength,
                totalLength,
                froms,
                to1,
                powerSupplier,
                powerContacts);
        int i66 = faWalkingFrameDao.insertFaWalkingFrame(walkingFrameId,
                walkingNumber,
                walkingDesignLength,
                walkingFrameSupplier,
                walkingFrameContacts);
        if(i1>0&i22>0&i3>0&i4>0&i55>0&i66>0){
            int i = faEquipmentInformationDao.insertFaEquipmentInformation(equipmentInformationId,
                    operator,
                    buildYear,
                    buildingProject,
                    motorRoomName,
                    motorRoomLongitude,
                    motorRoomLatitude,
                    province,
                    city,
                    county,
                    onSiteSupervision,
                    projectLeader,
                    equipmentId,
                    boardCardDilatationId,
                    powerNetworkLineId,
                    pigtailSkipFiberId,
                    walkingFrameId,
                    fiberOpticChannelId);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据设备信息id查询包含的模块集合
    @Override
    public List<String> selectEquipmentSpecialityId(String equipmentInformationId) {
        List<String> EquipmentSpecialityIdList = new ArrayList<>();
        //根据设备信息的id查询包含的其他信息
        FaFiberOpticChannel faFiberOpticChannel =faFiberOpticChannelDao.getFaFiberOpticChannel(equipmentInformationId) ;
        FaCabinetPowerFrame faCabinetPowerFrame = faCabinetPowerFrameDao.getFaCabinetPowerFrame(equipmentInformationId);
        FaBoardcardDilatation faBoardcardDilatation = faBoardcardDilatationDao.getFaBoardcardDilatation(equipmentInformationId);
        FaPigtailSkipFiber faPigtailSkipFiber = faPigtailSkipFiberDao.getFaPigtailSkipFiber(equipmentInformationId);
        FaPowerNetworkLine faPowerNetworkLine = faPowerNetworkLineDao.getFaPowerNetworkLine(equipmentInformationId);
        FaWalkingFrame faWalkingFrame = faWalkingFrameDao.getFaWalkingFrame(equipmentInformationId);
        //1.判断属于设备，机柜，电源柜，配线架 那个类型
        if(faCabinetPowerFrame.getEquipmentType().equals("设备(利旧机柜)")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("设备(利旧机柜)");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faCabinetPowerFrame.getEquipmentType().equals("设备(自带机柜)")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("设备(自带机柜)");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faCabinetPowerFrame.getEquipmentType().equals("电源柜")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("电源柜");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faCabinetPowerFrame.getEquipmentType().equals("机柜")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("机柜");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faCabinetPowerFrame.getEquipmentType().equals("ODF")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("ODF");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faCabinetPowerFrame.getEquipmentType().equals("DDF")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("DDF");
            //System.out.println("1:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        //2.板卡扩容
        if(faBoardcardDilatation.getBoardCardName() != null){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("板卡扩容");
            //System.out.println("2:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        //3.电源线,网线,2M线
        if(faPowerNetworkLine.getCableType().equals("电源线")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("电源线");
            //System.out.println("3:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faPowerNetworkLine.getCableType().equals("网线")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("网线");
            //System.out.println("3:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faPowerNetworkLine.getCableType().equals("2M线")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("2M线");
            //System.out.println("3:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        //4.尾纤,跳纤
        if(faPigtailSkipFiber.getFiberCableType().equals("尾纤")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("尾纤");
            //System.out.println("4:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        if(faPigtailSkipFiber.getFiberCableType().equals("跳纤")){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("跳纤");
            //System.out.println("4:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        //5.走线架表
        if(faWalkingFrame.getWalkingDesignLength() != null){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("走线架");
            //System.out.println("5:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        //6.光纤槽道
        if(faFiberOpticChannel.getFiberOpticDesignLength() != null){
            String equipmentSpecialityId = equipmentSpecialityDao.selectEquipmentSpecialityId("光纤槽道");
            //System.out.println("6:"+equipmentSpecialityId);
            EquipmentSpecialityIdList.add(equipmentSpecialityId);
        }
        return EquipmentSpecialityIdList;
    }





    public FaEquipmentInformationDao getFaEquipmentInformationDao() {
        return this.faEquipmentInformationDao;
    }

    public void setFaEquipmentInformationDao(FaEquipmentInformationDao faEquipmentInformationDao) {
        this.faEquipmentInformationDao = faEquipmentInformationDao;
    }

}