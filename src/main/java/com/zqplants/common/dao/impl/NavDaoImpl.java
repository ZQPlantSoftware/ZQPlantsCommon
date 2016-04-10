/**
* 文件名：NavDaoImpl.java
*
* 版本信息：
* 日期：2016-1-13
*
*/
package com.zqplants.common.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.NavDao;
import com.zqplants.db.mapper.NavMapper;
import com.zqplants.entity.Nav;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-13 下午5:09:53
 */
@Component(value = "com.vip.portugal.dao.NavDao")
public class NavDaoImpl implements NavDao{

    /* 
    * @see com.vip.portugal.dao.NavDao#getAllNav()
    */  
        
    @Override
    public List<Nav> getAllNav(int siteId) {
	
	return session.getMapper(NavMapper.class).getAllNav(siteId);
    }
    @Resource(name="sqlSession")
    SqlSession session;
}
