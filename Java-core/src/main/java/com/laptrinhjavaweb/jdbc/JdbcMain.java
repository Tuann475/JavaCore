package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
	   static final String DB_URL = "jdbc:mysql://localhost:3306/javacore";
	   static final String USER = "root";
	   static final String PASS = "123321";
	   

	   public static void main(String[] args) {
/*		   try {
			   Integer value1 = 0/10;
			   System.out.println(value1);
			   Class.forName("com.mysql.jdbc.Driver");
			   Integer value2 = 10/0;
			   System.out.println(value2);
			   System.out.println("anh yêu em");
		   }catch(ClassNotFoundException e) {
			   System.out.print("thiếu file JAR driver rồi anh gì ơi");
		   
	       }catch(Exception e) {
	    	   System.out.print("lỗi ngoại lệ rồi");
	       }	*/	   
		   
		   //beginer
		   Connection conn = null;
		   Statement stmt = null;
		   ResultSet rs = null;
		      try {
		    	  String query = "SELECT * FROM buildings";
		    	  Class.forName("com.mysql.jdbc.Driver");
		    	  conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      stmt = conn.createStatement();
			      rs = stmt.executeQuery(query);		      
		 	         while(rs.next()){
		 	            //Display values
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
