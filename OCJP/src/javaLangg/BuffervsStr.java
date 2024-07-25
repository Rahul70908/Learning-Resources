package javaLangg;
public class BuffervsStr 
{
  public static void main(String[] args) 
  {
    String s1=new String("rahul");
    String s2=new String("rahul");
    StringBuffer sb1=new StringBuffer("rahul");
    StringBuffer sb2=new StringBuffer("rahul");
    System.out.println(s1==s2);
    System.out.println(s1.endsWith(s2));
    System.out.println(sb1==sb2);
    System.out.println(sb1.equals(sb2));
//    System.out.println(s1==sb1);
    System.out.println(s1.equals(sb1));
  }
}