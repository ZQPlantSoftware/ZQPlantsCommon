package com.zqplants.common.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.PGallaryConfigDao;
import com.zqplants.db.mapper.IPGallaryConfigMapper;
import com.zqplants.db.mapper.IPGallarySingleMapper;
import com.zqplants.entity.PGallaryConfig;

@Component("com.zqplants.common.dao.PGallaryConfigDao")
public class PGallaryConfigDaoImpl implements PGallaryConfigDao{

	@Override
	public PGallaryConfig getById(int id) {
		PGallaryConfig config = sqlSession.getMapper(IPGallaryConfigMapper.class).getById(id);
		
		config.setGallarys(
				sqlSession.getMapper(IPGallarySingleMapper.class).getSingles(
						config.getId()
						)
				);
		return config;
	}

	@Resource(name="sqlSession")
	SqlSession sqlSession;
}
