package com.laptrinhjavaweb.view;

import com.laptrinhjavaweb.controller.BuildingController;
import com.laptrinhjavaweb.model.BuildingModel;

public class BuildingListView {
	
	public static void main(String[]args) {
		   Integer floorArea = null;
		   String name =null;
		   String ward = null;
		   String street = null;
		   String district =null;
		   
		   
		   BuildingModel buildingSearch = new BuildingModel();
		   buildingSearch.setFloorArea(floorArea);
		   buildingSearch.setName(name);
		   buildingSearch.setWard(ward);
		   buildingSearch.setStreet(street);
		   buildingSearch.setDistrict(district);
		   BuildingController buildingController = new BuildingController();
		   BuildingModel[] buildings = buildingController.findBuilding(buildingSearch);
/*		   for (BuildingModel item: buildings) {
			   
		   }*/
	}
}
