package bibliotecas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreverArquivo {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("novoArquivo.txt");
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("testando testando 123");
			bw.close();
			System.out.println("rolou");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
}
