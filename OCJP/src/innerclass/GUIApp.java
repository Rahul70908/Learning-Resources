package innerclass;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
public class GUIApp extends JFrame
{
  public static void main(String[] args) 
  {
    JFrame f=new JFrame();
    f.addWindowListener(new WindowAdapter() 
    {
      public void windowClosing(WindowEvent e) 
      {
        for (int i = 1; i <=10; i++) 
        {
		  System.out.println("I'm Closing :"+ i);
		}
        System.exit(0);
      }
	});
    f.add(new Label("I can create executable JAR file"));
    f.setSize(500,500);
    f.setVisible(true);
  }
}