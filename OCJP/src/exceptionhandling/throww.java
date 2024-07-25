package exceptionhandling;
public class throww extends RuntimeException 
{
//  static ArithmeticException e;	
  public static void main(String[] args) 
  {
// creation of arithmetic exception object explicitly
//	throw new ArithmeticException("/ by zero"); 

//	System.out.println(10/0);
	System.out.println("Hello");
    
	throw new throww();
  }
}