package jThread;

public class TestaThread {
	
	public static void main(String[] args) {
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread(dMapa);
		tMapa.start(); //inicia a thread na JVM
		
		BarraDeProgresso bProg = new BarraDeProgresso();
		Thread tBProg = new Thread(bProg);
		tBProg.start();
	}

}
