package com.panyu.panyuprojectims.entity;
public class ShiroAmdinRole {
    private String adminRoleId;
    private String userId;
    private String roleId;
    public ShiroAmdinRole() {
        super();
    }

    public ShiroAmdinRole(String adminRoleId, String userId, String roleId) {
        this.adminRoleId = adminRoleId;
        this.userId = userId;
        this.roleId = roleId;
    }

    public String getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(String adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ShiroAmdinRole{" +
                "adminRoleId='" + adminRoleId + '\'' +
                ", userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
