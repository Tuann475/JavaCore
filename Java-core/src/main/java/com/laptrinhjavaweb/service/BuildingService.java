package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.model.BuildingModel;
import com.laptrinhjavaweb.service.emyeuanh.BuildingEmyeuanh;

public interface BuildingService {

	BuildingEmyeuanh[] findBuilding(BuildingModel buildingModel);

}
