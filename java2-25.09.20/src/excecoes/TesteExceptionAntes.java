package excecoes;

public class TesteExceptionAntes {

	public static void main(String[] args) {
		System.out.println("Início do método main()");
		metodo1();
		System.out.println("Fim do método main()");
	}
	
	public static void metodo1() {
		System.out.println("Início do metodo1()");
		metodo2();
		System.out.println("Fim do metodo1()");
	}
	
	public static void metodo2() {
		System.out.println("Início do metodo2()");
		
		int array[];
		array = new int[10];
		
		for(int i=0; i<20; i++) {
				array[i] = i;
				System.out.println(i);
		}
		
		System.out.println("Fim do metodo2()");
	}
}
