package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.Module;

import java.util.List;

public interface ModuleService{


    List<Module> selectModule();

/*------------------------------添加模块选项框开始-----------------------------*/
	//1.添加选项框内容时查询所有模块名称
	List<Module> selectAllModule();
    //根据选项框中的内容，添加没有的模块名信息
    Module insertModule(String moduleName);
/*------------------------------添加模块选项框结束-----------------------------*/

/*------------------------------删除模块选项框开始-----------------------------*/
	int deleteModuleById(String moduleId);
/*------------------------------删除模块选项框结束-----------------------------*/

/*------------------------------修改模块选项框开始-----------------------------*/
	//根据名字查询对象
	Module selectModuleByName(String moduleName);

	int updateModule(String moduleId, String moduleName);
/*------------------------------修改模块选项框结束-----------------------------*/
//根据名字查id
	String selectModuleId(String moduleName);
}