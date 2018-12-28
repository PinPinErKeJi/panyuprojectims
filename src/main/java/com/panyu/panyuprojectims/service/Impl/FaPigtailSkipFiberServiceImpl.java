package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaPigtailSkipFiberDao;
import com.panyu.panyuprojectims.entity.FaPigtailSkipFiber;
import com.panyu.panyuprojectims.service.FaPigtailSkipFiberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaPigtailSkipFiberServiceImpl implements FaPigtailSkipFiberService{
    @Autowired
    private FaPigtailSkipFiberDao faPigtailSkipFiberDao;

    //添加
    @Override
    public boolean insertFaPigtailSkipFiber(String pigtailSkipFiberId,
                                            String pigtailNumber,
                                            String fiberCableType,
                                            String fiberSpecificationModel,
                                            String fiberNumberOfBranches,
                                            String fiberSingleLength,
                                            String forms,
                                            String to2,
                                            String fiberSupplier,
                                            String fiberContacts){
        //条数数据处理
        int i1 = fiberNumberOfBranches.indexOf(".");
        if(i1>0){
            fiberNumberOfBranches = fiberNumberOfBranches.substring(0, i1);
        }else {
            fiberNumberOfBranches = fiberNumberOfBranches.substring(0);
        }
        //单条长度
        int i2 = fiberSingleLength.indexOf(".");
        if(i2>0){
            System.out.println("i2:"+i2);
            String str = fiberSingleLength.substring(i2);
            int length = str.length();
            if(length>2){
                fiberSingleLength = fiberSingleLength.substring(0, i2+3);
                System.out.println("大于2:"+fiberSingleLength);
            }else {
                fiberSingleLength = fiberSingleLength.substring(0, i2+length);
                System.out.println("小于2:"+fiberSingleLength);
            }
        }else {
            System.out.println("i2**:"+i2);
            fiberSingleLength = fiberSingleLength+".00";
        }
        boolean flag = true;
        if(pigtailSkipFiberId != null){
            int i = faPigtailSkipFiberDao.insertFaPigtailSkipFiber(pigtailSkipFiberId,
                    pigtailNumber,
                    fiberCableType,
                    fiberSpecificationModel,
                    fiberNumberOfBranches,
                    fiberSingleLength,
                    forms,
                    to2,
                    fiberSupplier,
                    fiberContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据尾纤,跳纤ID删除选中项
    @Override
    public int deleteFaPigtailSkipFiberById(String pigtailSkipFiberId){
        return faPigtailSkipFiberDao.deleteFaPigtailSkipFiberById(pigtailSkipFiberId);
    }

    @Override
    public int updateFaPigtailSkipFiberById(FaPigtailSkipFiber enti){
        return faPigtailSkipFiberDao.updateFaPigtailSkipFiberById(enti);
    }

    public FaPigtailSkipFiberDao getFaPigtailSkipFiberDao() {
        return this.faPigtailSkipFiberDao;
    }

    public void setFaPigtailSkipFiberDao(FaPigtailSkipFiberDao faPigtailSkipFiberDao) {
        this.faPigtailSkipFiberDao = faPigtailSkipFiberDao;
    }

}