package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnSecondSplitterBoxNumberDao;
import com.panyu.panyuprojectims.entity.HnSecondSplitterBoxNumber;
import com.panyu.panyuprojectims.service.HnSecondSplitterBoxNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnSecondSplitterBoxNumberServiceImpl implements HnSecondSplitterBoxNumberService{
    @Autowired
    private HnSecondSplitterBoxNumberDao hnSecondSplitterBoxNumberDao;


    //根据二级分光器箱设计数量表ID字段删除数据
    @Override
    public int deleteHnSecondSplitterBoxNumberBySecondSplitterBoxId(String secondSplitterBoxId) {
        return hnSecondSplitterBoxNumberDao.deleteHnSecondSplitterBoxNumberBySecondSplitterBoxId(secondSplitterBoxId);
    }

    //添加
    @Override
    public int insertHnSecondSplitterBoxNumber(String secondSplitterBoxId, String secondAnchorearType, String secondWallMounted) {
        return hnSecondSplitterBoxNumberDao.insertHnSecondSplitterBoxNumber(secondSplitterBoxId,secondAnchorearType,secondWallMounted);
    }
}