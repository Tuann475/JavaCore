package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
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
/*		    	  StringBuilder query = new StringBuilder("SELECT * FROM building where 1 = 1");
		    	  // build sql query
		    	  if ( name != null && name != "") {
		    		  query += "and name like '%"+ name + "%'";
		    	  }
		    	  if ( street != null && street != "") {
		    		  query += "and street like '%"+ street + "%'";
		    	  }
		    	  if ( district != null && district != "") {
		    		  query += "and district like '%"+ district + "%'";
		    	  }
		    	  if ( ward != null && ward != "") {
		    		  query += "and ward like '%"+ ward + "%'";
		    	  }
		    	  if ( floorArea != null ) {
		    		  query += "and floorArea like "+ floorArea + "";
		    	  }
		    	  if ( numberOfBasement != null ) {
		    		  query += "and numberOfBasement like "+ numberOfBasement + "";
		    	  } */
		    	  StringBuilder query = new StringBuilder("SELECT * FROM building where 1 = 1");
		    	  if ( name != null && name != "") {
		    		  query.append("and name like '%"+ name + "%'");
		    	  }
		    	  if ( street != null && street != "") {
		    		  query.append("and street like '%"+ street + "%'");
		    	  }
		    	  if ( district != null && district != "") {
		    		  query.append("and district like '%"+ district + "%'");
		    	  }
		    	  if ( ward != null && ward != "") {
		    		  query.append("and ward like '%"+ ward + "%'");
		    	  }
		    	  if ( floorArea != null ) {
		    		  query.append("and floorArea like "+ floorArea + "");
		    	  }
		    	  if ( numberOfBasement != null ) {
		    		  query.append("and numberOfBasement like "+ numberOfBasement + "");
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
