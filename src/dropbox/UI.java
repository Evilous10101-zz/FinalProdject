package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import com.google.api.client.http.javanet.NetHttpTransport;



public class UI {
	protected static final NetHttpTransport HTTP_TRANSPORT = null;
	
	public static  int x = 0;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Only use this program when you accept the EULA");
		System.out.println("You can click the EULA button to see the EULA");
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
		
		JLabel lblDropBoxUploader = new JLabel("Drop box Uploader");
		lblDropBoxUploader.setBounds(145, 11, 139, 14);
		frame.getContentPane().add(lblDropBoxUploader);
		
		JButton btnTestToSee = new JButton("Test to see if dropbox is online");
		btnTestToSee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PingTest.Test();
			}
		});
		btnTestToSee.setBounds(10, 216, 234, 34);
		frame.getContentPane().add(btnTestToSee);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(52, 54, 334, 133);
		frame.getContentPane().add(textPane);
		
		JButton btnEula = new JButton("EULA");
		btnEula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Userforapplication.EULA();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnEula.setBounds(294, 11, 89, 23);
		frame.getContentPane().add(btnEula);
		
		JButton btnUploadFile = new JButton("Upload File");
		btnUploadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Trying");
				try {
					GoogleDrive.getCredentials(HTTP_TRANSPORT);
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				System.out.println("Did first item");
				
				try {
					GoogleDrive.LIST();
				} catch (IOException | GeneralSecurityException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println("Did second Item");
			}
		});
		btnUploadFile.setBounds(254, 216, 139, 34);
		frame.getContentPane().add(btnUploadFile);
	}
}
