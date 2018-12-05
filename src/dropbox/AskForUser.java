package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AskForUser {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void CreateUser() {
	 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForUser window = new AskForUser();
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
	public AskForUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCreateUser = new JLabel("Create User");
		lblCreateUser.setBounds(131, 11, 91, 14);
		frame.getContentPane().add(lblCreateUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(31, 50, 74, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(31, 82, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(31, 107, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblRetypePassword = new JLabel("Retype password");
		lblRetypePassword.setBounds(31, 132, 98, 14);
		frame.getContentPane().add(lblRetypePassword);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100, 45, 156, 22);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(87, 77, 169, 22);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(87, 102, 169, 22);
		frame.getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(131, 132, 125, 22);
		frame.getContentPane().add(textArea_3);
		
		JButton btnCreateUser = new JButton("Create User");
		btnCreateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CreateUser.User();
				System.out.println("User created");
			}
		});
		btnCreateUser.setBounds(16, 227, 145, 23);
		frame.getContentPane().add(btnCreateUser);
	}
}
