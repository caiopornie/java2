package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

import usuario.Cliente;

import javax.swing.JButton;

public class Usuario{

	private JFrame frame;
	private JTextField textField;
	private JLabel lblConectar;
	private JCheckBox checkBoxConectar;
	private JLabel label;
	private JButton btnEnviar;
	private JTextField txtPort;


	public void setVisible(boolean b){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario window = new Usuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		public Usuario() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			Handler handler = new Handler();
			
			lblConectar = new JLabel("Conectar");
			lblConectar.setBounds(33, 37, 44, 23);
			frame.getContentPane().add(lblConectar);
			
			checkBoxConectar = new JCheckBox("");
			checkBoxConectar.addActionListener(handler);
			checkBoxConectar.setBounds(177, 37, 21, 23);
			frame.getContentPane().add(checkBoxConectar);
			
			label = new JLabel("...");
			label.setBounds(220, 36, 46, 14);
			frame.getContentPane().add(label);
			
			textField = new JTextField();
			textField.setBounds(33, 96, 379, 23);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			btnEnviar = new JButton("Enviar");
			btnEnviar.setBounds(177, 130, 89, 23);
			frame.getContentPane().add(btnEnviar);
			
			txtPort = new JTextField();
			txtPort.setText("Port");
			txtPort.setBounds(87, 38, 86, 20);
			frame.getContentPane().add(txtPort);
			txtPort.setColumns(10);
			
		}
	
	public class Handler implements ActionListener{
		Cliente cl = new Cliente();
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == checkBoxConectar) {
				String port =txtPort.getText();
				int Nport = Integer.parseInt(txtPort.getText());
				String texto = textField.getText();
				
				JOptionPane.showMessageDialog(null, "Você escolheu o port "+port);
				cl.conectar(Nport);
			}
			
		}
	
	}

}