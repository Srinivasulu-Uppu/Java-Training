package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionTest2 {

	public static void main(String[] args) {
		System.out.println("Main start");
		Connection connection = null;
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb","root","root");
				System.out.println("Connection succesfful");
 				String sql = "insert into customer_details(name,address) values(?,?)";
 					
 				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				
				Scanner scanner = new Scanner(System.in);
				for (int i=0 ; i < 3 ; i++) {
					System.out.println("Enter the name:");
					String name=scanner.next();
					System.out.println("Enter address:");
					String address=scanner.next();
					
					preparedStatement.setString(1,name);
					preparedStatement.setString(2,address);
					
//					preparedStatement.setString("Srini", "Hyderabad");
//					preparedStatement.setString("Srini Uppu", "Hyderabad");
					int rowCount = preparedStatement.executeUpdate();
					if(rowCount > 0) {
						System.out.println("Record insterted successfully");
					}
					else {
						System.out.println("No rows insterted");
					}
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found!!");
		}
		
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main end");

	}

}


