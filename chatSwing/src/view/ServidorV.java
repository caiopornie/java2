package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.ClienteM;
import model.ServidorM;

import javax.swing.JButton;

public class ServidorV {

	private JFrame frame;
	private JLabel lblServidor;
	private JButton btnConectarServ;
	private JButton btnConectarUs;

	public void setVisible(boolean b) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServidorV window = new ServidorV();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ServidorV() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Handler handler = new Handler();
		
		lblServidor = new JLabel("Servidor");
		lblServidor.setBounds(176, 40, 73, 14);
		frame.getContentPane().add(lblServidor);
		
		btnConectarServ = new JButton("Conectar Servidor");
		btnConectarServ.addActionListener(handler);
		btnConectarServ.setBounds(126, 80, 158, 23);
		frame.getContentPane().add(btnConectarServ);
		
		btnConectarUs = new JButton("Conectar Usuario");
		btnConectarUs.addActionListener(handler);
		btnConectarUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConectarUs.setBounds(126, 128, 158, 23);
		frame.getContentPane().add(btnConectarUs);
	}
	
	public class Handler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnConectarServ){
				ServidorM.run();
			}
			if (e.getSource() == btnConectarUs) {
				ClienteM.run();
			}
		}
		
	}

}
