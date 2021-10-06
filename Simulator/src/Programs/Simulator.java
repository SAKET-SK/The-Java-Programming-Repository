package Programs;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Simulator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulator window = new Simulator();
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
	public Simulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1368,768);
		frame.setTitle("OS Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\Admin\\Pictures\\simulator.jpg"));
		lblNewLabel_1.setBounds(0,0,1368,768);
		
		
		frame.setContentPane(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\process.png"));
		btnNewButton.setBounds(251, 84, 219, 230);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				 MainWindow m=new MainWindow();
				 m.hello();
				 frame.dispose();
			}});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\Dining.png"));
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				 Dining1.main(null);
				 frame.dispose();
			}});
		btnNewButton_1.setBounds(778, 84, 220, 230);
		
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(778, 384, 230, 220);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\disk2.png"));
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				try {
					MainApp.main(null);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 frame.dispose();
			}});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(251, 384, 230, 220);
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Admin\\Pictures\\Page1.png"));
		btnNewButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				 GUI.main(null);
				 frame.dispose();
			}});
		frame.getContentPane().add(btnNewButton_3);
		
		
		
		
	}
}
 
