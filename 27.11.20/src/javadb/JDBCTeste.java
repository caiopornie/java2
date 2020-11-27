package javadb;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTeste{
	public static void main(String[] args) {
		try {
			DriverManager.getConnection("jdbc:mysql://localhost/test","root","root");
			System.out.println("Conectado ao banco de dados MySql Local");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
