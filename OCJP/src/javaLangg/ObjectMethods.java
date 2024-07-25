package javaLangg;
import java.lang.reflect.*;
public class ObjectMethods 
{
  public static void main(String[] args)throws ClassNotFoundException 
  {
    int count=0;
    Class c=Class.forName("java.lang.Object");
    Method[] m=c.getDeclaredMethods();
    for (Method method : m) 
    {
	  count++;
	  System.out.println(method.getName());
	}
   System.out.println("No. of methods in Object class is "+count);
  }
}