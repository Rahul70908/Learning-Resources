package garbagecollector;
public class FinalizeD 
{
  public static void main(String[] args) 
  {
//    String s=new String("rahul");
	FinalizeD s=new FinalizeD();
	s=null;
    System.gc();
    System.out.println("End of main method");
  }
  public void finalize()
  {
	System.out.println("Finalize method called");
  }
}