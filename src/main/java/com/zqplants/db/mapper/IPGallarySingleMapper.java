package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.PGallarySingle;

@CacheNamespace(readWrite=false, implementation=org.mybatis.caches.ehcache.EhcacheCache.class)
public interface IPGallarySingleMapper {

	public final static String SQL_GET_BY_PGCID = "SELECT * FROM "+
			TableName.TABLE_HOUSE_PGALLARY_SINGLE+
			" WHERE PGC_ID = #{pgc_id}" +
			" ORDER BY PGS_ORDER";
	
	@Select(SQL_GET_BY_PGCID)
	@Options(useCache=true,flushCache=false)
	List<PGallarySingle> getSingles(@Param("pgc_id")Integer pgc_id);
	
}
