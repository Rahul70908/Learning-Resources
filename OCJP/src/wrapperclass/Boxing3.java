package wrapperclass;
public class Boxing3 
{
  public static void main(String[] args) 
  {
    Integer X=10;
    Integer Y=X;
    X++;
    System.out.println(X);
    System.out.println(Y);
    System.out.println(X==Y);
  }
}