package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import enums.Props;

public class ConnTest2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(Props.ORA_DRIVER.getValue());
			conn = DriverManager.getConnection(
					Props.DB_URL.getValue(),
					Props.DB_USER.getValue(),
					Props.DB_PASS.getValue());
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT COUNT(*) AS COUNT FROM EMPLOYEES");
			String count = "";
			while(rs.next()) {
				count = rs.getString("COUNT");
			}
			System.out.println("회원의 수: "+count);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}