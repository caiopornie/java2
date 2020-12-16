package javachat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;



import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor2  extends JFrame{
	
	private JPanel contentPane;
	JTextArea textArea;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testeframe frame = new testeframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(10000);
			System.out.println("Porta 10000 aberta, aguardando conexão do cliente.");
			
			Socket client = server.accept();
			
			System.out.println("Conexão do cliente "+client.getInetAddress().getHostAddress());
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Servidor2 frame = new Servidor2();
						frame.setVisible(true);
						
						
						Scanner s = new Scanner(client.getInputStream());
						
						while(s.hasNextLine()) {
							//System.out.println(s.nextLine());
							frame.textArea.append(s.nextLine());
						}
						
						s.close();
						
						client.close();
						server.close();
					
					
						}
						  catch (Exception e) {
							e.printStackTrace();
						}
						
					}
					
	
				});
			
				
		}catch (IOException e) {			
			e.printStackTrace();
		}
			
	}
	/**
	 * Create the frame.
	 * @return 
	 */
	public Servidor2() {
		setTitle("Servidor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}


}
