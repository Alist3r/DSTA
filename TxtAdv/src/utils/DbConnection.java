package utils;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DbConnection {
	
	private String URLConnessione = "jdbc:mysql://localhost:3306/txtadv";
	private String nomeDriver = "com.mysql.jdbc.Driver";
	private String username = "root";
	private String password = "";
	private Connection connessione = null;
	
	public DbConnection() {
		try {
			Class.forName(nomeDriver).newInstance();
			this.connessione = (Connection) DriverManager.getConnection(URLConnessione, username, password);		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}				
	}
	
	public Connection getConnessione() {
		return this.connessione;
	}
	
	
}
