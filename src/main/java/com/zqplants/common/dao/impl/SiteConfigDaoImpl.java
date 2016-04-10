package com.zqplants.common.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.SiteConfigDao;
import com.zqplants.db.mapper.SiteConfigMapper;
import com.zqplants.entity.SiteConfig;

@Component("com.zqplants.common.dao.SiteConfigDao")
public class SiteConfigDaoImpl implements SiteConfigDao{

	@Override
	public SiteConfig getConfig(String domain) {
		return sqlSession.getMapper(SiteConfigMapper.class).getSiteConfigByDomain(domain);
	}

	@Override
	public SiteConfig getConfig(int id) {
		return sqlSession.getMapper(SiteConfigMapper.class).getSiteConfig(id);
	}

	@Override
	public List<SiteConfig> getAllAvailable() {
		return sqlSession.getMapper(SiteConfigMapper.class).getAllAvailable();
	}

	@Resource(name = "sqlSession")
	SqlSession sqlSession;
	

}
