package com.panyu.panyuprojectims.service;
import java.util.List;
import java.util.Map;

import com.panyu.panyuprojectims.entity.PanyuUser;
import com.panyu.panyuprojectims.utils.PageHelperUtil;
import org.apache.ibatis.annotations.Param;

public interface PanyuUserService{

    //根据用户名查询用户
    PanyuUser selectPanyuUserByName(String userName);
    //根据用户名修改角色
    void updatePanyuuserRole(PanyuUser panyuUser,String[] roleIds);

    //修改用户信息
    void updatePanyuuser(PanyuUser panyuUser);

    //删除用户
    void deletePanyuUser(String[] ids);

    //添加用户
    boolean addPanyuUser(String userName,
                         String userPwd,
                         String userlogpwd,
                         String userTel,
                         String userEmail
    );
    //分页展示用户
    PageHelperUtil queryAllPanyuUser(int page, int rows, String userName);

    public int register(  @Param("userProvince")String userProvince,
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
    public PanyuUser queryInfoByUsername(String userName);
    public List<String> queryRolesByUsername(String userName);
    public List<String> queryResByUsername(String userName);

    //判断邮箱是否存在
    String selectEmailByUserEmail(String userEmail);
    //点击发送邮件查询该邮箱关联的手机号
    String selectTelByEmail(String userEmail);

    //修改密码前根据用户当前手机号查询旧密码
    PanyuUser selectUserLogpwdAndUserPwd(String userTel);

    //修改明文密码进行加密，然后赋值给暗文密码
    boolean updateUserLogpwdAndUserPwd(PanyuUser panyuUser);
}