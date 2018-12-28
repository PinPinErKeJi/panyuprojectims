package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.IcCableLength;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IcCableLengthDao{

    //根据信息id查询线缆长度对象
    IcCableLength selectIcCableLengthByIndoorInformationId(@Param("indoorInformationId") String indoorInformationId);

    //添加
    int insertIcCableLength(@Param("cableLengthId") String cableLengthId,
                            @Param("networkLine") String networkLine,
                            @Param("photoelectricCompositeCable") String photoelectricCompositeCable,
                            @Param("sevenEighthsFeeder") String sevenEighthsFeeder,
                            @Param("ahalfFeeder") String ahalfFeeder);

    //根据线缆长度表ID删除选中项
    int deleteIcCableLengthById(@Param("cableLengthId") String cableLengthId);
}