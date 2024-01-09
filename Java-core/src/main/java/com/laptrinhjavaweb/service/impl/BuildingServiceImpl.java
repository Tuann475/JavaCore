package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.dao.BuildingDao;
import com.laptrinhjavaweb.dao.Impl.BuildingDaoImpl;
import com.laptrinhjavaweb.dao.anhyeuem.BuildingAnhyeuem;
import com.laptrinhjavaweb.model.BuildingModel;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.emyeuanh.BuildingEmyeuanh;

public class BuildingServiceImpl implements BuildingService{
	
	private BuildingDao buildingDao = new BuildingDaoImpl();
	
	@Override
	public BuildingEmyeuanh[] findBuilding(BuildingModel buildingModel) {
		BuildingAnhyeuem[] buildingEmyeuanhs = new BuildingAnhyeuem[2] {};
		BuildingAnhyeuem[] anhyeuems = buildingDao.findBuilding(buildingModel.getFloorArea(),buildingModel.getName(), buildingModel.getWard(), 
				buildingModel.getStreet(), buildingModel.getDistrict());
		int i =0;
		for(BuildingAnhyeuem item: anhyeuems) {
			BuildingEmyeuanh buildingEmyeuanh = new BuildingEmyeuanh();
			buildingEmyeuanh.setName(ỉtem.getName());
			buildingEmyeuanhs[i] = buildingEmyeuanh;
			i++;
	}
	return null;
}
}
