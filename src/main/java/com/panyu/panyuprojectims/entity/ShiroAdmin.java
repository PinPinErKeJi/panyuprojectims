package com.panyu.panyuprojectims.entity;
public class ShiroAdmin {
    private String adminId;
    private String adminName;
    private String userEmail;
    private String adminPassword;
    private String adminCreateTime;
    private String adminUpdateTime;
    public ShiroAdmin() {
        super();
    }
    public ShiroAdmin(String adminId,String adminName,String userEmail,String adminPassword,String adminCreateTime,String adminUpdateTime) {
        super();
        this.adminId = adminId;
        this.adminName = adminName;
        this.userEmail = userEmail;
        this.adminPassword = adminPassword;
        this.adminCreateTime = adminCreateTime;
        this.adminUpdateTime = adminUpdateTime;
    }
    public String getAdminId() {
        return this.adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getAdminPassword() {
        return this.adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminCreateTime() {
        return this.adminCreateTime;
    }

    public void setAdminCreateTime(String adminCreateTime) {
        this.adminCreateTime = adminCreateTime;
    }

    public String getAdminUpdateTime() {
        return this.adminUpdateTime;
    }

    public void setAdminUpdateTime(String adminUpdateTime) {
        this.adminUpdateTime = adminUpdateTime;
    }

    @Override
    public String toString() {
        return "ShiroAdmin{" +
                "adminId='" + adminId + '\'' +
                ", adminName='" + adminName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminCreateTime='" + adminCreateTime + '\'' +
                ", adminUpdateTime='" + adminUpdateTime + '\'' +
                '}';
    }
}
