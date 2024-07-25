package exceptionhandling;
class tooyoungexception extends RuntimeException 
{
  tooyoungexception(String s) 
  {
     super(s);
  }
}
class toooldexception extends RuntimeException 
{
  toooldexception(String s) 
  {
   	super(s);
  }
}
public class customexception
{
  public static void main(String[] args) 
  {
	int x=65;
	if(x>60)
	throw new tooyoungexception("Too old"); 
	else if (x<18)
	throw new toooldexception("too young");
	else
	System.out.println("You will get match details soon");	
  }
}