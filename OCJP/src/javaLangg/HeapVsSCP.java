package javaLangg;
public class HeapVsSCP
{
  public static void main(String[] args) 
  {
//    String s1=new String("rahul");
//    String s2=s1.intern();
//    System.out.println(s1==s2);
//    
//    String s3="rahul";
//    System.out.println(s2==s3);
      
	  String s1=new String("rahul");
	  System.out.println(s1.hashCode());
	  String s2=s1.concat("gupta");
	  System.out.println(s2.hashCode());
      String s3=s2.intern();
      System.out.println(s3.hashCode());
      System.out.println(s2==s3);

	  String s4=new String("rahulgupta");
	  System.out.println(s4.hashCode());
      System.out.println(s3==s4);
     
  }
}