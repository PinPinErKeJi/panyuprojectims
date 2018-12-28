package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnPrimarySplitterNumberDao;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterNumber;
import com.panyu.panyuprojectims.service.HnPrimarySplitterNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnPrimarySplitterNumberServiceImpl implements HnPrimarySplitterNumberService{
    @Autowired
    private HnPrimarySplitterNumberDao hnPrimarySplitterNumberDao;


    //根据一级分光器设计数量表ID字段删除数据
    @Override
    public int deleteHnPrimarySplitterNumberByPrimarySplitterNumberId(String primarySplitterNumberId) {
        return hnPrimarySplitterNumberDao.deleteHnPrimarySplitterNumberByPrimarySplitterNumberId(primarySplitterNumberId);
    }


    //添加
    @Override
    public int insertHnPrimarySplitterNumber(String primarySplitterNumberId, String primaryOneToFour, String primaryOneToEight, String primaryOneToSixteen) {
        return hnPrimarySplitterNumberDao.insertHnPrimarySplitterNumber(primarySplitterNumberId,primaryOneToFour,primaryOneToEight,primaryOneToSixteen);
    }
}