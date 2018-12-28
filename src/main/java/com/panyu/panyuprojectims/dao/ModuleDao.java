package com.panyu.panyuprojectims.dao;

import com.panyu.panyuprojectims.entity.Module;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ModuleDao{

    List<Module> selectModule();

	//根据名字查询个数
	int getCountModuleName(@Param("moduleName") String moduleName);
	/*------------------------------添加模块选项框开始-----------------------------*/
	//1.添加选项框内容时查询所有模块名称
	List<Module> selectAllModule();
    //1.根据选项框中的内容，添加没有的模块名信息
    int insertModule(@Param("moduleName") String moduleName);
    //1.根据选项框中的内容，添加没有的模块名信息
    Module selectModuleByName(String moduleName);
	/*------------------------------添加模块选项框结束-----------------------------*/
	/*------------------------------删除模块选项框开始-----------------------------*/
    int deleteModuleById(String moduleId);
	/*------------------------------删除模块选项框结束-----------------------------*/
	/*------------------------------修改模块选项框开始-----------------------------*/
	int updateModule(@Param("moduleId") String moduleId, @Param("moduleName") String moduleName);
	/*------------------------------修改模块选项框结束-----------------------------*/
	//根据名字查id
	String selectModuleId(String moduleName);

}