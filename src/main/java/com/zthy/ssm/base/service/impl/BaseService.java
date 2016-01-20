package com.zthy.ssm.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import tk.mybatis.mapper.common.Mapper;

import com.github.pagehelper.PageHelper;
import com.zthy.ssm.base.service.IService;

public abstract class BaseService<T> implements IService<T>{

	@Resource
	protected Mapper<T> mapper;
	
	public Mapper<T> getMapper() {
        return mapper;
    }
	
	@Override
    public T selectByKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

	public List<T> findAll(){
		return mapper.selectAll();
	}
	
    public int save(T entity) {
        return mapper.insert(entity);
    }

    public int delete(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }
    
    public int deleteEntity(T entity){
    	return mapper.delete(entity);
    }

    public int deleteByExample(Object example){
    	return mapper.deleteByExample(example);
    }
    
    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    public int updateByExample(T entity,Object example){
    	return mapper.updateByExample(entity, example);
    }
    
    public int updateByExampleNotNull(T entity,Object example){
    	return mapper.updateByExampleSelective(entity, example);
    }
    
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }
    
    public List<T> selectPageByExample(Object example,int page,int rows){
    	PageHelper.startPage(page, rows);
    	return mapper.selectByExample(example);
    }

    public int selectCountByEntity(T entity){
    	return mapper.selectCount(entity);
    }
    
    public int selectCountByExample(Object example){
    	return mapper.selectCountByExample(example);
    }
    //TODO 其他...
}
