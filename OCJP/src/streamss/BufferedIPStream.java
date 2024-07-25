package streamss;
import java.io.*;
public class BufferedIPStream 
{
  public static void main(String[] args) 
  {
	try(FileInputStream fis=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
	   )
    {
      int size=bis.available();
      byte[] b=new byte[size];
      bis.read(b);
      String data=new String(b);
      System.out.println(data);
    }
    catch(IOException e)
    {
    	
    }
  }
}