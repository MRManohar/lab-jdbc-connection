package controller;

import java.sql.Connection;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws Exception {
		ConnectionManager cm = new ConnectionManager();
		Connection con = null;
		con = cm.getConnectionManager();
		try {
			if(con != null) {
				System.out.println("Connection Established.");
			}
		}
		catch(Exception e) {
			System.out.println("Check your Connection.");
		}
	}
}
