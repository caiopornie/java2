package javachat;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente3 extends JFrame implements ActionListener{

	private JPanel contentPane;
	JTextArea textArea;
	JButton btnEnviar;
	
	static Socket client;
	static PrintStream out;
	
	static Cliente3 frame; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
				/*******************************
				 * Inicia Socket
				 *******************************/
		
				client = new Socket("127.0.0.1", 10000);
				
				System.out.println("Cliente conectado ao servidor!");
				
		//		out = new PrintStream(client.getOutputStream());
				
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							
							/*******************************
							 * Inicia frame 
							 *******************************/
							
							frame = new Cliente3();
							frame.setVisible(true);
							//frame.textArea.addKeyListener(frame);
							frame.btnEnviar.addActionListener(frame);
							
							
					
						}
						  catch (Exception e) {
							e.printStackTrace();
						}
					}
						
				});				
				
				
				
				
				
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	/**
	 * Create the frame.
	 * @return 
	 */
	public Cliente3() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		btnEnviar = new JButton("Enviar");
		contentPane.add(btnEnviar, BorderLayout.SOUTH);
	}

	/*
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		try {			
			
			out = new PrintStream(client.getOutputStream());
			 
			out.println(this.textArea.getText());
			
			out.close();
			
			
			client.close();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
		
		
		
	

}
