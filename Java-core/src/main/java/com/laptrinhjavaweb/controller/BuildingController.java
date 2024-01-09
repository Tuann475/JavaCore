package com.laptrinhjavaweb.controller;

import com.laptrinhjavaweb.model.BuildingModel;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public BuildingModel[] findBuilding(BuildingModel buildingSearch) {
		buildingService.findBuilding(buildingSearch);
		return null;
	}

}
