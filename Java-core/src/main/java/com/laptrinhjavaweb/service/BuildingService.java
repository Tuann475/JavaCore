package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.input.BuildingSearchInput;
import com.laptrinhjavaweb.service.emyeuanh.BuildingEmyeuanh;

public interface BuildingService {

	List<BuildingEmyeuanh> findBuilding(BuildingSearchInput buildingModel);

}
