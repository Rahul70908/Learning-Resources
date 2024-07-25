package javaLangg;
import java.util.ArrayList;
public class ToStringg2
{
  public static void main(String[] args) 
  {
	String s=new String("vivek");
	System.out.println(s);
	   
	Integer i=10;
	System.out.println(i);
	    
	ArrayList<String> l=new ArrayList<String>();
	l.add("A"); 
	l.add("B");
	System.out.println(l);	
    
	ToStringg2 t=new ToStringg2();
	System.out.println(t);
  }
}