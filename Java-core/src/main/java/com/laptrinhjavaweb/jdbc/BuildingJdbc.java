package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.utils.IntegerUtils;
import com.laptrinhjavaweb.utils.StringUtils;

public class BuildingJdbc {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/javacore";
	   static final String USER = "root";
	   static final String PASS = "123321";
	   

	   public static void main(String[] args) {
		   
		   //beginer
		   //input
		   String name =null;
		   String street = null;
		   String district =null;
		   String ward = null;
		   Integer floorArea = null;
		   Integer numberOfBasement=null;
		   
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
		    	  if (IntegerUtils.isNullOrZero(floorArea)) {
		    		  query.append("and floorArea like "+ floorArea + "");
		    	  }
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      stmt = conn.createStatement();
			      rs = stmt.executeQuery(query.toString());	
			      ResultSetMetaData rsmd = rs.getMetaData();
		 	         while(rs.next()){
		 	        	System.out.print("Id: " + rs.getLong("id")+ ", Type: "+rsmd.getColumnType(2));
		 	            System.out.print("Name: " + rs.getString("name"));
		 	            System.out.print(", Street: " + rs.getString("street"));
		 	            System.out.print(", District: " + rs.getString("district"));
		 	            System.out.print(", ward: " + rs.getString("ward"));
		 	            System.out.println(", FloorArea: " + rs.getString("FloorArea"));
		 	         }

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
		   //experience
/*		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 	         Statement stmt = conn.createStatement();
		 	         ResultSet rs = stmt.executeQuery(QUERY);
		 	      ){ 
		 	         while(rs.next()){
		 	        	System.out.print("Id: " + rs.getLong("id"));
		 	            System.out.print(", Name: " + rs.getString("name"));
		 	            System.out.print(", Street: " + rs.getString("street"));
		 	            System.out.print(", District: " + rs.getString("district"));
		 	            System.out.print(", ward: " + rs.getString("ward"));
		 	            System.out.println(", FloorArea: " + rs.getString("FloorArea"));
		 	         }
		 	      } catch (SQLException e) {
		 	    	 e.printStackTrace();
		 	      }*/
		 	      
	   }
}
