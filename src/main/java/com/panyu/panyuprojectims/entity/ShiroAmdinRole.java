package com.panyu.panyuprojectims.entity;
public class ShiroAmdinRole {
    private String adminRoleId;
    private String adminId;
    private String roleId;
    public ShiroAmdinRole() {
        super();
    }
    public ShiroAmdinRole(String adminRoleId,String adminId,String roleId) {
        super();
        this.adminRoleId = adminRoleId;
        this.adminId = adminId;
        this.roleId = roleId;
    }
    public String getAdminRoleId() {
        return this.adminRoleId;
    }

    public void setAdminRoleId(String adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public String getAdminId() {
        return this.adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ShiroAmdinRole{" +
                "adminRoleId='" + adminRoleId + '\'' +
                ", adminId='" + adminId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
