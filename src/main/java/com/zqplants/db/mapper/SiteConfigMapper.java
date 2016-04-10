package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.SiteConfig;

public interface SiteConfigMapper {

	/**
	 * 
	 */
	public final static String GET_CONFIGURATION_BY_DOMAIN = "SELECT * FROM "+
			TableName.TABLE_SITE_CONFIG+
			" WHERE s_domain = #{domain} and s_state = 1";
	@Select(GET_CONFIGURATION_BY_DOMAIN)
	@Options(useCache = true,flushCache = false)
	public SiteConfig getSiteConfigByDomain(String domain);
	
	/**
	 * 
	 */
	public final static String GET_CONFIGURATION_BY_ID = "SELECT * FROM "+
			TableName.TABLE_SITE_CONFIG+
			" WHERE s_id = #{id} and s_state = 1";
	@Select(GET_CONFIGURATION_BY_ID)
	@Options(useCache = true,flushCache = false)
	public SiteConfig getSiteConfig(int id);
	
	public final static String GET_ALL_AVAILABLE = "SELECT * FROM "+
			TableName.TABLE_SITE_CONFIG+
			" WHERE s_state = 1";
	
	@Select(GET_ALL_AVAILABLE)
	@Options(useCache = true,flushCache = false)
	public List<SiteConfig> getAllAvailable();
	
}
