import java.util.HashSet;
import java.util.Set;

public class TestSet {
	
	public static void main(String[] args) {
		Set objetos = new HashSet();
		objetos.add("objeto1");
		objetos.add("objeto2");
		objetos.add("objeto3");
		objetos.add("objeto2");
		objetos.add("objeto1");
		System.out.println(objetos+"\n");
		System.out.println(objetos.size());
		
		for (Object object : objetos) {
			System.out.println(object);
		}
	}
}
