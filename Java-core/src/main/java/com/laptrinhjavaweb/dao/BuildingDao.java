package com.laptrinhjavaweb.dao;

import com.laptrinhjavaweb.dao.anhyeuem.BuildingAnhyeuem;

public interface BuildingDao {


	BuildingAnhyeuem[] findBuilding(Integer FloorArea, String name, String ward, String street, String district);




}
