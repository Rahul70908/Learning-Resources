//Difference between String and StringBuffer
package stringg;
public class basic
{
  public static void main(String[] args) 
  {
//    String s=new String("rahul");
//    s.concat("gupta");
//    System.out.println(s);
//
//    StringBuffer s1=new StringBuffer("rahul");
//    s1.append("gupta");
//    System.out.println(s1);
      
//	  String s1=new String("rahul");
//	  String s2=new String("rahul");
//	  System.out.println(s1==s2);
//	  System.out.println(s1.equals(s2));
	  
//	  StringBuffer s3=new StringBuffer("rahul");
//	  StringBuffer s4=new StringBuffer("rahul");
//	  System.out.println(s3==s4);
//	  System.out.println(s3.equals(s4));
      
	  String s1=new String("Spring");
	  s1.concat("Summer");
	  String s2=s1.concat("Winter");
	  s1=s1.concat("Fall");
	  System.out.println(s1);
	  System.out.println(s2);  
  }
}