package com.panyu.panyuprojectims.service;
import com.panyu.panyuprojectims.entity.SubWork;

import java.util.List;
public interface SubWorkService{


	//根据分项工程id和名字查询对象
	SubWork getSubWork(String subId, String subName);

/*--------------------添加分项工程选项框开始------------------------*/
    /**
	 * 添加分项工程选项框的时候根据id查询对应的名称
	 * @param moduleId
	 * @return
	 */
    List<SubWork> selectSubWorkById(String moduleId);



/*--------------------添加分项工程选项框结束------------------------*/

/*--------------------删除分项工程选项框开始------------------------*/
	List<String> selectSubWorkModuleId(String moduleId);

	int deleteSubWorkById(String subId);
/*--------------------删除分项工程选项框结束------------------------*/

/*--------------------修改分项工程选项框开始------------------------*/
    int updateSubWork(String subId, String subName);
/*--------------------修改分项工程选项框结束------------------------*/

	//添加
	SubWork addSubWork(String subName, String moduleId);
}