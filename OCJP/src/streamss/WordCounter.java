package streamss;
import java.io.*;
public class WordCounter 
{
  public static void main(String[] args) throws Exception 
  {
   FileInputStream fis=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\streamss\\fileIO.txt");	
   int size=fis.available();
   byte[] b=new byte[size];
   fis.read(b);
   String data=new String(b);
   System.out.println(data);
   System.out.println();
   String[] str=data.split(" ");
   int len=str.length;
   System.out.println("No.of words: "+len);
   int count=0;
   for(int i=0;i<len;i++)
   {
	 String val=str[i];
	 if(val.equals("Ranu"))
	 {
	   count++;	 
	 }
   }
   System.out.println("Ranu is repeated: "+count+" times");
   fis.close();
  }
}