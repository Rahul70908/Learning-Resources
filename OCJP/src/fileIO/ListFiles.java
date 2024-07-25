package fileIO;
import java.io.*;
public class ListFiles 
{
  public static void main(String[] args)throws Exception 
  {
    int count=0,count1=0;	  
   File f=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO");
    String[] s=f.list();
    for (String s1 : s) 
    {
    File f1=new File(f,s1);
      if(f1.isFile())
      {
    	count++;
    	System.out.println(s1);
      }
      else if(f1.isDirectory())
      {
    	count1++;
    	System.out.println(s1);
      }
    }
    System.out.println("Total File: "+count);
    System.out.println("Total Directory: "+count1);
  }
}