package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.input.BuildingSearchInput;
import com.laptrinhjavaweb.output.BuildingOutPut;

public interface BuildingService {

	List<BuildingOutPut> findBuilding(BuildingSearchInput buildingModel);

}
