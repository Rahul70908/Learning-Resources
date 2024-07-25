package basic;
import java.awt.*;
import java.awt.event.*;

public class TestFlowLayout extends Frame implements ActionListener, WindowListener
{
	TextField t;
	TestFlowLayout(String name)
	{
		setLayout(new FlowLayout());
		setTitle(name);
		setSize(400,400);
		setVisible(true);
		Label l =new Label("Enter your Name");
		t=new TextField();
		Button b=new Button("Submit");
		b.addActionListener(this);
		TextArea ta=new TextArea("My Text Area", 10,10);
		addWindowListener(this);
		add(l);
		add(ta);		
		add(t);
		add(b);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("Button Pressed");
		t.setText("Submit Button Pressed");
		
	}
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window Closing");
	}

	public void windowActivated(WindowEvent e){System.out.println("Window Activated");}
	public void windowClosed(WindowEvent e){System.out.println("Window Closed");}	
	public void windowDeactivated(WindowEvent e){System.out.println("Window DeActivated");}
	public void windowDeiconified(WindowEvent e){System.out.println("Window Deiconified");}
	public void windowIconified(WindowEvent e){System.out.println("Window Iconified");}
	public void windowOpened(WindowEvent e){System.out.println("Window Opened");}


	public static void main(String args[])
	{
		TestFlowLayout t=new TestFlowLayout("My Frame");		

	}
}