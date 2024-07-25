package streamss;
import java.io.*;
public class BufferedOPStream 
{
  public static void main(String[] args)throws Exception 
  {
	try(FileOutputStream fos=new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");
		BufferedOutputStream bo=new BufferedOutputStream(fos);
	   )
	{
      String s="Welcome to my PC";
	  byte[] b=s.getBytes();
	  bo.write(b);
	  bo.flush();
	  System.out.println("Succes");
	}
	catch(IOException e)
	{
	  e.printStackTrace();	
	}    	
  }
}