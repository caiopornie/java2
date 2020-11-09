package model;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteM {
	
	public static void run(){
		try {
			
			Socket cliente = new Socket("127.0.0.1", 10000);
			System.out.println("Cliente conectado ao servidor");
			
			/*
			Scanner leitor = new Scanner(System.in);
			PrintStream out = new PrintStream(cliente.getOutputStream());
			
			while(leitor.hasNextLine()) {
				out.println(leitor.nextLine());
			}
			
			out.close();
			leitor.close();
			 */
			cliente.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
