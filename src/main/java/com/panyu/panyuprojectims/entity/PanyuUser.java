package com.panyu.panyuprojectims.entity;
public class PanyuUser {
    //用户属性
    private String userId;
    private String userProvince;
    private String userCity;
    private String userCounty;
    private String userCompanyName;
    private String userCompanycccNumber;
    private String userName;
    private String userEmail;
    private String userTel;
    private String userPwd;
    private String userState;
    //角色属性
    private String roleId;
    private String roleName;
    private String roleCreateTime;
    private String roleUpdateTime;
    //权限属性
    private String resourceId;
    private String resourceName;
    private String resourceUrl;
    private String resourceCode;
    private String parectResourceId;


    public PanyuUser() {
        super();
    }

    public PanyuUser(String userId, String userProvince, String userCity, String userCounty, String userCompanyName, String userCompanycccNumber, String userName, String userEmail, String userTel, String userPwd, String userState, String roleId, String roleName, String roleCreateTime, String roleUpdateTime, String resourceId, String resourceName, String resourceUrl, String resourceCode, String parectResourceId) {
        this.userId = userId;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userCounty = userCounty;
        this.userCompanyName = userCompanyName;
        this.userCompanycccNumber = userCompanycccNumber;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userTel = userTel;
        this.userPwd = userPwd;
        this.userState = userState;
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleCreateTime = roleCreateTime;
        this.roleUpdateTime = roleUpdateTime;
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceUrl = resourceUrl;
        this.resourceCode = resourceCode;
        this.parectResourceId = parectResourceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserProvince() {
        return userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserCounty() {
        return userCounty;
    }

    public void setUserCounty(String userCounty) {
        this.userCounty = userCounty;
    }

    public String getUserCompanyName() {
        return userCompanyName;
    }

    public void setUserCompanyName(String userCompanyName) {
        this.userCompanyName = userCompanyName;
    }

    public String getUserCompanycccNumber() {
        return userCompanycccNumber;
    }

    public void setUserCompanycccNumber(String userCompanycccNumber) {
        this.userCompanycccNumber = userCompanycccNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(String roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public String getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(String roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getParectResourceId() {
        return parectResourceId;
    }

    public void setParectResourceId(String parectResourceId) {
        this.parectResourceId = parectResourceId;
    }

    @Override
    public String toString() {
        return "PanyuUser{" +
                "userId='" + userId + '\'' +
                ", userProvince='" + userProvince + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userCounty='" + userCounty + '\'' +
                ", userCompanyName='" + userCompanyName + '\'' +
                ", userCompanycccNumber='" + userCompanycccNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userState='" + userState + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleCreateTime='" + roleCreateTime + '\'' +
                ", roleUpdateTime='" + roleUpdateTime + '\'' +
                ", resourceId='" + resourceId + '\'' +
                ", resourceName='" + resourceName + '\'' +
                ", resourceUrl='" + resourceUrl + '\'' +
                ", resourceCode='" + resourceCode + '\'' +
                ", parectResourceId='" + parectResourceId + '\'' +
                '}';
    }
}
