package usuario;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	
	private int port;
	private Socket cliente;
	private PrintStream out;

	public void setPort(int port) {
		this.port = port;
	}
	
	public int getPort() {
		return this.port;
	}
	
	public void conectar(int port) {
		try {
			
			cliente = new Socket("127.0.0.1", port);
			System.out.println("Cliente conectado ao servidor");
			out = new PrintStream(cliente.getOutputStream());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void enviar(String texto) {
			//Scanner leitor = new Scanner(System.in);

			
			//while(texto.hasNextLine()) {
				out.println(texto);
			//}
		
			
	}
	public void encerrar() {
		try{
			out.close();
			cliente.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
