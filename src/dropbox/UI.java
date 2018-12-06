package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.google.api.client.http.javanet.NetHttpTransport;

import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.awt.event.ActionEvent;

public class UI {

	protected static final NetHttpTransport HTTP_TRANSPORT = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("Only use this program when you accept the EULA " + "You can click the EULA button to see the EULA");
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
		lblGoogleDriveUploader.setBounds(137, 11, 162, 14);
		frame.getContentPane().add(lblGoogleDriveUploader);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(69, 36, 289, 150);
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
		btnPingTester.setBounds(57, 227, 110, 23);
		frame.getContentPane().add(btnPingTester);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//runs methods to upload
				try {
					GoogleDrive.getCredentials(HTTP_TRANSPORT);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				try {
					GoogleDrive.LIST();
				} catch (IOException | GeneralSecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//GoogleDrive.UPLOAD();
				
				
				
			}
		});
		btnUpload.setBounds(177, 227, 89, 23);
		frame.getContentPane().add(btnUpload);
		
		JButton btnCreateNewUser = new JButton("Create New User");
		btnCreateNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AskForUser.CreateUser();
				
				
				
				
			}
		});
		btnCreateNewUser.setBounds(276, 227, 148, 23);
		frame.getContentPane().add(btnCreateNewUser);
		
		JButton btnReadPastebin = new JButton("Read PasteBin");
		btnReadPastebin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				PasteBinTrending.Master();
				System.out.println("");
				
			}
		});
		btnReadPastebin.setBounds(206, 198, 192, 23);
		frame.getContentPane().add(btnReadPastebin);
		
		JButton btnSeeTrendingPastes = new JButton("See Trending Pastes");
		btnSeeTrendingPastes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Getting trending paste from pastebin.com");
				System.out.println("This will show titles of the trending pastes");
				System.out.println("");
				System.out.println("");
				PasteBinTrending.Trending();
				System.out.println("");
				System.out.println("You cannot chose which one to view due to how the api is built");
			}
		});
		btnSeeTrendingPastes.setBounds(10, 198, 186, 23);
		frame.getContentPane().add(btnSeeTrendingPastes);
	}
}
