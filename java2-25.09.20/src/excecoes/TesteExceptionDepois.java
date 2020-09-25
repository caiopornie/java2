package excecoes;

public class TesteExceptionDepois {

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
		
		try {
			for(int i=0; i<20; i++) {
				array[i] = i;
				System.out.println(i);
			}			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Houve um erro: " + e);
		}
		
		System.out.println("Fim do metodo2()");
	}

}
