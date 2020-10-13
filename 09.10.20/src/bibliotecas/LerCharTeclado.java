package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerCharTeclado {

	public static void main(String[] args) {
		
		System.out.println("Digite uma tecla: ");
		
		InputStream is = System.in; 
			//InputStream captura um byte
			//recebendo a entrada padrao do sistema
			
		InputStreamReader isr = new InputStreamReader(is);
		char c = 0;
		try {
			c = (char)isr.read();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Voce digitou a tecla: "+c);
	}
	
}
