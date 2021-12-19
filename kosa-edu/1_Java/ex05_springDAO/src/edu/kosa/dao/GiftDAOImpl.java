package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GiftDAOImpl extends GiftDAO {

	@Override
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
			//	드라이버:@IP:portNumber:SID
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"hr", 
				"hr");
		
		return conn;
	}
	
	/*
	 * 1. 드라이버 로드
	 * 2. connect & open
	 * 3. 사용(DML)
	 * 4. 닫기(close)
	 */

}
