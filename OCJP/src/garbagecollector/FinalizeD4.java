package garbagecollector;
public class FinalizeD4 
{
  static int count=0;	
  public static void main(String[] args) 
  {
    for(int i=0;i<1000000;i++)
    {
	FinalizeD4 s=new FinalizeD4();
	s=null;
    }
  }
  public void finalize()
  {
   System.out.println("Finalize method called "+ ++count);
  }
}