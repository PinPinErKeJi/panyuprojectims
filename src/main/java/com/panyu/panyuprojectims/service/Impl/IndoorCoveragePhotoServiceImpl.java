package com.panyu.panyuprojectims.service.Impl;
import java.util.List;
import com.panyu.panyuprojectims.dao.IndoorCoveragePhotoDao;
import com.panyu.panyuprojectims.entity.IndoorCoveragePhoto;
import com.panyu.panyuprojectims.service.IndoorCoveragePhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class IndoorCoveragePhotoServiceImpl implements IndoorCoveragePhotoService{
    @Autowired
    private IndoorCoveragePhotoDao indoorCoveragePhotoDao;

    //查询检查项目id集合
    @Override
    public List<String> selectIndoorProjectIdList(String indoorCoverageId, String indoorSubWorkId) {
        return indoorCoveragePhotoDao.selectIndoorProjectIdList(indoorCoverageId,indoorSubWorkId);
    }

    //添加
    @Override
    public int insertIndoorCoveragePhoto(IndoorCoveragePhoto indoorCoveragePhoto) {
        return indoorCoveragePhotoDao.insertIndoorCoveragePhoto(indoorCoveragePhoto);
    }

    //查询图片个数
    @Override
    public long getCountIndoorCoveragePhotoByIndoorProjectId(String indoorProjectId) {
        return indoorCoveragePhotoDao.getCountIndoorCoveragePhotoByIndoorProjectId(indoorProjectId);
    }

    //查询图片id集合
    @Override
    public List<String> selectIndoorPhotoIdList(String indoorProjectId, String indoorInformationId) {
        return indoorCoveragePhotoDao.selectIndoorPhotoIdList(indoorProjectId,indoorInformationId);
    }

    //查询图片信息
    @Override
    public IndoorCoveragePhoto selectIndoorCoveragePhoto(String indoorPhotoId,String indoorProjectId, String indoorInformationId) {
        return indoorCoveragePhotoDao.selectIndoorCoveragePhoto(indoorPhotoId, indoorProjectId,indoorInformationId);
    }
}