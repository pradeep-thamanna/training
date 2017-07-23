package com.db.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBSelect 
{
	public static void main(String args[])
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			//Mysql is running in localhost on port 3306
			//Database filemanager has been created
			//Credentials to connect to DB: user=appuser, password = appuser
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filemanager", "appuser", "appuser");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from folder_info");
			while (rs.next())
			{
				System.out.println(rs.getInt("ID"));
			}
			con.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
