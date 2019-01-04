package com.panyu.panyuprojectims.entity;
public class ShiroRole {
    private String roleId;
    private String roleName;
    private String roleCreateTime;
    private String roleUpdateTime;
    public ShiroRole() {
        super();
    }
    public ShiroRole(String roleId,String roleName,String roleCreateTime,String roleUpdateTime) {
        super();
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleCreateTime = roleCreateTime;
        this.roleUpdateTime = roleUpdateTime;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCreateTime() {
        return this.roleCreateTime;
    }

    public void setRoleCreateTime(String roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public String getRoleUpdateTime() {
        return this.roleUpdateTime;
    }

    public void setRoleUpdateTime(String roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }

    @Override
    public String toString() {
        return "ShiroRole{" +
                "roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleCreateTime='" + roleCreateTime + '\'' +
                ", roleUpdateTime='" + roleUpdateTime + '\'' +
                '}';
    }
}
