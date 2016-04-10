package com.zqplants.common.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.SiteDomainDao;
import com.zqplants.db.mapper.DomainMapper;
import com.zqplants.entity.SiteDomain;

@Component("com.zqplants.common.dao.SiteDomainDao")
public class SiteDomainDaoImpl implements SiteDomainDao{

	@Override
	public List<SiteDomain> getAll() {
		return sqlSession.getMapper(DomainMapper.class).getAll();
	}
	
	@Autowired
	SqlSession sqlSession;
	

}
