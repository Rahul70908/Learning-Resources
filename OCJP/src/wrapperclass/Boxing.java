package wrapperclass;
public class Boxing 
{
  static Integer I=10;//Autoboxing 	
  public static void main(String[] args) 
  {	  
   int i=I;//Autounboxing
   m1(i);
  
  } 
  public static void m1(Integer k)//Autoboxing
  {
	  int m=k;//Autounboxing
	  System.out.println(m);
  }
}