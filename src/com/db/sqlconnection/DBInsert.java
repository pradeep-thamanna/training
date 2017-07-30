package com.db.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInsert 
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

				String sql = "INSERT INTO filemanager.folder_info (ID,NAME,ABSOLUTE_PATH) " +
		                   "VALUES (3, '1-2-2037', 'C:\\\\Users\\\\Pradeep\\\\Pictures\\\\1-2-2037')";
				stmt.executeUpdate(sql);
				
			} 
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
