package com.laptrinhjavaweb.controller;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.input.BuildingSearchInput;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.emyeuanh.BuildingEmyeuanh;
import com.laptrinhjavaweb.service.impl.BuildingServiceImpl;

public class BuildingController {
	private BuildingService buildingService = new BuildingServiceImpl();
	
	public List<BuildingDTO> findBuilding(BuildingSearchInput buildingSearch) {
		List<BuildingDTO> results = new ArrayList<>();
		List<BuildingEmyeuanh> buildingEmyeuanhs = buildingService.findBuilding(buildingSearch);
		for(BuildingEmyeuanh item: buildingEmyeuanhs) {
			BuildingDTO buildingModel = new BuildingDTO();
			buildingModel.setName(item.getName());
			results.add(buildingModel);
			
		}
		return results;
	}

}
