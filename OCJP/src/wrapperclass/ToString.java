package wrapperclass;
public class ToString 
{
  public static void main(String[] args) 
  {
//	  Integer i=10;
//	  String s=i.toString();
//	  System.out.println(i);
//    System.out.println(s);
       
//    String s=Integer.toString(10);
//    String s1=Boolean.toString(true);
//    String s2=Character.toString('a');
  
//	  String s=Integer.toString(15,2);
//    String s1=Long.toString(20,2);
//    System.out.println(s);
//	  System.out.println(s1);
  
      String s1=Integer.toBinaryString(10);
      System.out.println(s1);
      
      String s2=Integer.toOctalString(10);
      System.out.println(s2);   
      
      String s3=Integer.toHexString(10);
      System.out.println(s3);
  }
}