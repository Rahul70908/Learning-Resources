package collectionss;
import java.util.*;
public class ListIteratorDemo 
{
  public static void main(String[] args) 
  {
   LinkedList l=new LinkedList();
   l.add("rahul");
   l.add("sarfu");
   l.add("vivek");
   l.add("krish");
   System.out.println(l);
   ListIterator ltr=l.listIterator();
   while(ltr.hasNext())
   {
	String s=(String)ltr.next();
	if(s.equals("sarfu"))
	{
	 ltr.remove();	
	 System.out.println(l);
	}
	else if(s.equals("krish"))
	{
	  ltr.add("daniel");	
	  System.out.println(l);
	}
	else if(s.equals("vivek"))
	{
	  ltr.set("vekuuu");	
	  System.out.println(l);
	}
   }
   System.out.println(ltr.previousIndex());
   System.out.println(l+"\n");
  }
}