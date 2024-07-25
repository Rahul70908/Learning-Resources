package regEx;
import java.io.*;
import java.util.regex.*;
public class ListTXTFiles 
{
  public static void main(String[] args) 
  {
   int count=0;	  
   Pattern p=Pattern.compile("[a-zA-Z0-9_.$]+[.]txt");	
   File f=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO");
   String[] s=f.list();
   for (String s1 : s)
   {
	Matcher m=p.matcher(s1);
   	 if(m.find() && m.group().equals(s1))
	 {
   	  count++;	 
	  System.out.println(s1);	
	 }
   }
   System.out.println("Total Number of Files "+count);
  }
}