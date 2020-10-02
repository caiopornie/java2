package bibliotecas;

public class TesteInToString {
	public static void main(String[] args) {
		int i = 1;
		
		String s1 = " "+1;
		
		System.out.println(i);
		System.out.println(s1);
		
		// criando um wrapper
		
		String s2 = "11";
		int k = Integer.parseInt(s2);
		int j = k + i;
		System.out.println(j);
		
	}

}
