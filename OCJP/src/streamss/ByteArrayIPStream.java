package streamss;
import java.io.*;
public class ByteArrayIPStream 
{
  public static void main(String[] args) 
  {
	byte[] b= {37,48,21,30};  
	int k=0;
    try(ByteArrayInputStream bais=new ByteArrayInputStream(b);)
    {
       while((k=bais.read())!=-1)
       {
        char ch=(char)k;
        System.out.println("ASCII value of character is: "+k+"Special character is: "+ch); 
       }
    }
    catch(IOException e)
    {
      e.printStackTrace();	
    }
  }
}