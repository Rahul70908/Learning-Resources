package wrapperclass;
public class Contract
{
  public static void main(String[] args) 
  {
    String s1=new String("rahul");
    String s2=new String("rahul");

    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode()==(s2.hashCode()));
  }
}