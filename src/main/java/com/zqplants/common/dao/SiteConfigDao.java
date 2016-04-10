package com.zqplants.common.dao;

import java.util.List;

import com.zqplants.entity.SiteConfig;

public interface SiteConfigDao {

	public SiteConfig getConfig(String domain);
	
	public SiteConfig getConfig(int id);
	
	public List<SiteConfig> getAllAvailable();
	
	
}
