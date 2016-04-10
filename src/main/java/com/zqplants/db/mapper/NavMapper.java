/**
* 文件名：NavMapper.java
*
* 版本信息：
* 日期：2016-1-13
*
*/
package com.zqplants.db.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.Nav;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-13 下午5:10:51
 */
public interface NavMapper {

    public final static String GET_ALL_NAV = "SELECT " +
    		"ID,FILENAME,DESCRIPTION,TITLE,URL FROM " +
    		TableName.TABLE_VIP_NAV + 
    		" where site_id = #{siteId} and n_state = 1 order by ordernum ";
    
    @Select(GET_ALL_NAV)
    @Options(useCache = true, flushCache = false)  
    public List<Nav> getAllNav(int siteId);

}
