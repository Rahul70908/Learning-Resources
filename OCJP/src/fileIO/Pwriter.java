package fileIO;
import java.io.*;
public class Pwriter
{
  public static void main(String[] args)throws Exception
  {
   FileWriter fw=new FileWriter("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");
   PrintWriter pw=new PrintWriter(fw);
   pw.write(100);
   pw.println(100);
   pw.println(true);
   pw.println('c');
   pw.println("durga");
   pw.flush();
   pw.close();
  }
}