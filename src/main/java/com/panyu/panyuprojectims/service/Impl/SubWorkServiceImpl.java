package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.SubWorkDao;
import com.panyu.panyuprojectims.entity.SubWork;
import com.panyu.panyuprojectims.service.SubWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubWorkServiceImpl implements SubWorkService{

    @Autowired
    private SubWorkDao subWorkDao;


    //根据分项工程id和名字查询对象
    @Override
    public SubWork getSubWork(String subId, String subName) {
        return subWorkDao.getSubWork(subId,subName);
    }

/*--------------------添加分项工程选项框开始------------------------*/
    @Override
    public List<SubWork> selectSubWorkById(String moduleId) {
        return subWorkDao.selectSubWorkById(moduleId);
    }



/*--------------------添加分项工程选项框结束------------------------*/

/*--------------------删除分项工程选项框开始------------------------*/
    @Override
    public List<String> selectSubWorkModuleId(String moduleId) {
        return subWorkDao.selectSubWorkModuleId(moduleId);
    }
    @Override
    public int deleteSubWorkById(String subId){
        return subWorkDao.deleteSubWorkById(subId);
    }
/*--------------------删除分项工程选项框结束------------------------*/

/*--------------------修改分项工程选项框开始------------------------*/
    @Override
    public int updateSubWork(String subId, String subName) {
        return subWorkDao.updateSubwork(subId,subName);
    }
/*--------------------修改分项工程选项框结束------------------------*/

    //添加
    public  SubWork addSubWork(String subName,String moduleId){
        int count = subWorkDao.getCountBySubName(subName, moduleId);
        if(count == 0) {
            int i = subWorkDao.insertSubWork(subName, moduleId);
        }
        SubWork subWork = subWorkDao.selectSubWorkByName(subName, moduleId);
        return subWork;
    }
}