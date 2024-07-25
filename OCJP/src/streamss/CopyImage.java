package streamss;
import java.io.*;
public class CopyImage 
{
  public static void main(String[] args) 
  {
    try(FileInputStream fis=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\danyal.jpeg");
	    FileOutputStream fos=new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\copydanyal.jpeg");	
	   )	                                      
	  {
	    int size=fis.available();	
		byte[] b=new byte[size];
		fis.read(b);
		  
		fos.write(b);	
		System.out.println("Image copied Successfully");
	  }
	  catch(IOException e)
	  {
		e.printStackTrace();  
	  }
  }
}