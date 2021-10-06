package Programs;
import Programs.process;

import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JTable;

 class MainWindow {
	JPanel panel = new JPanel();
	
	JSpinner spinner,spinner_1;
	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	
	public static void hello() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final process P=new process();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1368, 768);
		frame.setTitle("Process Scheduling");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		//JPanel.setBorder(new EmptyBorder(5,5,5,5));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel_3.setBounds(504, 287, 70, 14);
		panel_1.add(lblNewLabel_3);
		
		MyButton btnNewButton = new MyButton("FCFS");
		btnNewButton.setBounds(10, 146, 102, 40);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
				//String textFieldValue = textField.getText();
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,0);
				float x=P.fcfs();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
			}
			
			});
		panel_1.add(btnNewButton);
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("No of processes");
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblNewLabel.setBounds(10, 63, 118, 17);
		panel_1.add(lblNewLabel);
		MyButton btnNewButton_7= new MyButton("Home");
		btnNewButton_7.setBounds(1288, 0, 80, 35);
		btnNewButton_7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Simulator.main(null);
				frame.dispose();
			}});
		panel_1.add(btnNewButton_7);
		
		MyButton btnNewButton_1 = new MyButton("RR");
		btnNewButton_1.setBounds(10, 208, 102, 38);
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//String textFieldValue = textField.getText();
				//String no=textField_1.getText();
				//int qt=Integer.parseInt(no);
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,qt);
				float x=P.rr();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
				
			}
			});
		panel_1.add(btnNewButton_1);
		
		MyButton btnNewButton_2 = new MyButton("Preemptive");
		btnNewButton_2.setBounds(417, 146, 152, 40);
		btnNewButton_2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//String textFieldValue = textField.getText();
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,0);
				float x=P.Preemptive();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
				
			}
			});
		panel_1.add(btnNewButton_2);
		
		MyButton btnNewButton_3 = new MyButton("Non Preemptive");
		btnNewButton_3.setBounds(417, 208, 152, 38);
		btnNewButton_3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//String textFieldValue = textField.getText();
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,0);
				float x=P.np();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
			}
			});
		panel_1.add(btnNewButton_3);
		
		MyButton btnNewButton_4 = new MyButton("Preemptive");
		btnNewButton_4.setBounds(810, 146, 152, 40);
		btnNewButton_4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//String textFieldValue = textField.getText();
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,0);
				float x=P.Priority_preemptive();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
			}
			});
		panel_1.add(btnNewButton_4);
		
		MyButton btnNewButton_5 = new MyButton("Non Preemptive");
		btnNewButton_5.setBounds(810, 208, 152, 40);
		btnNewButton_5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//String textFieldValue = textField.getText();
				//int n=Integer.parseInt(textFieldValue);
				//processes P=new processes();
				//P.input(n,0);
				float x=P.non_Preemptive_pri();
				String S=Float.toString(x);
				lblNewLabel_3.setText(S);
				//System.out.println(x);
			}
			});
		panel_1.add(btnNewButton_5);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Time quantum");
		lblNewLabel_1.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(12, 91, 116, 21);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSjf = new JLabel("SJF");
		lblSjf.setFont(new Font("Algerian", Font.BOLD, 13));
		lblSjf.setBounds(482, 121, 44, 14);
		panel_1.add(lblSjf);
		
		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setFont(new Font("Algerian", Font.PLAIN, 13));
		lblPriority.setBounds(857, 121, 71, 14);
		panel_1.add(lblPriority);
		
		JLabel lblSchedulingAlgorithms = new JLabel("Scheduling Algorithms");
		lblSchedulingAlgorithms.setForeground(Color.RED);
		lblSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblSchedulingAlgorithms.setBounds(550, 11, 278, 31);
		panel_1.add(lblSchedulingAlgorithms);
		
		JLabel lblResult = new JLabel("Result: ");
		lblResult.setFont(new Font("Algerian", Font.BOLD, 13));
		lblResult.setBounds(429, 286, 65, 20);
		panel_1.add(lblResult);
		
		final JLabel lblNewLabel_2 = new JLabel("Status: No Input");
		lblNewLabel_2.setFont(new Font("Algerian", Font.ITALIC, 13));
		lblNewLabel_2.setBounds(155, 686, 305, 14);
		panel_1.add(lblNewLabel_2);
		
		 spinner = new JSpinner();
		spinner.setBounds(138, 60, 57, 20);
		panel_1.add(spinner);
		
		 spinner_1 = new JSpinner();
		spinner_1.setBounds(138, 91, 57, 20);
		panel_1.add(spinner_1);
		
		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		panel_2.setBounds(10, 378, 478, 297);
		panel_1.add(panel_2);
		
		MyButton btnNewButton_6 = new MyButton("Generate Input");
		btnNewButton_6.setBounds(239, 74, 144, 36);
		btnNewButton_6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Object o = spinner.getValue();
				Number n = (Number) o;
				int i = n.intValue();
				 Object o1 = spinner_1.getValue();
				 Number l= (Number) o;
					int i1 = l.intValue();
				int[][] Ref=P.input(i,i1);
				Object rowData[][] ;
				rowData=new Object[i+1][4];
				Object columnNames[] = { "Processes", "Arrival Time", "Burst Time","Priority" };
				rowData[0][0]="Processes";
				rowData[0][1]="Arrival Time";
				rowData[0][2]="BurstTime";
				rowData[0][3]="Priority";
				
				for(int j=0,k=1;j<i;j++,k++)
				{
					String m=Integer.toString(k);
					rowData[k][0]="p"+m;
					rowData[k][1]=Integer.toString(Ref[j][0]);
					rowData[k][2]=Integer.toString(Ref[j][1]);
					rowData[k][3]=Integer.toString(Ref[j][2]);
				}
				 JTable table = new JTable(rowData, columnNames);
				 table.setBackground(new java.awt.Color(0, 0, 0));
		    	    table.setFont(new java.awt.Font("Tahoma", 1, 12));
		    	    table.setForeground(new java.awt.Color(102, 255, 102));
		    	    table.setGridColor(new java.awt.Color(198, 198, 48));
		    	    table.setRowSelectionAllowed(false);
		    	    table.setSurrendersFocusOnKeystroke(true);
		    	    table.getTableHeader().setReorderingAllowed(false);
		    	    frame.getContentPane().setLayout(null);
		    	    
				 if(i<9)
				 table.setRowHeight(30);
				 else
					 table.setRowHeight(25);
				 TableColumnModel columnModel = table.getColumnModel();
				 columnModel.getColumn(0).setWidth(150);
				 columnModel.getColumn(1).setWidth(150);
				 columnModel.getColumn(2).setWidth(150);
				 columnModel.getColumn(3).setWidth(150);
				 table.setBounds(30,40,200,300);  
			      
				    
				 
                 
				 panel_2.add(table);
				lblNewLabel_2.setText("Status: Input Successfully Generated");
			}});
		panel_1.add(btnNewButton_6);
		MyButton btnShowBest = new MyButton("Show Best");
		btnShowBest.setBounds(342, 312, 118, 31);
		btnShowBest.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				float min=9999,x[];
				x = new float[6];
				String S1="Hi";
				x[0]=P.fcfs();
				x[1]=P.rr();
				x[2]=P.Preemptive();
				x[3]=P.np();
				x[4]=P.Priority_preemptive();
				x[5]=P.non_Preemptive_pri();
				for(int i=0;i<6;i++)
				{
					if(x[i]<min){
						min=x[i];
						if(i==0)
							S1="FCFS";
						else if(i==1)
							S1="RR";
						else if(i==2)
							S1="Preemptive";
						else if(i==3)
							S1="Non Preemptive";
						else if(i==4)
							S1="Pri Preemptive";
						else 
							S1="Pri Non Preemptive";
					}
						
				}
				String S2=Float.toString(min);
				textField_4.setText(S2);
				textField_3.setText(S1);
				
			}
			});
		panel_1.add(btnShowBest);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.CYAN);
		textField_3.setBounds(472, 317, 86, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.CYAN);
		textField_4.setBounds(568, 317, 86, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		 
		MyButton btnDrawGraph = new MyButton("Draw Graph");
		btnDrawGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultCategoryDataset dataset=new DefaultCategoryDataset();
				float[] x;
				x = new float[6];
				x[0]=P.fcfs();
				x[1]=P.rr();
				x[2]=P.Preemptive();
				x[3]=P.np();
				x[4]=P.Priority_preemptive();
				x[5]=P.non_Preemptive_pri();
				dataset.setValue(x[0], "Avg Waiting Time", "FCFS");
				dataset.setValue(x[3], "Avg Waiting Time", "SJF NonPreemptive");
				dataset.setValue(x[2], "Avg Waiting Time", "SJF Preemptive");
				dataset.setValue(x[4], "Avg Waiting Time", "Priority Preemptive");
				dataset.setValue(x[1], "Avg Waiting Time", "RoundRobin");
				dataset.setValue(x[5], "Avg Waiting Time", "Priority NonPreemptive");
				JFreeChart chart=ChartFactory.createBarChart("Scheduling Algorithms Performance", "Algorithms", "Avg Waiting Time", dataset);
			    CategoryPlot p=chart.getCategoryPlot();
			    p.setRangeGridlinePaint(Color.black);
			    ChartPanel myChart = new ChartPanel(chart);
	            myChart.setMouseWheelEnabled(true);
	            myChart.setBackground(Color.BLACK);
	            chart.getPlot().setBackgroundPaint( Color.CYAN );
	            panel.setLayout(new java.awt.BorderLayout());
	            panel.add(myChart,BorderLayout.CENTER);
	            panel.validate();
			}
		});
		btnDrawGraph.setBounds(399, 74, 89, 38);
		panel_1.add(btnDrawGraph);
		panel.setBackground(Color.CYAN);
		
		panel.setBounds(580, 393, 444, 307);
		panel_1.add(panel);
		
		
		
			
		
	}
	void setGraphPanel1(JPanel panel1){
		panel.setLayout(new FlowLayout());
		panel.removeAll();
		panel.add(panel1);
		panel.repaint();
		panel.revalidate();
	}
}
 public class MainWindow1{
	 public static void main(String[] args)
	 {
		 MainWindow m=new MainWindow();
		 m.hello();
		 
	 }
 }
