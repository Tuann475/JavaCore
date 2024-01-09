package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.input.BuildingSearchInput;
import com.laptrinhjavaweb.output.BuildingOutPut;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingOutPut> findBuilding(BuildingSearchInput buildingSearch) {
		List<BuildingOutPut> results = new ArrayList<>();
		return results;
	}
	public BuildingDTO insert(BuildingDTO newBuilding) {
	return null;
	}

}
