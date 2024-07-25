package fileIO;
import java.io.*;
public class Breader
{
  public static void main(String[] args)throws Exception 
  {
   FileReader fr=new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");	  
   BufferedReader br=new BufferedReader(fr);
   String line=br.readLine();
   while(line!=null)
   {
	System.out.println(line);
    line=br.readLine(); 
   }
   br.close();
  }
}