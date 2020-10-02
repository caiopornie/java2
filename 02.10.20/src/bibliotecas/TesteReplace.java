package bibliotecas;

public class TesteReplace {

	//public String replace(char oldChar,char newChar)
	//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	
	//String	replace(char oldChar, char newChar)
	//Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
	
	//String	replace(CharSequence target, CharSequence replacement)
	//Replaces each substring of this string that matches the literal target sequence with the specified literal replacement sequence.
	
	public static void main(String[] args) {
		
		String a = "abacate";
		
		System.out.println(a.replace("a", "o"));
		
		System.out.println(a.replace("aba","ali"));
	}
}
