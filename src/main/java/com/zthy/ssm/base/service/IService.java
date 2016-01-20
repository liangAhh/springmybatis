package com.zthy.ssm.base.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 通用接口
 * @author 梁冲
 *
 * @param <T>
 */
@Service
public interface IService<T> {
	
	/**
	 * 根据主键返回实体类
	 * @param key
	 * @return
	 */
	T selectByKey(Object key);
	
	/**
	 * 返回所有实体类
	 * @return
	 */
	List<T> findAll();

	/**
	 * 保存一个实体
	 * @param entity
	 * @return
	 */
    int save(T entity);

    /**
     * 根据主键字段删除
     * @param key
     * @return
     */
    int delete(Object key);
    
    /**
     * 删除实体
     * @param entity
     * @return
     */
    int deleteEntity(T entity);
    
    /**
     * 根据example条件删除信息
     * @param example
     * @return
     */
    int deleteByExample(Object example);

    /**
     * 根据主键字段更新实体全部信息
     * @param entity
     * @return
     */
    int updateAll(T entity);

    /**
     * 根据主键字段更新实体内属性不为null的值
     * @param entity
     * @return
     */
    int updateNotNull(T entity);
    
    /**
     * 根据example条件更新实体内的数据，null值会被更新
     * @param example
     * @return
     */
    int updateByExample(T entity,Object example);
    
    /**
     * 根据example条件更新实体内的数据，null不会给更新
     * @param entity
     * @param example
     * @return
     */
    int updateByExampleNotNull(T entity,Object example);

    /**
     * 根据example条件查询
     * @param example
     * @return
     */
    List<T> selectByExample(Object example);
    
    /**
     * 根据example条件分页查询
     * @param example	条件
     * @param page 	页数
     * @param rows	行数
     * @return
     */
    List<T> selectPageByExample(Object example,int page,int rows);
    
    /**
     * 根据实体内的属性查询总数
     * @param entity
     * @return
     */
    int selectCountByEntity(T entity);

    /**
     * 根据example条件查询总数
     * @param example
     * @return
     */
    int selectCountByExample(Object example);
    
    //TODO 其他...
}
