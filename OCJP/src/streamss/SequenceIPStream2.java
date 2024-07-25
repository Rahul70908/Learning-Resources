package streamss;
import java.io.*;
public class SequenceIPStream2 
{
  public static void main(String[] args) 
  {
   try(FileInputStream fis1=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");
       FileInputStream fis2=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO2.txt"); 
   	   FileOutputStream fos=new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileOP.txt");
       SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
       )
    {
	  int i; 
      while((i=sis.read())!=-1)
      {
        fos.write(i);
      }
      System.out.println("Success");
    }
    catch(IOException e)
    {
      e.printStackTrace();	
    }
  }
}