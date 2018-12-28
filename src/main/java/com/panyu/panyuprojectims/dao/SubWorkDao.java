package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.SubWork;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SubWorkDao{

	//根据分项工程id和名字查询对象
	SubWork getSubWork(@Param("subId") String subId, @Param("subName") String subName);



	//根据名字和父级id查询个数
	int getCountBySubName(@Param("subName") String subName, @Param("moduleId") String moduleId);

/*------------------------------添加分项工程选项框开始-----------------------------*/
	/**
	 * 根据id添加选项框分项工程时查询分项工程名称
	 * @param moduleId
	 * @return
	 */
	List<SubWork> selectSubWorkById(String moduleId);

	SubWork selectSubWorkByName(@Param("subName") String subName, @Param("moduleId") String moduleId);

	//添加
	int insertSubWork(@Param("subName") String subName, @Param("moduleId") String moduleId);
/*------------------------------添加分项工程选项框结束-----------------------------*/

/*------------------------------删除分项工程选项框开始-----------------------------*/
	List<String> selectSubWorkModuleId(String moduleId);

	int deleteSubWorkById(String subId);
/*------------------------------删除分项工程选项框结束-----------------------------*/

/*------------------------------修改分项工程选项框开始-----------------------------*/
	int updateSubwork(@Param("subId") String subId, @Param("subName") String subName);
/*------------------------------修改分项工程选项框结束-----------------------------*/
//根据名字和父id查询subid
	String selectSubIdBySubNameAndModuleId(@Param("subName") String subName, @Param("moduleId") String moduleId);
}