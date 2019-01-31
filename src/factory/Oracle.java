package factory;

import java.sql.Connection;
import java.sql.DriverManager;

import lombok.Data;
@Data
public class Oracle implements Database{
	private Connection conn;
	private String driver,url,user,password;
	@Override
	public Connection getConnect() {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
