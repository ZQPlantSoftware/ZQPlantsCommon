/**
* 文件名：HouseMapper.java
*
* 版本信息：
* 日期：2016-1-22
*
*/
package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.One;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.House;
import com.zqplants.entity.HouseCategory;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-22 上午10:48:57
 */
public interface HouseMapper {

    public final static String GET_HOUSE_LIMIT = "SELECT \r\n" + 
    		"	* \r\n" + 
    		"	FROM "+TableName.TABLE_VIP_HOUSE+"\r\n" + 
    		"   WHERE category_id = #{category_id}" + 
    		"	ORDER BY ORDERNUM LIMIT #{limit}";

    @Select(GET_HOUSE_LIMIT)
    @Results({
    	@Result(property="category",column="category_id",javaType=HouseCategory.class,one=@One(select="com.zqplants.db.mapper.IHouseCategoryMapper.getById"))
    })  
    public List<House> getHouse(@Param("limit")int limit,
    		@Param("category_id" )int category_id
    		);
    
    public final static String GET_HOUSE_LIMIT_STATE = "SELECT \r\n" + 
		"	*\r\n" + 
		"	FROM "+TableName.TABLE_VIP_HOUSE+"\r\n" + 
		"	WHERE STATE = #{state}"+
		"   and category_id = #{category_id}" + 
		"	ORDER BY ORDERNUM LIMIT #{limit}";
    @Select(GET_HOUSE_LIMIT_STATE)
    @Results({
    	@Result(property="category",column="category_id",javaType=HouseCategory.class,one=@One(select="com.zqplants.db.mapper.IHouseCategoryMapper.getById"))
    })    
    public List<House> getHouseByState(@Param("state" )int state,
	    @Param("limit" )int limit,
	    @Param("category_id" )int category_id
    	);
    
    public final static String GET_HOUSE_BY_ID = "SELECT \r\n" + 
		"	*\r\n" + 
		"	FROM "+TableName.TABLE_VIP_HOUSE+"\r\n" + 
		"	WHERE ID = #{id}";
    
    @Select(GET_HOUSE_BY_ID)
    @Results({
    	@Result(property="category",column="category_id",javaType=HouseCategory.class,one=@One(select="com.zqplants.db.mapper.IHouseCategoryMapper.getById"))
    })   
    public House getHouseById(int id);
    
    public final static String GET_HOUSE_BY_TYPE = "SELECT \r\n" + 
		"	*\r\n" + 
		"	FROM "+TableName.TABLE_VIP_HOUSE+"" +
		"	WHERE H_TYPE = #{type}\r\n" +
		"   and category_id = #{category_id}" + 
		"	ORDER BY ORDERNUM LIMIT #{limit}";
    
    @Select(GET_HOUSE_BY_TYPE)
    @Results({
    	@Result(property="category",column="category_id",javaType=HouseCategory.class,one=@One(select="com.zqplants.db.mapper.IHouseCategoryMapper.getById"))
    })   
    public List<House> getHouseByType(@Param("type" )int type,
	    @Param("limit" )int limit,
	    @Param("category_id" )int category_id
	    );
    
    public final static String GET_HOUSE_BY_CATEGORY = "SELECT * FROM "+
    		TableName.TABLE_VIP_HOUSE+
    		" WHERE CATEGORY_ID = #{cid}";
    
    @Select(GET_HOUSE_BY_CATEGORY)
    @Results(
    		@Result(property="category",column="category_id",javaType=HouseCategory.class,one=@One(select="com.zqplants.db.mapper.IHouseCategoryMapper"))
    		)
    public List<House> getHouseByCategoryId(int cid);
    
    /*
     * =-=-=-=-=增删改=-=-=-=-=
     */
    
    public final static String ADD_HOUSE = "INSERT INTO " + TableName.TABLE_VIP_HOUSE+
    		" (TITLE,DESCRIPTION,IMAGES,H_TYPE,H_MOMONEY,H_ADDRESS,HANDIMAGE,H_CITY,H_BEDNUM,H_BATHSNUM,H_PLOTAREA,H_BUILDUPAREA,H_AGEOFPROPERTY,ORDERNUM) " +
    		" VALUSE (#{TITLE},#{DESCRIPTION},#{IMAGES},#{H_TYPE},#{H_MOMONEY},#{H_ADDRESS},#{HANDIMAGE},#{H_CITY},#{H_BEDNUM},#{H_BATHSNUM},#{H_PLOTAREA},#{H_BUILDUPAREA},#{H_AGEOFPROPERTY},#{ORDERNUM}) WHERE ID = #{ID}";
    
    
    /**
     * 
     */
    @Insert(ADD_HOUSE)
    public int addHouse(House house);
    
    public final static String UPDATE_HOUSE = "UPDATE SET";
    
}
