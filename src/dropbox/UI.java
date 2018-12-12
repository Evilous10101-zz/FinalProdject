package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;



import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class UI {

	
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
		
		JLabel lblGoogleDriveUploader = new JLabel("Utility tool By Michael Lannon\r\n");
		lblGoogleDriveUploader.setBounds(108, 11, 278, 14);
		frame.getContentPane().add(lblGoogleDriveUploader);
		
		JButton btnEula = new JButton("EULA");
		btnEula.setForeground(Color.RED);
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
		btnEula.setBounds(335, 7, 89, 23);
		frame.getContentPane().add(btnEula);
		
		JButton btnPingTester = new JButton("Ping tester");
		btnPingTester.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PingTest.Test();
				
				
			}
		});
		btnPingTester.setBounds(10, 227, 110, 23);
		frame.getContentPane().add(btnPingTester);
		
		JButton btnUpload = new JButton("Shut down\r\n");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Shuts down program 
			System.out.println("Program will shut down");
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				System.exit(0);
				
				
			}
		});
		btnUpload.setBounds(137, 227, 129, 23);
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
				PasteBinTrending.Trending();
				System.out.println("");
				System.out.println("You cannot chose which one to view due to how the api is built");
			}
		});
		btnSeeTrendingPastes.setBounds(10, 198, 186, 23);
		frame.getContentPane().add(btnSeeTrendingPastes);
		
		JButton btnZipFiles = new JButton("Zip Files");
		btnZipFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Zip.Create();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnZipFiles.setBounds(223, 164, 117, 23);
		frame.getContentPane().add(btnZipFiles);
		
		JButton btnDownloadGit = new JButton("Download Git");
		btnDownloadGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Downloader.Test();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnDownloadGit.setBounds(10, 164, 175, 23);
		frame.getContentPane().add(btnDownloadGit);
		
		JButton btnViewGithubSource = new JButton("View Source Code");
		btnViewGithubSource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				DownloadingWebpageForBasicViewing.Downloading();
				
				
			}
		});
		btnViewGithubSource.setBounds(10, 130, 161, 23);
		frame.getContentPane().add(btnViewGithubSource);
	}
}
