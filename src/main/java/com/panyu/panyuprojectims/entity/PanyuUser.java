package com.panyu.panyuprojectims.entity;
public class PanyuUser {
    private String userId;
    private String userProvince;
    private String userCity;
    private String userCounty;
    private String userCompanyName;
    private String userCompanycccNumber;
    private String userName;
    private String userEmail;
    private String userPwd;
    public PanyuUser() {
        super();
    }
    public PanyuUser(String userId,String userProvince,String userCity,String userCounty,String userCompanyName,String userCompanycccNumber,String userName,String userEmail,String userPwd) {
        super();
        this.userId = userId;
        this.userProvince = userProvince;
        this.userCity = userCity;
        this.userCounty = userCounty;
        this.userCompanyName = userCompanyName;
        this.userCompanycccNumber = userCompanycccNumber;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPwd = userPwd;
    }
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserProvince() {
        return this.userProvince;
    }

    public void setUserProvince(String userProvince) {
        this.userProvince = userProvince;
    }

    public String getUserCity() {
        return this.userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserCounty() {
        return this.userCounty;
    }

    public void setUserCounty(String userCounty) {
        this.userCounty = userCounty;
    }

    public String getUserCompanyName() {
        return this.userCompanyName;
    }

    public void setUserCompanyName(String userCompanyName) {
        this.userCompanyName = userCompanyName;
    }

    public String getUserCompanycccNumber() {
        return this.userCompanycccNumber;
    }

    public void setUserCompanycccNumber(String userCompanycccNumber) {
        this.userCompanycccNumber = userCompanycccNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPwd() {
        return this.userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
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
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}
