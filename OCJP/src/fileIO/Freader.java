package fileIO;
import java.io.*;
public class Freader 
{
  public static void main(String[] args)throws Exception 
  {
   File f=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");  	
   FileReader fr=new FileReader(f);
   char[] ch=new char[(int)f.length()];
   fr.read(ch);
    for (char ch1 : ch) 
    {
	 System.out.print(ch1);
    }
    System.out.println();
    System.out.println("***********************");
    FileReader fr1=new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");
    int i=fr1.read();
     while(i!=-1)
     {
		System.out.print((char)i);
		i=fr1.read();
   	 }
  }
}