/**
* 文件名：SEOMapper.java
*
* 版本信息：
* 日期：2016-1-11
*
*/
package com.zqplants.db.mapper;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.zqplants.db.utils.TableName;
import com.zqplants.entity.SEO;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-11 下午2:14:59
 */
public interface SEOMapper {

    public static final String GET_SQOINFO_BY_PAGEURL_SQL = "SELECT" +
    		" ID,PAGEURL,DESCRIPTION,TITLE,KEYWORD" +
    		" FROM "+TableName.TABLE_VIP_SEO+" WHERE PAGEURL = #{pageUrl}" ;
    
    @Select(GET_SQOINFO_BY_PAGEURL_SQL)
    @Options(useCache = true, flushCache = false)  
    public SEO getSEOInformationByPageUrl(String pageUrl);
}
