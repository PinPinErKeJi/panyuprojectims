package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.FaBoardcardDilatationDao;
import com.panyu.panyuprojectims.entity.FaBoardcardDilatation;
import com.panyu.panyuprojectims.service.FaBoardcardDilatationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FaBoardcardDilatationServiceImpl implements FaBoardcardDilatationService{
    @Autowired
    private FaBoardcardDilatationDao faBoardcardDilatationDao;

    //添加
    @Override
    public boolean insertFaBoardcardDilatation(String boardCardDilatationId,
                                               String boardCardNumber,
                                               String boardCardName,
                                               String veneerFunction,
                                               String placeEquipment,
                                               String boardCardDesignQuantity,
                                               String boardCardSupplier,
                                               String boardCardContacts){

        //设计数量----》数据处理
        int i1 = boardCardDesignQuantity.indexOf(".");
        if(i1>0){
            boardCardDesignQuantity = boardCardDesignQuantity.substring(0, i1);
        }else {
            boardCardDesignQuantity = boardCardDesignQuantity.substring(0);
        }

        boolean flag = true;
        if(boardCardDilatationId != null){
            int i = faBoardcardDilatationDao.insertFaBoardcardDilatation(boardCardDilatationId,
                    boardCardNumber,
                    boardCardName,
                    veneerFunction,
                    placeEquipment,
                    boardCardDesignQuantity,
                    boardCardSupplier,
                    boardCardContacts);
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    //根据板卡扩容ID删除选中项
    @Override
    public int deleteFaBoardcardDilatationById(String boardCardDilatationId){
        return faBoardcardDilatationDao.deleteFaBoardcardDilatationById(boardCardDilatationId);
    }

}