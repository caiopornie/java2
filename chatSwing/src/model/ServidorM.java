package model;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorM {
	public static Boolean run(){
		try {
			ServerSocket server = new ServerSocket(10000);
			//System.out.println("Porta 10.000 aberta");
		
			Socket cliente = server.accept();
			System.out.println("Conex�o do cliente "+cliente.getInetAddress().getHostAddress());
			
			/*
			Scanner leitor = new Scanner(cliente.getInputStream());
			while (leitor.hasNextLine()) {
				System.out.println(leitor.nextLine());
			}
			*/
			
			//leitor.close();
			cliente.close();
			server.close();
			
			return true;
			
		}catch (IOException e){
			e.printStackTrace();
			
			return false;
		}
	}
}
