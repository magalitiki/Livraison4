package com.objis.cameroun.neostore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author "Magali TIKI"
 *
 */
public class ConnectionMYSQL {
	
	// Information d'acc�s � la base de donn�es
	public static String url = "jdbc:mysql://localhost/neostore";
	public static String login = "root";//nom d'utilisateur de la base des donn�es
	public static String passwd = "";//mot de passe
	public static Connection connection;
	
	/**
	 * Methode de connection
	 * Elle ne prend rien en param�tre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			} catch (SQLException e) {
				
				System.out.println("Probl�me de connection");
				
			}
			
		}
		return connection;
		
	}

}
