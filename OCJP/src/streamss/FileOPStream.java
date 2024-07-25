package streamss;
import java.io.*;
public class FileOPStream 
{
  public static void main(String[] args) throws Exception 
  {
   FileOutputStream fos=new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");	
   String data="Ranu";
   byte[] b=data.getBytes();
   fos.write(b);
   fos.close();
  }
}