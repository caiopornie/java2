package bibliotecas;

public class TesteSubstring {
	
//public String substring(int beginIndex,int endIndex)
//Returns a string that is a substring of this string. 
//The substring begins at the specified beginIndex and extends to the character at 
//index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
	
	public static void main(String[] args) {
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String p1 = a.substring(0, 13);
		String p2 = a.substring(13,26);
		
		System.out.println("p1:"+p1);
		System.out.println("p2:"+p2);
		
	}

}
