package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.HnSecondSplitterNumberDao;
import com.panyu.panyuprojectims.entity.HnSecondSplitterNumber;
import com.panyu.panyuprojectims.service.HnSecondSplitterNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HnSecondSplitterNumberServiceImpl implements HnSecondSplitterNumberService{
    @Autowired
    private HnSecondSplitterNumberDao hnSecondSplitterNumberDao;


    //根据二级分光器设计数量表ID字段删除数据
    @Override
    public int deleteHnSecondSplitterNumberBySecondSplitterNumberId(String secondSplitterNumberId) {
        return hnSecondSplitterNumberDao.deleteHnSecondSplitterNumberBySecondSplitterNumberId(secondSplitterNumberId);
    }

    //添加
    @Override
    public int insertHnSecondSplitterNumber(String secondSplitterNumberId, String secondOneToFour, String secondOneToEight,
                                            String secondOneToSixteen, String oneToThirtyTwo, String oneToSixtyFour) {
        return hnSecondSplitterNumberDao.insertHnSecondSplitterNumber(secondSplitterNumberId,secondOneToFour,secondOneToEight,secondOneToSixteen,oneToThirtyTwo,oneToSixtyFour);
    }
}