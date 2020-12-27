package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.Liga;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Log_In extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FileInputStream liga;
				FileOutputStream liga2;
				ObjectInputStream ligaRead;
				ObjectOutputStream ligaWrite;
				try {
					liga = new FileInputStream ("Liga.dat");
					ligaRead = new ObjectInputStream(liga);
					Liga temp = (Liga)ligaRead.readObject();
					Liga.setControl(temp);
					liga.close();
					ligaRead.close();
				} catch (FileNotFoundException e) {
					try {
						liga2 = new  FileOutputStream("Liga.dat");
						ligaWrite = new ObjectOutputStream(liga2);
						ligaWrite.writeObject(Liga.getInstance());
						liga2.close();
						ligaWrite.close();
					} catch (FileNotFoundException e1) {
					} catch (IOException e1) {
						// TODO Auto-generated catch block
					}
				} catch (IOException e) {
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					Log_In frame = new Log_In();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	
	public Log_In() {
		setResizable(false);
		setTitle("Log-In");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Log_In.class.getResource("/Recursos/baloncesto.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 324);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
	
		
		JPanel panel = new JPanel();
		panel.setBounds(248, 11, 300, 263);
		panel.setBackground(new Color(153, 204, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIniciarSesin = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin.setBounds(93, 27, 120, 28);
		panel.add(lblIniciarSesin);
		lblIniciarSesin.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setBounds(121, 66, 65, 28);
		panel.add(lblUser);
		lblUser.setFont(new Font("Dubai Medium", Font.PLAIN, 16));
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(62, 105, 183, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(110, 136, 86, 28);
		panel.add(lblContrasea);
		lblContrasea.setFont(new Font("Dubai Medium", Font.PLAIN, 16));
		
		JButton btnLogin = new JButton("Log-in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(passwordField.getText().equalsIgnoreCase("Admin")&& txtUsuario.getText().equalsIgnoreCase("Admin")) {
					Principal principal = new Principal();
					principal.setVisible(true);
					principal.setLocationRelativeTo(null);
					dispose();	
				}else {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto/a", "Notificación", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(109, 206, 89, 23);
		panel.add(btnLogin);
		btnLogin.setBackground(SystemColor.controlHighlight);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(62, 175, 183, 20);
		panel.add(passwordField);
		
		JLabel lblAsociacinD = new JLabel("  Asociaci\u00F3n Dominicana");
		lblAsociacinD.setFont(new Font("Dubai Medium", Font.PLAIN, 22));
		lblAsociacinD.setBounds(0, 40, 239, 38);
		contentPane.add(lblAsociacinD);
		
		JLabel lblGestinDeLa = new JLabel("Gesti\u00F3n De La Liga");
		lblGestinDeLa.setFont(new Font("Arial", Font.PLAIN, 16));
		lblGestinDeLa.setBounds(49, 167, 151, 38);
		contentPane.add(lblGestinDeLa);
		
		JLabel lblDe = new JLabel("De");
		lblDe.setFont(new Font("Dubai Medium", Font.PLAIN, 22));
		lblDe.setBounds(107, 73, 35, 38);
		contentPane.add(lblDe);
		
		JLabel lblBasketball = new JLabel("Baloncesto");
		lblBasketball.setFont(new Font("Dubai Medium", Font.PLAIN, 22));
		lblBasketball.setBounds(70, 105, 109, 38);
		contentPane.add(lblBasketball);
	}
}
