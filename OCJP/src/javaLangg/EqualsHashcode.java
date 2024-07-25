package javaLangg;
public class EqualsHashcode 
{
  public static void main(String[] args) 
  {
    String s1=new String("durga");
    String s2=new String("durga");
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println();
    StringBuffer sb1=new StringBuffer("durga");
    StringBuffer sb2=new StringBuffer("durga");
    System.out.println(sb1.equals(sb2));
    System.out.println(sb1.hashCode());
    System.out.println(sb2.hashCode());
    System.out.println();
    StringBuilder sbb1=new StringBuilder("durga");
    StringBuilder sbb2=new StringBuilder("durga");
    System.out.println(sbb1.equals(sbb2));
    System.out.println(sbb1.hashCode());
    System.out.println(sbb2.hashCode());
  }
}