package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaPowerNetworkLineDao;
import com.panyu.panyuprojectims.entity.FaPowerNetworkLine;
import com.panyu.panyuprojectims.service.FaPowerNetworkLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaPowerNetworkLineServiceImpl implements FaPowerNetworkLineService{
    @Autowired
    private FaPowerNetworkLineDao faPowerNetworkLineDao;


    //添加
    @Override
    public boolean insertFaPowerNetworkLine(String powerNetworkLineId,
                                            String powerNumber,
                                            String cableType,
                                            String specificationModel,
                                            String numberOfBranches,
                                            String singleLength,
                                            String totalLength,
                                            String froms,
                                            String to1,
                                            String powerSupplier,
                                            String powerContacts){
        //条数数据处理
        int i1 = numberOfBranches.indexOf(".");
        if(i1>0){
            numberOfBranches = numberOfBranches.substring(0, i1);
        }else {
            numberOfBranches = numberOfBranches.substring(0);
        }
        //单条长度数据处理
        int i2 = singleLength.indexOf(".");
        if(i2>0){
            String str = singleLength.substring(i2);
            int length = str.length();
            if(length>2){
                singleLength = singleLength.substring(0, i2+3);
                System.out.println("大于2:"+singleLength);
            }else {
                singleLength = singleLength.substring(0, i2 + length);
                System.out.println("小于2:"+singleLength);
            }
        }else {
            singleLength = singleLength+".00";
        }
        //总条数长度数据处理
        int i3 = totalLength.indexOf(".");
        if(i3>0){
            String str = totalLength.substring(i3);
            int length = str.length();
            if(length>2){
                totalLength = totalLength.substring(0, i3+3);
                System.out.println("大于2:"+totalLength);
            }else {
                totalLength = totalLength.substring(0, i3 + length);
                System.out.println("小于2:"+totalLength);
            }
        }else {
            totalLength = totalLength+".00";
        }

        boolean flag = true;
        if(powerNetworkLineId != null){
            int i = faPowerNetworkLineDao.insertFaPowerNetworkLine(powerNetworkLineId,
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
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据电源线,网线,2M线表ID字段删除选中项
    @Override
    public int deleteFaPowerNetworkLineById(String powerNetworkLineId){
        return faPowerNetworkLineDao.deleteFaPowerNetworkLineById(powerNetworkLineId);
    }
    @Override
    public int updateFaPowerNetworkLineById(FaPowerNetworkLine enti){
        return faPowerNetworkLineDao.updateFaPowerNetworkLineById(enti);
    }

    public FaPowerNetworkLineDao getFaPowerNetworkLineDao() {
        return this.faPowerNetworkLineDao;
    }

    public void setFaPowerNetworkLineDao(FaPowerNetworkLineDao faPowerNetworkLineDao) {
        this.faPowerNetworkLineDao = faPowerNetworkLineDao;
    }

}