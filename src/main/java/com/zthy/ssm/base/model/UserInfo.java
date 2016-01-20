package com.zthy.ssm.base.model;

import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
    @Column(name = "UserInfoId")
    private Integer userinfoid;

    @Column(name = "GroupId")
    private Integer groupid;

    @Column(name = "LoginName")
    private String loginname;

    @Column(name = "LoginPwd")
    private String loginpwd;

    @Column(name = "UserName")
    private String username;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Qq")
    private String qq;

    @Column(name = "Strtus")
    private Integer strtus;

    /**
     * @return UserInfoId
     */
    public Integer getUserinfoid() {
        return userinfoid;
    }

    /**
     * @param userinfoid
     */
    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    /**
     * @return GroupId
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * @return LoginName
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * @param loginname
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * @return LoginPwd
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * @param loginpwd
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd;
    }

    /**
     * @return UserName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return Strtus
     */
    public Integer getStrtus() {
        return strtus;
    }

    /**
     * @param strtus
     */
    public void setStrtus(Integer strtus) {
        this.strtus = strtus;
    }
}