package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.PanyuDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface PanyuDTODao {

/*------------------------------if (moduleId==null&&projectName==null){}-----------------------------------------*/
        /**
         * 查询所有
         * @return
         */
         List<PanyuDTO> selectAllPanyuDTO(
                @Param("start") int start,
                @Param("end") int end);
        /**
         * 查询总数
         * @return
         */
         long getCount();
/*------------------------------if (moduleId==null&&projectName==null){}-----------------------------------------*/


/*------------------------------if (moduleId==null&&projectName!=null){}-----------------------------------------*/
    /*
     * 根据输入搜索框内容分页查询模块信息
     *
     */
     List<PanyuDTO> FuzzyqueryProjectName(@Param("start") int start,
                                                @Param("end") int end,
                                                @Param("projectName") String projectName);
    /*
    * 查询对应的总数
    *
    */
     long FuzzyqueryCount(@Param("projectName") String projectName);
/*------------------------------if (moduleId==null&&projectName!=null){}-----------------------------------------*/


/*------------------------------if (moduleId!=null&&projectName!=null){}-----------------------------------------*/
    /*
     * 根据输入搜索框内容以及下拉框模块名称进行分页查询模块信息
     *
     */
     List<PanyuDTO> selectModuleNameAndProjectName(@Param("start") int start,
                                                         @Param("end") int end,
                                                         @Param("projectName") String projectName,
                                                         @Param("moduleId") String moduleId);

     long selectModuleAndProjectCount(@Param("projectName") String projectName,
                                            @Param("moduleId") String moduleId);
/*------------------------------if (moduleId!=null&&projectName!=null){}-----------------------------------------*/


/*------------------------------if (moduleId!=null&&projectName==null){}-----------------------------------------*/
     List<PanyuDTO> selectFuzzyqueryModuleId(@Param("start") int start,
                                                   @Param("end") int end,
                                                   @Param("moduleId") String moduleId);

     long selectFuzzyqueryModuleIdCount(@Param("moduleId") String moduleId);
/*------------------------------if (moduleId!=null&&projectName==null){}-----------------------------------------*/


/*------------------------------if (moduleId!=null&&ModuleName!=null){}-----------------------------------------*/
     List<PanyuDTO> selectAllModuleNameByPage(@Param("start") int start,
                                                    @Param("end") int end,
                                                    @Param("moduleId") String moduleId,
                                                    @Param("moduleName") String moduleName);

     long selectAllModuleNameByPageCount(@Param("moduleId") String moduleId,
                                               @Param("moduleName") String moduleName);
/*------------------------------if (moduleId!=null&&ModuleName!=null){}-----------------------------------------*/


    /*
    * 导出Excel空表格
    * */
    List<PanyuDTO> exportExcel();

    /*
    * 导出Excel表格数据
    * */
    List<PanyuDTO> exportModule(String[] ids);

}
