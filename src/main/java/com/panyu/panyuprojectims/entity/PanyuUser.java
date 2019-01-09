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
    private String userTel;
    private String userPwd;
    private String userState;
    public PanyuUser() {
        super();
    }
    public PanyuUser( String userProvince, String userCity, String userCounty, String userCompanyName, String userCompanycccNumber, String userName, String userEmail, String userTel, String userPwd, String userState) {

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
    }

    public PanyuUser(String userId, String userProvince, String userCity, String userCounty, String userCompanyName, String userCompanycccNumber, String userName, String userEmail, String userTel, String userPwd, String userState) {
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

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
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
                '}';
    }
}
