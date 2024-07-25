package fileIO;
import java.io.*;
public class FWriter
{
  public static void main(String[] args)throws Exception 
  {
   FileWriter fw=new FileWriter("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt",true);
   fw.write(100);
   fw.write("Hello \n what's up!");
   fw.write('\n');
   char[] ch1= {'a','b','c'};
   fw.write(ch1);
   fw.write('\n');
   fw.flush();
   fw.close();
  }
}