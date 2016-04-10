/**
* 文件名：HouseDao.java
*
* 版本信息：
* 日期：2016-1-22
*
*/
package com.zqplants.common.dao;

import java.util.List;

import com.zqplants.entity.House;


/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-22 上午10:46:18
 */
public interface HouseDao {

    public List<House> getHouse(int limit,int category);
    
    public List<House> getHouse(int limit,int state,int category);
    
    public House getHouseById(int id);
    
    public List<House> getHouseByType(int type,int limit,int category);
}
