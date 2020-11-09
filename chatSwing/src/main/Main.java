package main;

import model.ClienteM;
import model.ServidorM;
import view.ClienteV;
import view.ServidorV;

public class Main {
	
	public static void main(String[] args) {
		/*
		ServidorM.run();
		ClienteM.run();
		*/
		
		ServidorV servV = new ServidorV();
		ClienteV cliV = new ClienteV();
		servV.setVisible(true);
		//cliV.setVisible(true);
		
	}

}
