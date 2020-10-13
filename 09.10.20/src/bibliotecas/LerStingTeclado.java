package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerStingTeclado {
	
	public static void main(String[] args) {
		System.out.println("Digita uma palavra (+ de 1 letra)");
	
		InputStream is = System.in;
		
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(isr);
		//BufferReader recebe varios char
		//e os armazena num buffer, transformando-os em uma string
		
		String s = null;
		try {
		s = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Voce digitou: "+s);
	}
}
