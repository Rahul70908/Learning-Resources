package garbagecollector;
public class FinalizeD2 
{
  public static void main(String[] args) 
  {
	FinalizeD2 s=new FinalizeD2();
	s.finalize();
	s.finalize();
	s=null;
    System.gc();
    System.out.println("End of main method");
  }
  public void finalize()
  {
	System.out.println("Finalize method called");
  }
}