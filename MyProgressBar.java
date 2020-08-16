import javax.swing.*;
 
public class MyProgressBar extends JFrame {
 
  JProgressBar jb;
  int i = 0, num = 0;
 
  MyProgressBar() {
    jb = new JProgressBar(0, 2000);
    jb.setBounds(40, 40, 200, 30);
 
    jb.setValue(0);
    jb.setStringPainted(true);
 
    add(jb);
    setSize(300, 200);
    setLayout(null);
  }
 
  public void iterate() {
    while (i <= 2000) {
      jb.setValue(i);
      i = i + 20;
      try {
        Thread.sleep(60);
      } catch (Exception e) {
      }
    }
  }
 
  public static void main(String[] args) {
    MyProgressBar m = new MyProgressBar();
    m.setVisible(true);
    m.iterate();
  }
}
 