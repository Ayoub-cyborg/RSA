package com.ayoub.rsa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class App {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 224, 208));
		frame.getContentPane().setForeground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 785, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrEnterYourMessage = new JTextArea();
		txtrEnterYourMessage.setBackground(new Color(0, 191, 255));
		txtrEnterYourMessage.setText("Enter your message here: ");
		txtrEnterYourMessage.setBounds(10, 11, 457, 101);
		frame.getContentPane().add(txtrEnterYourMessage);
		
		JButton Encryption = new JButton("Encryption");
		Encryption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Encryption.setBackground(new Color(220, 220, 220));
		Encryption.setForeground(new Color(0, 0, 0));
		Encryption.setBounds(538, 121, 181, 60);
		frame.getContentPane().add(Encryption);
		
		JButton Decryption = new JButton("Decryption");
		Decryption.setForeground(new Color(0, 0, 0));
		Decryption.setBackground(new Color(220, 220, 220));
		Decryption.setBounds(538, 203, 181, 60);
		frame.getContentPane().add(Decryption);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(0, 191, 255));
		textArea.setBounds(10, 123, 457, 203);
		frame.getContentPane().add(textArea);
	}
}
