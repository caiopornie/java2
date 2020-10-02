package bibliotecas;

public class TesteIndexOf {

	//indexOf(int ch)
	//Returns the index within this string of the first occurrence of the specified character.
	
	//indexOf(int ch, int fromIndex)
	//Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
	
	//indexOf(String str)
	//Returns the index within this string of the first occurrence of the specified substring.
	
	//indexOf(String str, int fromIndex)
	//Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.
	
	public static void main(String[] args) {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZABC";
		
		int indexz = a.indexOf('Z');
		System.out.println(indexz);
		
		int indexbcd = a.indexOf("BCD");
		System.out.println(indexbcd);
		
		int indexabc2 = a.indexOf("ABC", 1);
		System.out.println(indexabc2);
		
	}

}
