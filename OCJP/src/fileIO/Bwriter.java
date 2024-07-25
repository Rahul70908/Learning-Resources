package fileIO;
import java.io.*;
public class Bwriter 
{
  public static void main(String[] args)throws Exception 
  {
   FileWriter fw=new FileWriter("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul.txt");
   BufferedWriter bw=new BufferedWriter(fw);
   bw.write(100);
   bw.newLine();
   char[] ch= {'a','b','c'};
   bw.write(ch);
   bw.newLine();
   bw.write("durga");
   bw.newLine();
   bw.write("Software solutions");
   bw.flush();
   bw.close();
  }
}