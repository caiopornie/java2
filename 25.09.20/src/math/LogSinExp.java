package math;

public class LogSinExp {

	public static void main(String[] args) {
		double x = 10;
		double radiano = 3.14;

		/*
		 * e, Neper, ou constante de euler é uma constante matematica
		 * normalmente utilizada para tratar de crecimento exponencial
		 * */
		
		
		/**/
		//log retorna o valor natural (usando a constante de euler) do valor passado
		System.out.println(Math.log(x));
		
		//log10 retorna o valor logaritimico na base 10 do valor passado
		System.out.println(Math.log10(x));
		
		/**/
		//retorna o seno de um valor dado em radianos
		System.out.println(Math.sin(radiano));
		
		//retorna o coseno de um valor dado em radianos
		System.out.println(Math.cos(radiano));
		
		/**/
		//exp retorna a constante de euler elevada ao parametro passado
		//Elevando a contante por 1 podemos averiguar o valor da constante 
		System.out.println("Constante de Euler: "+Math.exp(1));		
		System.out.println("Constante de Euler elevado ao quadrado: "+Math.exp(2));		
	}
}
