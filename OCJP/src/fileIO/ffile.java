package fileIO;
import java.io.*;
public class ffile 
{
  public static void main(String[] args) throws Exception
  {
    File f=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");	
    System.out.println(f.exists());
    f.createNewFile();
    System.out.println(f.exists());
	  
    File f1=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul");	
    System.out.println(f.exists());
    f1.mkdir();
    System.out.println(f.exists());
  }
}