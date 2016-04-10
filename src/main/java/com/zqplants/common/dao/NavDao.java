/**
* 文件名：NavDao.java
*
* 版本信息：
* 日期：2016-1-13
*
*/
package com.zqplants.common.dao;

import java.util.List;

import com.zqplants.entity.Nav;

/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-13 下午5:06:20
 */
public interface NavDao {
    
    public List<Nav> getAllNav(int siteId);
    
}
