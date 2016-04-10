package com.zqplants.db.mapper;

import java.awt.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Many;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.PGallaryConfig;

public interface IPGallaryConfigMapper {

	public final static String GET_BY_ID = "SELECT * FROM "+
			TableName.TABLE_HOUSE_PGALLARY_CONFIG+
			" WHERE id = #{id} ";
	
	@Select(GET_BY_ID)
	@Results({
			@Result(property="id",column="id")//,
			//@Result(property="gallarys",column="id",javaType=List.class,many=@Many(select="com.zqplants.db.mapper.IPGallarySingleMapper.getSingles"))
	})
	public PGallaryConfig getById(@Param("id")int id);
}
