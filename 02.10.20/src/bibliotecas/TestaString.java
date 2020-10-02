package bibliotecas;

public class TestaString {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;

		String a = "Senac 123";
		String b = "Senac 123";
		
		String c = new String("Senac 456");
		String d = new String("Senac 456");
		
		String e = c;
				
		if (x == y) {
			System.out.println("x e y sao iguais");
		}else {
			System.out.println("x e y s�o diferentes");
		}
		
		if (a == b) {
			System.out.println("a e b sao iguais");
		}else {
			System.out.println("a e b s�o diferentes");
		}
		
		
		//nesse caso o que � comparado s�o os endere�os de memoria (OID's)
		//e n�o os valores
		if (c == d) {
			System.out.println("c e d sao iguais");
		}else {
			System.out.println("c e d s�o diferentes");
		}
		
		if (c.equals(d)) {
			System.out.println("c e d, usando equals() sao iguais");
		}else {
			System.out.println("c e d, usando equals() sao diferentes");
		}
		
		
		//e foi criado a partir de c logo est�o na mesma area de memoria
		if (c == e) {
			System.out.println("c � igual a e");
		}else {
			System.out.println("c � diferente de e");
		}
		
		e = "senac321";
		//depois da mudan�a e � mandado para outra area da memoria
		if (c == e) {
			System.out.println("c � igual a e");
		}else {
			System.out.println("c � diferente de e");
		}
		
		
		String f = new String("senac321");
		//OID's diferentes 
		if (f == e) {
			System.out.println("f � igual a e");
		}else {
			System.out.println("f � diferente de e");
		}
		
		if (f.equals(e)) {
			System.out.println("f, usando equals() � igual a e");
		}else {
			System.out.println("f, usando equals() � diferente de e");
		}
		
	}

}
