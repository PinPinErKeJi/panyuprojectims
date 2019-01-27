package com.panyu.panyuprojectims.dao;
import com.panyu.panyuprojectims.entity.PanyuUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PanyuUserDao{

    //修改用户
    boolean updatePanyuUser(PanyuUser panyuUser);
    //修改用户时先查询分配的角色个数
    long getCountByRoleName(@Param("roleId")String roleId,@Param("userName")String userName);
    // 添加用户角色中间表
    boolean insertPanyuUserAndRole(@Param("userId")String userId,@Param("roleId")String roleId);
    //删除用户及拥有的角色
    void deletePanyuUserAndRoleByUserId(@Param("userId") String userId);
    //删除用户
    void deletePanyuUser(@Param("userId")String userId);

    //添加用户
    boolean addPanyuUser(@Param("userName")String userName,
                         @Param("userPwd")String userPwd,
                         @Param("userlogpwd")String userlogpwd,
                         @Param("userTel")String userTel,
                         @Param("userEmail")String userEmail
    );
    //删除用户
    boolean deletePanyuUser(String[] ids);
    //添加用户
    boolean addPanyuUser(@Param("userName")String userName,
                         @Param("userPwd")String userPwd,
                         @Param("userlogpwd")String userlogpwd);
    //查询所有的用户
    List<PanyuUser> queryPanyuUserList(@Param("start")int start,@Param("end")int end,@Param("userName")String userName);
    //查询所有的用户个数据
    long queryCountPanyuUser(@Param("userName")String userName);


    public int register(   @Param("userProvince")String userProvince,
                            @Param("userCity")String userCity,
                            @Param("userCounty")String userCounty,
                            @Param("userCompanyName")String userCompanyName,
                            @Param("userCompanycccNumber")String userCompanycccNumber,
                            @Param("userName")String userName,
                            @Param("userEmail")String userEmail,
                            @Param("userTel")String userTel,
                            @Param("userPwd")String userPwd,
                            @Param("userlogpwd")String userlogpwd
                           );

    public PanyuUser queryInfoByUsername(@Param("userName")String userName);

    public List<String> queryRolesByUsername(@Param("userName") String userName);
    public List<String> queryResByUsername(@Param("userName")String userName);

}