package com.tong.entity;

/**
 * @author ：Tong
 * @date ：Created in 2020/2/17 9:32
 * @description：
 * @version: $
 */
public class User {
    private String userId;

    private String userName;

    private String accountPwd;

    private String userMobile;

    private String userStt;

    private String userRole;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserStt() {
        return userStt;
    }

    public void setUserStt(String userStt) {
        this.userStt = userStt;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", accountPwd='" + accountPwd + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userStt='" + userStt + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
