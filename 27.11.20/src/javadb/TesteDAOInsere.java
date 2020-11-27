package javadb;

import java.sql.SQLException;

public class TesteDAOInsere {

	public static void main(String[] args) {
		try {
			Contato contato = new Contato();
			contato.setNome("AAA");
			contato.setEmail("aaaa.AA@aAaA.ªaA");
			contato.setEndereco("AV AAAAA, AP aaa");
		
			ContatoDAO dao;
			dao = new ContatoDAO();
			dao.adiciona(contato);
			System.out.println("feito");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
