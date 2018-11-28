package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

import com.dropbox.core.DbxException;

public class UI {

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
		btnTestToSee.setBounds(10, 227, 234, 23);
		frame.getContentPane().add(btnTestToSee);
		
		JButton btnUploadNewFile = new JButton("Upload File");
		btnUploadNewFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GatherData.Data();
				
				System.out.println("Uploading the file is bugged for now");
				try {
					Upload.upload();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DbxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUploadNewFile.setBounds(254, 227, 139, 23);
		frame.getContentPane().add(btnUploadNewFile);
		
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
	}
}
