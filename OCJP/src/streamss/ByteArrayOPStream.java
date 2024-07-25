package streamss;
import java.io.*;
public class ByteArrayOPStream 
{
  public static void main(String[] args) 
  {
    try(FileOutputStream fos1 =new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");
   		FileOutputStream fos2 =new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO2.txt");
    	ByteArrayOutputStream boas=new ByteArrayOutputStream();	
       )
    {
      boas.write(65);
      boas.writeTo(fos1);
      boas.writeTo(fos2);
      System.out.println("Success..");
    }
    catch(IOException e)
    {
      e.printStackTrace();	
    }
  }
}