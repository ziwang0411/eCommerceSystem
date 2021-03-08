package com.imooc.o2o.dao;

import java.util.List;

import com.imooc.o2o.entity.Area;

public interface AreaDao {
	/**
	 * list the list of areas
	 * @return areaList
	 */
	List<Area> queryArea();
}
