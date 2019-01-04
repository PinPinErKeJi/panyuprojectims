package com.panyu.panyuprojectims.entity;
public class ShiroRoleResource {
    private String roleResourceId;
    private String roleId;
    private String resourceId;
    public ShiroRoleResource() {
        super();
    }
    public ShiroRoleResource(String roleResourceId,String roleId,String resourceId) {
        super();
        this.roleResourceId = roleResourceId;
        this.roleId = roleId;
        this.resourceId = resourceId;
    }
    public String getRoleResourceId() {
        return this.roleResourceId;
    }

    public void setRoleResourceId(String roleResourceId) {
        this.roleResourceId = roleResourceId;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "ShiroRoleResource{" +
                "roleResourceId='" + roleResourceId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }
}
