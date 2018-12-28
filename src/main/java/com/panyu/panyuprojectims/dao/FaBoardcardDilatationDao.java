package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.FaBoardcardDilatation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface FaBoardcardDilatationDao{


    //添加
    int insertFaBoardcardDilatation(@Param("boardCardDilatationId") String boardCardDilatationId,
                                    @Param("boardCardNumber") String boardCardNumber,
                                    @Param("boardCardName") String boardCardName,
                                    @Param("veneerFunction") String veneerFunction,
                                    @Param("placeEquipment") String placeEquipment,
                                    @Param("boardCardDesignQuantity") String boardCardDesignQuantity,
                                    @Param("boardCardSupplier") String boardCardSupplier,
                                    @Param("boardCardContacts") String boardCardContacts
    );
    //根据板卡扩容ID删除选中项
    int deleteFaBoardcardDilatationById(@Param("boardCardDilatationId") String boardCardDilatationId);

    //根据设备信息的id查询FaBoardcardDilatation
    FaBoardcardDilatation getFaBoardcardDilatation(@Param("equipmentInformationId") String equipmentInformationId);

}