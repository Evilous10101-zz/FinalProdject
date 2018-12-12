package dropbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Order {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void CreateOrder() {
	 {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order window = new Order();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	 }
	}

	/**
	 * Create the application.
	 */
	public Order() {
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
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(28, 32, 377, 151);
		frame.getContentPane().add(editorPane);
		
		JLabel lblPutOrderOr = new JLabel("Put order or any data in the editor");
		lblPutOrderOr.setBounds(28, 7, 377, 14);
		frame.getContentPane().add(lblPutOrderOr);
		
		JButton btnSaveTheOrder = new JButton("Save the Order");
		btnSaveTheOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Runs method to save data, makes it sleep before doing so.
				System.out.println("Data is being gathered please wait a two seconds for processing");
				System.out.println("");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				GatherData.Data();
				
			}
		});
		btnSaveTheOrder.setBounds(28, 197, 377, 23);
		frame.getContentPane().add(btnSaveTheOrder);
	}
}
