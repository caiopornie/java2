package math;

public class FloorCeilRound {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		
		int j = Math.abs(i);
		System.out.println(j);
		
		double x = .5;
		
		System.out.println(Math.floor(x));
		System.out.println(Math.ceil(x));
		//ceil (arredonda para cima) e floor (arredonda para baixo) retornam double
		
		System.out.println(Math.round(x));
		//round arredonda de acordo com o numero passado e retorna int
	
	}
}
