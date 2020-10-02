package bibliotecas;

public class testeContains {
	//public boolean contains(CharSequence s)
	//Returns true if and only if this string contains the specified sequence of char values.

	public static void main(String[] args) {
		String a = "abacate";
		
		System.out.println("A palavra abacate tem a letra a? :");
		System.out.println(a.contains("a"));

		System.out.println("A palavra abacate tem a letra z? :");
		System.out.println(a.contains("z"));
	}
}
