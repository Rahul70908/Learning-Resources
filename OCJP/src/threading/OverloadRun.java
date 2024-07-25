package threading;
class Overload extends Thread {
	public void run()
	{
	 System.out.println("No-args");
	}
	public void run(int i)
	{
	 System.out.println("args method");
	}
}
public class OverloadRun  {
	public static void main(String[] args) {
      Overload t=new Overload();
      t.start();
      t.run(10);
	}
}