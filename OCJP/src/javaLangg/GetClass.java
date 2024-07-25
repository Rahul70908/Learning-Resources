package javaLangg;
import java.lang.reflect.*;
public class GetClass
{
  public static void main(String[] args) 
  {
	int count=0,count1=0;
	Object o=new String("rahul");
	Class c=o.getClass();
	System.out.println("Fully qualified name of class is "+c.getName());
    Method[] m=c.getDeclaredMethods();

    System.out.println("Method Info: ");
	for (Method m1: m) 
	{
	 count++;
	 System.out.println(m1.getName());	
	}
	System.out.println("No. of methods is: "+count);
	System.out.println();
	
	Constructor[] co=c.getDeclaredConstructors();
	for (Constructor co1 : co) 
	{
	 count1++;
	 System.out.println(co1.getName());
	}    
    System.out.println("No. of Constructor is: "+count1);   
  }
}