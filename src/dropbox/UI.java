package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class UI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
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
	public UI() {
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
		
		JLabel lblGoogleDriveUploader = new JLabel("Google Drive Uploader");
		lblGoogleDriveUploader.setBounds(94, 11, 205, 14);
		frame.getContentPane().add(lblGoogleDriveUploader);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(69, 36, 289, 162);
		frame.getContentPane().add(editorPane);
		
		JButton btnEula = new JButton("EULA");
		btnEula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Userforapplication.EULA();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnEula.setBounds(309, 7, 89, 23);
		frame.getContentPane().add(btnEula);
		
		JButton btnPingTester = new JButton("Ping tester");
		btnPingTester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PingTest.Test();
				
				
			}
		});
		btnPingTester.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnPingTester);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//runs methods to upload
				
				
				
				
			}
		});
		btnUpload.setBounds(109, 227, 89, 23);
		frame.getContentPane().add(btnUpload);
		
		JButton btnCreateNewUser = new JButton("Create New User");
		btnCreateNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AskForUser.CreateUser();
				
				
				
				
			}
		});
		btnCreateNewUser.setBounds(210, 227, 148, 23);
		frame.getContentPane().add(btnCreateNewUser);
	}
}
