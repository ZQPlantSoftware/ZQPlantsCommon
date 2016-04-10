package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.SiteDomain;

public interface DomainMapper {

	public final static String SQP_GET_ALL_DOMAIN = "SELECT * FROM "+TableName.TABLE_SITE_DOMAIN;
	
	@Select(SQP_GET_ALL_DOMAIN)
	@Options(useCache=true,flushCache=false)
	public List<SiteDomain> getAll();
	
}
