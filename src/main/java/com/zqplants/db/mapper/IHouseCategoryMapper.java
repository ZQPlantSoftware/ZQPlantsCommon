package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.HouseCategory;

public interface IHouseCategoryMapper {

	public final static String GET_CATEGORY_BY_ID = "SELECT * FROM "+
	TableName.TABLE_HOUSE_CATEGORY+
	"  WHERE ID=#{categoryId}";
	
	@Select(GET_CATEGORY_BY_ID)
	@Options(useCache = true,flushCache = false)
	public HouseCategory getById(int id);
	
	public final static String GET_CATEGORY = "SELECT * FROM "+
	TableName.TABLE_HOUSE_CATEGORY;
	
	@Select(GET_CATEGORY_BY_ID)
	@Options(useCache = true,flushCache = false)
	public List<HouseCategory> getAll();
	
	public final static String GET_CATEGORY_BY_SITE_ID = " select * from "+
	TableName.TABLE_HOUSE_CATEGORY+" A "+
	" where A.id in ( "+
	" select category_id from "+TableName.TABLE_HOUSE_CATEGORY_SITE+
	" where site_id = #{site_id}) ";
	
	@Select(GET_CATEGORY_BY_SITE_ID)
	@Options(useCache=true,flushCache=false)
	public HouseCategory getBySiteId(int site_id);
}