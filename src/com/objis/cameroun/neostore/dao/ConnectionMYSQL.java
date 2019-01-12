package com.objis.cameroun.neostore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author "Magali TIKI"
 *
 */
public class ConnectionMYSQL {
	
	// Information d'accès à la base de données
	public static String url = "jdbc:mysql://localhost/neostore";
	public static String login = "root";//nom d'utilisateur de la base des données
	public static String passwd = "";//mot de passe
	public static Connection connection;
	
	/**
	 * Methode de connection
	 * Elle ne prend rien en paramêtre
	 * @return Connection
	 */
	public static Connection getInstance() {
		
		if (connection==null) {
			
			try {
				
				connection = DriverManager.getConnection(url,login,passwd);
				
			} catch (SQLException e) {
				
				System.out.println("Problême de connection");
				
			}
			
		}
		return connection;
		
	}

}
