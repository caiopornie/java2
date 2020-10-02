package bibliotecas;

public class TesteString2 {

	public static void main(String[] args) {
		String a = "Aprendendo java";
		String b[] = a.split(" ");
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		String c = "aprendendo java";
		int i = a.compareTo(a);
		System.out.println(i);
		
		int j = a.compareTo(c);
		System.out.println(j);
		
		//compareToIgnoreCase() ignorar se a letra é minuscula ou maiuscula
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
	
		String d = a.toLowerCase();
		String e = a.toUpperCase();
		System.out.println(a);
		System.out.println(d);
		System.out.println(e);
		//com a variavel "a" e o auxilio de outras variaveis
		//crie exemplos para demonstrar a funcionalidade dos seguintes metodos:
		//replace()
		
		
		
		
		
	
	}
}
