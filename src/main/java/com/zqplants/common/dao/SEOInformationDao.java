/**
* 文件名：SEOInformationDao.java
*
* 版本信息：
* 日期：2016-1-11
*
*/
package com.zqplants.common.dao;

import com.zqplants.entity.SEO;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-11 下午2:07:17
 */
public interface SEOInformationDao {

    /**
     * 创建一个新的实例 SEOInformationDao.
     *
     */
    public SEO getSEOInfo(String pageUrl);
    
}
