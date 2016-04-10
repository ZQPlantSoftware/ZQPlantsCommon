package com.zqplants.common.dao;

import java.util.List;

import com.zqplants.entity.HouseCategory;

public interface HouseCategoryDao {

	public HouseCategory getBySiteId(int siteId);
	
	public HouseCategory getById(int id);
	
	public List<HouseCategory> getAll();
}
