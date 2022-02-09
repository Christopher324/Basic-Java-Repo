package com.hcl.JDBCjava8Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCjava8Assignment {

	public static void main(String[] args) {
		// Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " DOB INTEGER, " +
                   " salary INTEGER, " +
                   " age INTEGER, "; 
           
         stmt.executeUpdate(sql);
         System.out.println("Employee Management");   	  
      } catch (SQLException e) {
         e.printStackTrace();
         
         while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("First name");
				String lastName = rs.getString("Last name");
				String dob = rs.getString("DOB");
				String salary = rs.getString("Salary");
				String age = rs.getString("Age");
				System.out.println(id + "," + firstName + "," + lastName + "," + dob + "," + salary + "," + age);
			}

	}

}
