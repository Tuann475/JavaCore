package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.BuildingDao;
import com.laptrinhjavaweb.dao.Impl.BuildingDaoImpl;
import com.laptrinhjavaweb.dao.anhyeuem.BuildingAnhyeuem;
import com.laptrinhjavaweb.input.BuildingSearchInput;
import com.laptrinhjavaweb.output.BuildingOutPut;
import com.laptrinhjavaweb.service.BuildingService;
import com.laptrinhjavaweb.service.emyeuanh.BuildingEmyeuanh;

public class BuildingServiceImpl implements BuildingService{
	
	private BuildingDao buildingDao = new BuildingDaoImpl();
	
	@Override
	public List<BuildingOutPut> findBuilding(BuildingSearchInput buildingModel) {
		List<BuildingOutPut> buildingEmyeuanhs = new ArrayList<>();
		List<BuildingAnhyeuem> anhyeuems = buildingDao.findBuilding(buildingModel.getFloorArea(),buildingModel.getName(), buildingModel.getWard(), 
				buildingModel.getStreet(), buildingModel.getDistrict());
		//int i =0;
		for(BuildingAnhyeuem item: anhyeuems) {
			BuildingOutPut buildingOutPut = new BuildingOutPut();
			buildingOutPut.setName(item.getName());
			buildingOutPut.setAddress(item.getStreet()+" - "+item.getWard()+" - "+item.getDistrict());
			//buildingEmyeuanhs[i] = buildingEmyeuanh;
			//i++;
			buildingEmyeuanhs.add(buildingOutPut);
	}
	return buildingEmyeuanhs;
}
}
