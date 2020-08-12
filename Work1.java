import java.awt.*;
import javax.swing.*;
public class Work1 extends JPanel { 
	public void paint(Graphics g)  { 
		g.fillRect(95,95,590,590);
		for(int i=95;i<=500;i+=95) {  
 			for(int j=95;j<=500;j+=95) { 
				g.clearRect(i,j,90,90);
			}

		}
			for(int i=95;i<=590;i+=95) { 
				for(int j=95;j<=595;j+=95) {   
					g.clearRect(i,j,90,90);
			}
		}

	}
public static void main(String args[]) { 
	JFrame frame=new JFrame();
	frame.setSize(600,600);
	frame.getContentPane().add(new Work1());
	frame.setLocationRelativeTo(null);
	frame.setBackground(Color.BLUE);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}

}