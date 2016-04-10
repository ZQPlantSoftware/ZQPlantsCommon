package com.zqplants.common.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.HouseCategoryDao;
import com.zqplants.db.mapper.IHouseCategoryMapper;
import com.zqplants.entity.HouseCategory;

@Component("com.zqplants.common.dao.HouseCategoryDao")
public class HouseCategoryDaoImpl implements HouseCategoryDao{

	@Override
	public HouseCategory getBySiteId(int siteId) {
		return sqlSession.getMapper(IHouseCategoryMapper.class).getBySiteId(siteId);
	}

	@Override
	public HouseCategory getById(int id) {
		return sqlSession.getMapper(IHouseCategoryMapper.class).getById(id);
	}

	@Override
	public List<HouseCategory> getAll() {
		return sqlSession.getMapper(IHouseCategoryMapper.class).getAll();
	}

	@Autowired
	SqlSession sqlSession;
}
