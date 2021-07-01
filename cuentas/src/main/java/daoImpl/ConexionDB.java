package daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
	
	public static ConexionDB instance;
	private Connection cn;
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "AV23CJ30";
	private String dbName = "db_banco";

	private ConexionDB() {
		// TODO Auto-generated constructor stub
		try {
			
			this.cn = DriverManager.getConnection(host+dbName,user,pass);
			this.cn.setAutoCommit(false);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static ConexionDB getConexion() {
		
		if(instance == null) instance = new ConexionDB();
		return instance;
	}
	
	public Connection getSqlConexion() {
		return this.cn;
	}
	
	public void cerrarConexion() {
		try {
			
			this.cn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		instance = null;
	}
}
