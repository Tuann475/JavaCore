package com.laptrinhjavaweb.dao.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.dao.BuildingDao;
import com.laptrinhjavaweb.dao.anhyeuem.BuildingAnhyeuem;
import com.laptrinhjavaweb.utils.ConnectionUtils;
import com.laptrinhjavaweb.utils.IntegerUtils;
import com.laptrinhjavaweb.utils.StringUtils;

public class BuildingDaoImpl implements BuildingDao {

	@Override
	public BuildingAnhyeuem[] findBuilding(Integer floorArea, String name, String ward, String street, String district) {
		   BuildingAnhyeuem[] results = new BuildingAnhyeuem[] {};
		   Connection conn = null;
		   Statement stmt = null;
		   ResultSet rs = null;
		      try {
		    	  StringBuilder query = new StringBuilder("SELECT * FROM Building "+SystemConstant.ONE_EQUAL_ONE+"");
	    	  if (!StringUtils.isNullOrEmty(name)) {
		    		  query.append("and name like '%"+ name + "%'");
		    	  }
		    	  if (!StringUtils.isNullOrEmty(street)) {
		    		  query.append("and street like '%"+ street + "%'");
		    	  }
		    	  if (!StringUtils.isNullOrEmty(district)) {
		    		  query.append("and district like '%"+ district + "%'");
		    	  }
		    	  if (!StringUtils.isNullOrEmty(ward)) {
		    		  query.append("and ward like '%"+ ward + "%'");
		    	  }
		    	  
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  conn = ConnectionUtils.getConnection();
			      stmt = conn.createStatement();
			      rs = stmt.executeQuery(query.toString());	
			      ResultSetMetaData rsmd = rs.getMetaData();
			      int i=0;;
		 	         while(rs.next()){
		 	        	BuildingAnhyeuem buildingAnhyeuem = new BuildingAnhyeuem();
		 	        	buildingAnhyeuem.setName(rs.getString("name"));
		 	        	buildingAnhyeuem.setStreet(rs.getString("street"));
		 	        	buildingAnhyeuem.setWard(rs.getString("ward"));
		 	        	buildingAnhyeuem.setDistrict(rs.getString("district"));
		 	        	buildingAnhyeuem.setFloorArea(rs.getInt("floorArea"));
		 	        	results[i]  =buildingAnhyeuem;
		 	        	i++;
		 	         }
		 	         return results;

		 	      } catch (ClassNotFoundException | SQLException e) {
		 	         System.out.println("Error: " +e.getMessage());

		 	      }finally {
		 	    	  try {
		 	    		  if (conn != null) {
		 	    			  conn.close();
		 	    		  }
		 	    		  if (stmt != null) {
		 	    			 stmt.close();
		 	    		  }
		 	    		  if (rs != null) {
		 	    			 rs.close();
		 	    		  }
/*				 	         conn.close();
				 	         stmt.close();
				 	         rs.close();*/
					} catch (Exception e) {
						System.out.println("Error: " +e.getMessage());
					}

				}
		      return null;
	   }
	}

