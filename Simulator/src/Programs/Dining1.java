package Programs;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.TimeUnit;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingWorker;
import java.awt.Color;

public class Dining1 {

	static JFrame frame;
	static JButton lblPhil = new JButton("");
	static JButton lblPhil_1 = new JButton("");
	static JButton lblPhil_2 = new JButton("");
	static JButton lblPhil_3 = new JButton("");
	static JButton lblPhil_4 = new JButton("");
	static MyButton btnStopSimulation = new MyButton("Home");
	static final JLabel lblNewLabel =new JLabel("");
	int j;
	static MyButton btnStartSimulation = new MyButton("Start Simulation");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dining1 window = new Dining1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnStartSimulation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				final SwingWorker myWorker= new SwingWorker<String, Void>() {
				    @Override
				    protected String doInBackground() throws Exception {
				int state[]=new int[5];
				int flag=0,val=0;
				int thinking,eating,hungry;
				
				thinking=0;
				eating=1;
				hungry=2;
				
				for(int x=1;x<90000;x++)
				{
					int max=4;
					int min=0;
					Random rand=new Random();
					int i=rand.nextInt((max - min) + 1) + min;
					if(state[i]==1)
					{
						if(state[i]==1)
						{
							state[i]=0;
							if(i==0)
							{	
								lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
							}
							else if(i==1)
							{	
								lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
							}
							else if(i==2)
							{	
								lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
							}
							else if(i==3)
							{	
								lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
							}
							else
							{	
								lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
							}
							int k=(i+1)%5;
							for(int j=1;j<=2;j++){
							if(state[k]==2 && state[(k+1)%5]!=1 && state[(k+4)%5]!=1)
							{
								state[k]=1;
								if(k==0)
								{	
									lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
								}
								else if(k==1)
								{	
									lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
								}
								else if(k==2)
								{	
									lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
								}
								else if(k==3)
								{	
									lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
								}
								else
								{	
									lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
								}
							}
							k=(i+4)%5;}
						}
					}
					else
					{
						
						state[i]=2;
						if(i==0)
						{	
							lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\hungry.png"));
						}
						else if(i==1)
						{	
							lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\hungry.png"));
						}
						else if(i==2)
						{	
							lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\hungry.png"));
						}
						else if(i==3)
						{	
							lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\hungry.png"));
						}
						else
						{	
							lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\hungry.png"));
						}
				    	  
					
					
					if(state[i]==2 && state[(i+1)%5]!=1 && state[(i+4)%5]!=1)
					{
						state[i]=1;
						
						if(i==0)
						{	
							lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
						}
						else if(i==1)
						{	
							lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
						}
						else if(i==2)
						{	
							lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
						}
						else if(i==3)
						{	
							lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
						}
						else
						{	
							lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\eating.png"));
						}
					}
					if(state[i]==2)
					{
						
						if(i==0)
						{	
							lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\waiting.jpg"));
						}
						else if(i==1)
						{	
							lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\waiting.jpg"));
						}
						else if(i==2)
						{	
							lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\waiting.jpg"));
						}
						else if(i==3)
						{	
							lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\waiting.jpg"));
						}
						else
						{	
							lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\waiting.jpg"));
						}
					}
					}
						
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return null;
				    }
				};
				myWorker.execute();
				
		}});
		btnStopSimulation.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Simulator.main(null);
				frame.dispose();
			}});
	}

	/**
	 * Create the application.
	 */
	public Dining1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private static void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setTitle("Dining Philosophers");
   	 	frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblPhil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblPhil.setBounds(646, 11, 200, 200);
		lblPhil.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
		frame.getContentPane().add(lblPhil);
		lblPhil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblPhil_1.setBounds(132, 211, 200, 200);
		lblPhil_1.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
		frame.getContentPane().add(lblPhil_1);
		lblPhil_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		lblPhil_2.setBounds(194, 519, 200, 200);
		lblPhil_2.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
		frame.getContentPane().add(lblPhil_2);
		lblPhil_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		lblPhil_3.setBounds(1092, 519, 200, 200);
		lblPhil_3.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
		frame.getContentPane().add(lblPhil_3);
		lblPhil_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		lblPhil_4.setBounds(1152, 211, 200, 200);
		lblPhil_4.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\thinking.jpg"));
		frame.getContentPane().add(lblPhil_4);
		

		btnStartSimulation.setBounds(10, 11, 158, 39);
		frame.getContentPane().add(btnStartSimulation);
		
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\workspace1\\Dining\\d.jpg"));
		lblNewLabel.setBounds(488, 218, 512, 512);
		
		frame.getContentPane().add(lblNewLabel);
		
		
		btnStopSimulation.setBounds(1216, 11, 136, 39);
		frame.getContentPane().add(btnStopSimulation);
	}
}
