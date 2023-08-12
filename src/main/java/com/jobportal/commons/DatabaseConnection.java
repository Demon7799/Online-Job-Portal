package com.jobportal.commons;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection
{
	
	private static Connection connectionObj;
	
	public static Connection getConnection()
	{
		try
		{
			if(connectionObj == null)
			{
				Class.forName("org.postgresql.Driver");
				connectionObj = DriverManager.getConnection("jdbc:postgresql://localhost:5432/onlinejobportal","postgres","abhi");
				
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return connectionObj;
	}
}
