package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import model.ClienteM;

public class ClienteV {
	
	private JFrame frame;
	private JButton btnConectar;
	private JLabel lblCliente;
	
	public void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteV window = new ClienteV();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ClienteV() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Handler handler = new Handler();
		
		btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(handler);
		btnConectar.setBounds(176, 62, 89, 23);
		frame.getContentPane().add(btnConectar);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(189, 28, 46, 14);
		frame.getContentPane().add(lblCliente);
	}
	
	public class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnConectar) {
				ClienteM.run();
			}
		}
		
	}

}
