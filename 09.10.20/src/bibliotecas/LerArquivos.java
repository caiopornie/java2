package bibliotecas;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LerArquivos {
	public static void main(String[] args) {
		try {			
			InputStream is = new FileInputStream("teste.txt");
			InputStreamReader isr = new InputStreamReader(is);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(isr);
			String s; 
			s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
			
		}catch (IOException e){
			System.out.println("deuruim");
			e.printStackTrace();
		}
	
	}
}
