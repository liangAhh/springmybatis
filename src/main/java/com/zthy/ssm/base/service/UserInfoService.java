package com.zthy.ssm.base.service;

import java.util.List;

import com.zthy.ssm.base.model.UserInfo;


public interface UserInfoService{
	/**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    List<UserInfo> selectByCountry(int page, int rows);
	
	public List<UserInfo> findAll();
}
