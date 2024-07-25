package collectionss;
import java.io.Serializable;
import java.util.*;
public class StackClass 
{
  public static void main(String[] args)
  {
	Stack<String> s=new Stack<String>();
	s.push("A");
	s.push("B");
	s.push("C");
	s.push("D");
	System.out.println(s);
	
    System.out.println(s.pop());

    System.out.println(s.peek());
    System.out.println(s.empty());

	System.out.println(s.search("A"));
	System.out.println(s.search("Z"));

	System.out.println(s.capacity()+"\n");
    
	System.out.println(s instanceof Serializable);
    System.out.println(s instanceof Cloneable);
    System.out.println(s instanceof RandomAccess);
  }
}
