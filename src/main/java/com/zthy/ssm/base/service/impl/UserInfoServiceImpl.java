package com.zthy.ssm.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import com.github.pagehelper.PageHelper;
import com.zthy.ssm.base.mapper.UserInfoMapper;
import com.zthy.ssm.base.model.UserInfo;
import com.zthy.ssm.base.service.UserInfoService;

@Service(value="userInfoService")
@Transactional
public class UserInfoServiceImpl extends BaseService<UserInfo> implements UserInfoService{
	
	@Resource
	protected UserInfoMapper userInfoMapper;
	
	public List<UserInfo> findAll(){
		Example example=new Example(UserInfo.class);
		example.createCriteria().andLike("username", "%"+"梁"+"%");
		return selectByExample(example);
	}
	/**
	 * 分页查询
	 */
	@Override
	public List<UserInfo> selectByCountry(int page, int rows) {
		Example example=new Example(UserInfo.class);
		example.createCriteria().andLike("username", "%"+"梁"+"%");
		PageHelper.startPage(page, rows);
		return userInfoMapper.selectByExample(example);
	}
}
