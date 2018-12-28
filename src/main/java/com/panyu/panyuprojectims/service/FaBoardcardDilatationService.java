package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.FaBoardcardDilatation;

import java.util.List;
public interface FaBoardcardDilatationService{

    //添加
    boolean insertFaBoardcardDilatation(String boardCardDilatationId,
                                        String boardCardNumber,
                                        String boardCardName,
                                        String veneerFunction,
                                        String placeEquipment,
                                        String boardCardDesignQuantity,
                                        String boardCardSupplier,
                                        String boardCardContacts);

    int deleteFaBoardcardDilatationById(String id);

}