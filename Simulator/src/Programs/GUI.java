package Programs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;

//import com.sun.prism.paint.Color;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unused")
public class GUI {

	private JFrame frame;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(109, 201, 247));
		frame.setTitle("Page Replacement");
		frame.setBounds(100, 100, 450, 320);
		frame.setSize(1368,768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPageReplacementAlgorithms = new JLabel("Page Replacement Algorithms");
		lblPageReplacementAlgorithms.setFont(new Font("Algerian", Font.BOLD, 36));
		lblPageReplacementAlgorithms.setForeground(new java.awt.Color(255,0,0));
		lblPageReplacementAlgorithms.setBounds(369, 11, 704, 68);
		frame.getContentPane().add(lblPageReplacementAlgorithms);
		
		final Algorithms P=new Algorithms();
		
		JButton btnGenerateInput = new JButton("Generate Input");
		btnGenerateInput.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGenerateInput.setForeground(new java.awt.Color(27,239,69));
		btnGenerateInput.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,158,0),3));
		btnGenerateInput.setBounds(379, 90, 147, 36);
		frame.getContentPane().add(btnGenerateInput);
		btnGenerateInput.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String textFieldValue = textField_4.getText();
				int n=Integer.parseInt(textFieldValue);
				String no=textField_5.getText();
				int qt=Integer.parseInt(no);
				String Ref=P.Input(n,qt);
				textField_6.setText(Ref);
				//int pno=Integer.parseInt(textField_4.getText());
				//int fno=Integer.parseInt(textField_5.getText());
				/*System.out.println(pno+" "+fno);
				String column[];
				String data[][];
				column=new String[pno];
				data=new String[pno][fno];
				for(int i=0;i<=pno-1;i++)
				{
					//column[i]=Integer.toString(i+1);
					column[i]="h";
				}
				for(int i=0;i<=pno-1;i++)
				{
					for(int j=0;j<=fno-1;j++)
					{
						//data[i][j]=Integer.toString(j+1);
						data[i][j]="bye";
					}
				}
				table = new JTable(data,column);
				table.setBounds(1000,45, 600,300);
				frame.getContentPane().add(table);
				*/
			}});
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSolve.setForeground(new java.awt.Color(27,239,69));
		btnSolve.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,158,0),3));
		btnSolve.setBounds(977, 90, 111, 36);
		frame.getContentPane().add(btnSolve);
		btnSolve.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				int fifo=P.FIFO();
				System.out.println("abc"+fifo+"abc");
				String f1=Integer.toString(fifo);
				textField.setText(f1);
				int lru=P.LRU();
				String l1=Integer.toString(lru);
				textField_1.setText(l1);
				int sc=P.SecondChance();
				String sc1=Integer.toString(sc);
				textField_3.setText(sc1);
				int op=P.Optimal();
				String op1=Integer.toString(op);
				textField_2.setText(op1);
				/*int pno=Integer.parseInt(textField_4.getText());
				int fno=Integer.parseInt(textField_5.getText());
				System.out.println(pno+" "+fno);
				String column[];
				String data[][];
				column=new String[pno];
				data=new String[pno][fno];
				for(int i=0;i<=pno-1;i++)
				{
					//column[i]=Integer.toString(i+1);
					column[i]="h";
				}
				for(int i=0;i<=pno-1;i++)
				{
					for(int j=0;j<=fno-1;j++)
					{
						//data[i][j]=Integer.toString(j+1);
						data[i][j]="bye";
					}
				}
				table = new JTable(data,column);
				table.setBounds(1000,45, 600,300);
				JScrollPane sp=new JScrollPane(table);
		        //repaint();
		        //revalidate();
				//frame.getContentPane().add(table);
				frame.add(sp);
				frame.repaint();
				frame.revalidate();*/
			}});
		
		JLabel lblPageFaults = new JLabel("Page Faults:");
		lblPageFaults.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPageFaults.setBounds(468, 259, 105, 36);
		frame.getContentPane().add(lblPageFaults);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(583, 267, 40, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPageFaults_1 = new JLabel("Page Faults:");
		lblPageFaults_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPageFaults_1.setBounds(1066, 259, 118, 37);
		frame.getContentPane().add(lblPageFaults_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(1194, 267, 42, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPageFaults_2 = new JLabel("Page Faults:");
		lblPageFaults_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPageFaults_2.setBounds(468, 353, 111, 30);
		frame.getContentPane().add(lblPageFaults_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setBounds(589, 358, 40, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPageFaults_3 = new JLabel("Page Faults:");
		lblPageFaults_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPageFaults_3.setBounds(1066, 357, 96, 23);
		frame.getContentPane().add(lblPageFaults_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setBounds(1194, 358, 42, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNoOfPages = new JLabel("No. of Pages:");
		lblNoOfPages.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNoOfPages.setBounds(494, 156, 132, 36);
		frame.getContentPane().add(lblNoOfPages);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_4.setBounds(627, 164, 34, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFrameSize = new JLabel("Frame Size:");
		lblFrameSize.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFrameSize.setBounds(823, 156, 111, 36);
		frame.getContentPane().add(lblFrameSize);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setBounds(920, 164, 34, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblPages = new JLabel("Pages:");
		lblPages.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPages.setBounds(468, 428, 67, 20);
		frame.getContentPane().add(lblPages);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_6.setBounds(545, 426, 486, 23);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("FIFO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setForeground(new java.awt.Color(27,239,69));
		btnNewButton.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,153,0),3));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pno=P.pages();
				int fno=P.frames();
				Object column[];
				Object data[][];
				int [][]data1=P.second();
				column=new Object[pno+1];
				data=new Object[fno+1][pno+1];
				for(int i=0;i<=pno;i++)
				{
					column[i]=Integer.toString(i+1);
					//column[i]=i;
				}
				int i,j;
				for(i=0;i<=pno;i++)
				{
					for(j=0;j<=fno-1;j++)
					{
						data[j][i]=Integer.toString(data1[i][j]);
						//data[j][i]="bye";
					}
					if(data1[i][j]==-3)
						data[j][i]="PF";
					else
						data[j][i]="PH";
				}
				data[fno][0]="_";	
				table = new JTable(data,column);
				table.setBackground(new java.awt.Color(109, 201, 247));
	    	    table.setFont(new java.awt.Font("Tahoma", 1, 15));
	    	    table.setForeground(new java.awt.Color(31,38,235));
	    	    table.setGridColor(new java.awt.Color(0,0,0));
	    	    table.setRowSelectionAllowed(false);
	    	    table.setSurrendersFocusOnKeystroke(true);
	    	    table.getTableHeader().setReorderingAllowed(false);
	    	    frame.getContentPane().setLayout(null);
	    	    JScrollPane scrollPane = new JScrollPane();
	    	    scrollPane.setViewportView(table);
	    	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
	    	    scrollPane.setBounds(450, 500, 600,200);
	    	   //scrollPane.setForeground(Color.BLACK);
	    	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    	    scrollPane.setFocusable(false);
	    	    scrollPane.getViewport().setBackground(table.getBackground());
	    	    scrollPane.setViewportView(table);
	    	    frame.getContentPane().add(scrollPane);
	    	
			}
		});
		btnNewButton.setBounds(369, 204, 134, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLru = new JButton("LRU");
		btnLru.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLru.setForeground(new java.awt.Color(27,239,69));
		btnLru.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,153,0),3));
		btnLru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pno=P.pages();
				int fno=P.frames();
				Object column[];
				Object data[][];
				int [][]data1=P.first();
				column=new Object[pno+1];
				data=new Object[fno+1][pno+1];
				for(int i=0;i<=pno;i++)
				{
					column[i]=Integer.toString(i+1);
					//column[i]=i;
				}
				int i,j;
				for(i=0;i<=pno;i++)
				{
					for(j=0;j<=fno-1;j++)
					{
						data[j][i]=Integer.toString(data1[i][j]);
						//data[j][i]="bye";
					}
					if(data1[i][j]==-4)
					data[j][i]="PF";
					else
					data[j][i]="PH";
				}
				data[fno][0]="_";
				table = new JTable(data,column);
				table.setBackground(new java.awt.Color(109, 201, 247));
	    	    table.setFont(new java.awt.Font("Tahoma", 1, 15));
	    	    table.setForeground(new java.awt.Color(31,38,235));
	    	    table.setGridColor(new java.awt.Color(0,0,0));
	    	    table.setRowSelectionAllowed(false);
	    	    table.setSurrendersFocusOnKeystroke(true);
	    	    table.getTableHeader().setReorderingAllowed(false);
	    	    frame.getContentPane().setLayout(null);
	    	    JScrollPane scrollPane = new JScrollPane();
	    	    scrollPane.setViewportView(table);
	    	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
	    	    scrollPane.setBounds(450, 500, 600,200);	    	   //scrollPane.setForeground(Color.BLACK);
	    	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    	    scrollPane.setFocusable(false);
	    	    scrollPane.getViewport().setBackground(table.getBackground());
	    	    scrollPane.setViewportView(table);
	    	    frame.getContentPane().add(scrollPane);
	    	
			}
		});
		btnLru.setBounds(977, 204, 134, 36);
		frame.getContentPane().add(btnLru);
		
		JButton btnOptimal = new JButton("OPTIMAL");
		btnOptimal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOptimal.setForeground(new java.awt.Color(27,239,69));
		btnOptimal.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,153,0),3));
		btnOptimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pno=P.pages();
				int fno=P.frames();
				Object column[];
				Object data[][];
				int [][]data1=P.fourth();
				column=new Object[pno+1];
				data=new Object[fno+1][pno+1];
				for(int i=0;i<=pno;i++)
				{
					column[i]=Integer.toString(i+1);
					//column[i]=i;
				}
				int i,j;
				for(i=0;i<=pno;i++)
				{
					for(j=0;j<=fno-1;j++)
					{
						data[j][i]=Integer.toString(data1[i][j]);
						//data[j][i]="bye";
					}
					if(data1[i][j]==-3)
						data[j][i]="PF";
					else
						data[j][i]="PH";
				}
				data[fno][0]="_";
				table = new JTable(data,column);
				table.setBackground(new java.awt.Color(109, 201, 247));
	    	    table.setFont(new java.awt.Font("Tahoma", 1, 15));
	    	    table.setForeground(new java.awt.Color(31,38,235));
	    	    table.setGridColor(new java.awt.Color(0,0,0));
	    	    table.setRowSelectionAllowed(false);
	    	    table.setSurrendersFocusOnKeystroke(true);
	    	    table.getTableHeader().setReorderingAllowed(false);
	    	    frame.getContentPane().setLayout(null);
	    	    JScrollPane scrollPane = new JScrollPane();
	    	    scrollPane.setViewportView(table);
	    	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
	    	    scrollPane.setBounds(450, 500, 610,210);
	    	    //scrollPane.setForeground(Color.BLACK);
	    	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    	    scrollPane.setFocusable(false);
	    	    scrollPane.getViewport().setBackground(table.getBackground());
	    	    scrollPane.setViewportView(table);
	    	    frame.getContentPane().add(scrollPane);
	    	
			}
		});
		btnOptimal.setBounds(369, 307, 134, 36);
		frame.getContentPane().add(btnOptimal);
		
		JButton btnSecondChance = new JButton("SECOND CHANCE");
		btnSecondChance.setForeground(new java.awt.Color(27,239,69));
		btnSecondChance.setBorder(BorderFactory.createLineBorder(new java.awt.Color(0,153,0),3));
		btnSecondChance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int pno=P.pages();
				int fno=P.frames();
				Object column[];
				Object data[][];
				int [][]data1=P.second();
				column=new Object[pno+1];
				data=new Object[fno+1][pno+1];
				for(int i=0;i<=pno;i++)
				{
					column[i]=Integer.toString(i+1);
					//column[i]=i;
				}
				int i,j;
				for(i=0;i<=pno;i++)
				{
					for(j=0;j<=fno-1;j++)
					{
						data[j][i]=Integer.toString(data1[i][j]);
						//data[j][i]="bye";
					}
					if(data1[i][j]==-3)
						data[j][i]="PF";
					else
						data[j][i]="PH";
				}
				data[fno][0]="_";
				table = new JTable(data,column);
				table.setBackground(new java.awt.Color(109, 201, 247));
	    	    table.setFont(new java.awt.Font("Tahoma", 1, 15));
	    	    table.setForeground(new java.awt.Color(31,38,235));
	    	    table.setGridColor(new java.awt.Color(0,0,0));
	    	    table.setRowSelectionAllowed(false);
	    	    table.setSurrendersFocusOnKeystroke(true);
	    	    table.getTableHeader().setReorderingAllowed(false);
	    	    frame.getContentPane().setLayout(null);
	    	    JScrollPane scrollPane = new JScrollPane();
	    	    scrollPane.setViewportView(table);
	    	    scrollPane.setForeground(new java.awt.Color(102, 255, 102));
	    	    //scrollPane.setBackground(new java.awt.Color(240,240,240));
	    	    scrollPane.setBounds(450, 500, 600,200);
	    	    //scrollPane.setForeground(Color.BLACK);
	    	    scrollPane.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
	    	    scrollPane.setFocusable(false);
	    	    scrollPane.getViewport().setBackground(table.getBackground());
	    	    scrollPane.setViewportView(table);
	    	    frame.getContentPane().add(scrollPane);
	    	
			}
		});
		btnSecondChance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSecondChance.setBounds(977, 307, 166, 37);
		frame.getContentPane().add(btnSecondChance);
		
		MyButton btnHome = new MyButton("Home");
		btnHome.setBounds(1246, 11, 96, 36);
		btnHome.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Simulator.main(null);
				frame.dispose();
			}});
		frame.getContentPane().add(btnHome);
		/*table = new JTable();
		table.setBounds(1000,45, 600,300);
		frame.getContentPane().add(table);
		*/
		// pno=Integer.parseInt(textField_4.getText());
		//int fno=Integer.parseInt(textField_5.getText());
		
	}
}
