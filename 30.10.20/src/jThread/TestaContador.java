package jThread;

public class TestaContador {
	public static void main(String[] args) {
		Contador cont1 = new Contador();
		cont1.setCont(1);
		Thread t1 = new Thread(cont1);
		t1.start();
		
		Contador cont2 = new Contador();
		cont2.setCont(2);
		Thread t2 = new Thread(cont2);
		t2.start();
		
		Contador cont3 = new Contador();
		cont3.setCont(3);
		Thread t3 = new Thread(cont3);
		t3.start();
	
	}
}
