package javadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcInsere {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionFactory.getConnection();
			String sql = "INSERT INTO contatos (nome, email, endereco) VALUES (? , ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "Caio");
			stmt.setString(2, "Caio@caio.caio");
			stmt.setString(3, "Rua Caio, numero Caio");
			stmt.execute();
			stmt.close();
			System.out.println("gravado com sucesso");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
