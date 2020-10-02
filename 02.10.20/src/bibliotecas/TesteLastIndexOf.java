package bibliotecas;

public class TesteLastIndexOf {
	
//lastIndexOf(int ch)
//Returns the index within this string of the last occurrence of the specified character.

//lastIndexOf(int ch, int fromIndex)
//Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.

//lastIndexOf(String str)
//Returns the index within this string of the last occurrence of the specified substring.

//lastIndexOf(String str, int fromIndex)
//Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.

	public static void main(String[] args) {
		String a = "abacate";
		
		int x = a.lastIndexOf("a");
		
		System.out.println(x);
		
	}

}
