package streamss;
import java.io.*;
public class SequenceIPStream 
{
  public static void main(String[] args) 
  {
   try(FileInputStream fis1=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");
       FileInputStream fis2=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO2.txt"); 
       SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
       )
    {
	  int i; 
      while((i=sis.read())!=-1)
      {
         System.out.print((char)i);
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();	
    }
  }
}