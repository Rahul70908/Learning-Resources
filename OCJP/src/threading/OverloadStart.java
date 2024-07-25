package threading;
class OverloadS extends Thread {
	public void start()
	{
	super.start();	
	 System.out.println("start method");
	}
	public void run()
	{
	 System.out.println("run method");
	}
}
public class OverloadStart  {
	public static void main(String[] args) {
      OverloadS t=new OverloadS();
      t.start();
      System.out.println("Main thread");
      t.start();
	}
}