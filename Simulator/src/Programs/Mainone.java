package Programs;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class Mainone extends JFrame implements ActionListener {
	private JPanel inputPanel_;
	private JPanel graphPanel_;
	private JPanel buttonPanel_;
	private JComboBox algorithmCombo_;

	int startingPoint = 53;

	String[] alogorithmNames = { "FCFS", "SSTF", "SCAN", "CSCAN", "LOOK",
			"CLOOK" };
	String[] nameOfTheButtons = { "Input Parameters", "Random Input",  "Draw Graph" };
	// private JButton button;
	private MyButton button;

	private JLabel head;
	private JLabel cylcount;
	private JLabel val;
	private JLabel Select;
	private JLabel time;
	private JLabel disktime;
	MyButton btnNewButton_7;
	
	int[] diskPosstion;
	int selected;

	private JTextField[] inputField_;
	private JScrollPane jScrollPane;

	public int numOfCyn = 38, latency=1;

	public Mainone() {
		super("Disk Scheduling");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(new Dimension(600, 720));
		setLocationRelativeTo(null);
		setVisible(true);
		addWindowListener(new ExitListener());
		setLayout(new FlowLayout());
		initComponents();
		
	}

	public void initComponents() {
		graphPanel_ = new JPanel();
		// graphPanel_.setBorder(new TitledBorder("Graph"));
		graphPanel_.setPreferredSize(new Dimension(600, 400));

		inputPanel_ = new JPanel();
		inputPanel_.setBorder(new TitledBorder("Input"));
		inputPanel_.setPreferredSize(new Dimension(250, 200));
		// inputPanel_.setBackground(Color.yellow);

		buttonPanel_ = new JPanel();
		buttonPanel_.setPreferredSize(new Dimension(280, 200));
		buttonPanel_.setBorder(new TitledBorder("Options"));

		head = new JLabel("Head Possition: ");
		
		cylcount=new JLabel("Cylinders Traversed:");
		cylcount.setBounds(586, 341, 305, 14);
		cylcount.setFont(new Font("Vardana", Font.BOLD, 14));
		val=new JLabel("0");
		val.setBounds(586, 341, 305, 14);
		val.setFont(new Font("Vardana", Font.BOLD, 14));
		time=new JLabel(" Time Taken:");
	    time.setBounds(586, 341, 305, 14);
		time.setFont(new Font("Vardana", Font.BOLD, 14));
		disktime=new JLabel("0");
	    disktime.setBounds(586, 341, 305, 14);
		disktime.setFont(new Font("Vardana", Font.BOLD, 14));
		MyButton btnNewButton_7= new MyButton("Home");
		btnNewButton_7.setBounds(900, 100, 80, 35);
		btnNewButton_7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				Simulator.main(null);
				dispose();
			}});
		
		add(graphPanel_);
		add(inputPanel_);
		add(buttonPanel_);
		add(cylcount);
		add(val);
		add(time);
		add(disktime);
		add(btnNewButton_7);
		

		setButtonPanel();
	}

	public void setInputPanel() {
		inputPanel_.removeAll();

		JPanel valuePanel = new JPanel();

		numOfCyn = Integer.parseInt(JOptionPane.showInputDialog(this,
				"Enter the number of Cylinders: "));
		latency=Integer.parseInt(JOptionPane.showInputDialog(this,
				"Time Latency: "));
		valuePanel.setLayout(new GridLayout(numOfCyn, 2, 10, 10));

		inputField_ = new JTextField[numOfCyn];
		for (int i = 0; i < inputField_.length; i++) {
			JLabel label = new JLabel("Cyldr: " + (i + 1));
			label.setFont(new Font("Vardana", Font.BOLD, 14));

			inputField_[i] = new JTextField(2);
			inputField_[i].setHorizontalAlignment(JTextField.CENTER);

			valuePanel.add(label);
			valuePanel.add(inputField_[i]);
		}

		jScrollPane = new JScrollPane();
		jScrollPane.setPreferredSize(new java.awt.Dimension(200, 150));

		jScrollPane.setViewportView(valuePanel);
		jScrollPane.validate();
		inputPanel_.add(jScrollPane);
		inputPanel_.revalidate();
	}

	public void setButtonPanel() {
		buttonPanel_.setLayout(new FlowLayout());

		for (int i = 0; i < nameOfTheButtons.length; i++) {
			button = new MyButton(nameOfTheButtons[i], 50);
			button.addActionListener(this);
			buttonPanel_.add(button);
		}
		Select=new JLabel("<html><font color='red'>Select Algorithm</font></html>");
		Select.setFont(new Font("Vardana", Font.BOLD, 14));
		algorithmCombo_ = new JComboBox(alogorithmNames);
		buttonPanel_.add(Select);
		buttonPanel_.add(algorithmCombo_);
		buttonPanel_.revalidate();
	}

	public void setGraphPanel(JPanel panel) {
		graphPanel_.setLayout(new FlowLayout());
		graphPanel_.removeAll();
		graphPanel_.add(panel);

		head.setFont(new Font("Vardana", Font.BOLD, 14));
		head.setForeground(Color.BLUE);
		head.setText("Algorithm: " + algorithmCombo_.getSelectedItem()
				+ " Starting point: " + startingPoint);
		graphPanel_.add(head);
		graphPanel_.repaint();
		graphPanel_.revalidate();
	}
	public int[] shift(int[] arr,int x,int n)
	{
		int [] ans=new int[n+1];
		ans[0]=x;
		for(int i=1;i<=n;i++)
			ans[i]=arr[i-1];
		return ans;
	}
	public int[] shift1(int[] arr,int x,int n)
	{
		int [] ans=new int[n+2];
		ans[0]=x;
		for(int i=1;i<=n+1;i++)
			ans[i]=arr[i-1];
		return ans;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Input Parameters")) {
			setInputPanel();
		} else if (e.getActionCommand().equals("Random Input")) {
			for (int i = 0; i < numOfCyn; i++) {
				long random = (long) (Math.random() * 200 + 1);
				inputField_[i].setText("" + random);
			}
		} else if (e.getActionCommand().equals("Draw Graph")) {
			selected = algorithmCombo_.getSelectedIndex();
			diskPosstion = new int[numOfCyn];

			for (int i = 0; i < numOfCyn; i++) {
				diskPosstion[i] = Integer
						.parseInt(inputField_[i].getText());
			}
			startingPoint = Integer.parseInt(JOptionPane.showInputDialog(this,
					"Enter starting point: "));
			if (selected == 0) {
				int [] disk=shift(diskPosstion,startingPoint,numOfCyn);
				DiskAlgos D=new DiskAlgos();
				int x=D.FCFS(diskPosstion, startingPoint,numOfCyn);
				String S=Integer.toString(x);
				val.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				setGraphPanel(new DrawGraph(disk));
			} else if (selected == 1) {
				DiskAlgos D = new DiskAlgos();
				int[] ssft = D.SSTF(diskPosstion, startingPoint,numOfCyn);
				int x=ssft[numOfCyn];
				String S=Integer.toString(x);
				val.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				ssft=shift(ssft,startingPoint,numOfCyn);
				setGraphPanel(new DrawGraph(ssft));
			} else if (selected == 2) {
				DiskAlgos D = new DiskAlgos();
				int[] Scan = D.scan(diskPosstion, startingPoint,numOfCyn);
				int x=Scan[numOfCyn+1];
				String S=Integer.toString(x);
				val.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				Scan=shift1(Scan,startingPoint,numOfCyn);
				setGraphPanel(new DrawGraph(Scan));
			} else if (selected == 3) {
				DiskAlgos D = new DiskAlgos();
				int[] cscan = D.CScan(diskPosstion, startingPoint,numOfCyn);
				int x=cscan[numOfCyn+1];
				String S=Integer.toString(x);
				val.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				cscan=shift1(cscan,startingPoint,numOfCyn);
				setGraphPanel(new DrawGraph(cscan));
			} else if (selected == 4) {
				DiskAlgos D = new DiskAlgos();
				int[] l = D.look(diskPosstion, startingPoint,numOfCyn);
				int x=l[numOfCyn];
				String S=Integer.toString(x);
				disktime.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				l=shift(l,startingPoint,numOfCyn);
				setGraphPanel(new DrawGraph(l));
			} else if (selected == 5) {
				DiskAlgos D = new DiskAlgos();
				int[] clook = D.Clook(diskPosstion, startingPoint,numOfCyn);
				int x=clook[numOfCyn];
				String S=Integer.toString(x);
				val.setText(S);
				int time=x*latency;
				S=Integer.toString(time);
				disktime.setText(S);
				clook=shift(clook,startingPoint,numOfCyn);
				setGraphPanel(new DrawGraph(clook));
			}
		}
	}
}
