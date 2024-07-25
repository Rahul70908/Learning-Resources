package streamss;
import java.io.*;
public class FileIPStream 
{
  public static void main(String[] args) throws Exception 
  {
   FileInputStream fis=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");	
   int size=fis.available();
   byte[] b=new byte[size];
   fis.read(b);
   String data=new String(b);
   System.out.println(data);
   fis.close();
  }
}