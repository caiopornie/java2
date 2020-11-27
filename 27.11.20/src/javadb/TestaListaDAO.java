package javadb;

import java.sql.SQLException;
import java.util.List;

public class TestaListaDAO {

	public static void main(String[] args) {
		try {
			ContatoDAO cdao;
			cdao = new ContatoDAO();
			List<Contato> contatos = cdao.getLista();
			
			for (Contato contato : contatos) {
				System.out.println("nome :"+contato.getNome());
				System.out.println("email :"+contato.getEmail());
				System.out.println("endereço :"+contato.getEndereco());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
