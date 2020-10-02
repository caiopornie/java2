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
			System.out.println("x e y são diferentes");
		}
		
		if (a == b) {
			System.out.println("a e b sao iguais");
		}else {
			System.out.println("a e b são diferentes");
		}
		
		
		//nesse caso o que é comparado são os endereços de memoria (OID's)
		//e não os valores
		if (c == d) {
			System.out.println("c e d sao iguais");
		}else {
			System.out.println("c e d são diferentes");
		}
		
		if (c.equals(d)) {
			System.out.println("c e d, usando equals() sao iguais");
		}else {
			System.out.println("c e d, usando equals() sao diferentes");
		}
		
		
		//e foi criado a partir de c logo estão na mesma area de memoria
		if (c == e) {
			System.out.println("c é igual a e");
		}else {
			System.out.println("c é diferente de e");
		}
		
		e = "senac321";
		//depois da mudança e é mandado para outra area da memoria
		if (c == e) {
			System.out.println("c é igual a e");
		}else {
			System.out.println("c é diferente de e");
		}
		
		
		String f = new String("senac321");
		//OID's diferentes 
		if (f == e) {
			System.out.println("f é igual a e");
		}else {
			System.out.println("f é diferente de e");
		}
		
		if (f.equals(e)) {
			System.out.println("f, usando equals() é igual a e");
		}else {
			System.out.println("f, usando equals() é diferente de e");
		}
		
	}

}
