/**
* 文件名：HouseDaoImpl.java
*
* 版本信息：
* 日期：2016-1-22
*
*/
package com.zqplants.common.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.HouseDao;
import com.zqplants.db.mapper.HouseMapper;
import com.zqplants.entity.House;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-22 上午10:48:23
 */
@Component(value = "com.vip.portugal.dao.HouseDao")
public class HouseDaoImpl implements HouseDao{

    /* 
    * @see com.vip.portugal.dao.HouseDao#getHouse(int)
    */  
        
    @Override
    public List<House> getHouse(int limit,int category) {
    	return session.getMapper(HouseMapper.class).getHouse(limit,category);
    }

    /* 
    * @see com.vip.portugal.dao.HouseDao#getHouse(int, int)
    */  
        
    @Override
    public List<House> getHouse(int limit, int state,int category) {
	return session.getMapper(HouseMapper.class).getHouseByState(state, limit,category);
    }

    /* 
    * @see com.vip.portugal.dao.HouseDao#getHouseById(int)
    */  
        
    @Override
    public House getHouseById(int id) {
	return session.getMapper(HouseMapper.class).getHouseById(id);
    }
    
    @Resource(name="sqlSession")
    private SqlSession session;

    /* 
    * @see com.vip.portugal.dao.HouseDao#getHouseByType(int, int)
    */  
        
    @Override
    public List<House> getHouseByType(int type, int limit,int category) {
	return session.getMapper(HouseMapper.class).getHouseByType(type, limit,category);
    }

}
