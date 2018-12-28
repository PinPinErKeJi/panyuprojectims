package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnPrimarySplitterBoxNumberDao;
import com.panyu.panyuprojectims.entity.HnPrimarySplitterBoxNumber;
import com.panyu.panyuprojectims.service.HnPrimarySplitterBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnPrimarySplitterBoxNumberServiceImpl implements HnPrimarySplitterBoxNumberService{
    @Autowired
    private HnPrimarySplitterBoxNumberDao hnPrimarySplitterBoxNumberDao;

    //根据一级分光器箱设计数量表ID字段删除数据
    @Override
    public int deleteHnPrimarySplitterBoxNumberByPrimarySplitterBoxId(String primarySplitterBoxId) {
        return hnPrimarySplitterBoxNumberDao.deleteHnPrimarySplitterBoxNumberByPrimarySplitterBoxId(primarySplitterBoxId);
    }

    //添加
    @Override
    public int insertHnPrimarySplitterBoxNumber(String primarySplitterBoxId, String primaryAnchorearType, String primaryWallMounted) {
        return hnPrimarySplitterBoxNumberDao.insertHnPrimarySplitterBoxNumber(primarySplitterBoxId,primaryAnchorearType,primaryWallMounted);
    }
}