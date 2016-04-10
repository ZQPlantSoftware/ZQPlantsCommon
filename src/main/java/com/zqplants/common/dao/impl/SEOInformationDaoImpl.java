/**
* 文件名：SEOInformationDaoInfo.java
*
* 版本信息：
* 日期：2016-1-11
*
*/
package com.zqplants.common.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.zqplants.common.dao.SEOInformationDao;
import com.zqplants.db.mapper.SEOMapper;
import com.zqplants.entity.SEO;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-11 下午2:09:46
 */
@Component(value = "com.vip.portugal.dao.SEOInformationDao")
public class SEOInformationDaoImpl implements SEOInformationDao{

    /**
     * 创建一个新的实例 SEOInformationDaoInfo.
     *
     */
    public SEOInformationDaoImpl() {}

    /* 
    * @see com.vip.portugal.dao.SEOInformationDao#getSEOInfo(java.lang.String)
    */  
        
    @Override
    public SEO getSEOInfo(String pageUrl) {
	return session.getMapper(SEOMapper.class).getSEOInformationByPageUrl(pageUrl);
    }
    @Resource(name="sqlSession")
    private SqlSession session;

}
