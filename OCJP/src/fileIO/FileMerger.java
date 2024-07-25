package fileIO;
import java.io.*;
public class FileMerger
{
  public static void main(String[] args)throws Exception 
  {
   PrintWriter pw =new PrintWriter("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\file3.txt");   
   BufferedReader br=new  BufferedReader(new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\file1.txt"));
   String line=br.readLine();
    while (line!=null) 
    {
	 pw.println(line);
	 line=br.readLine();
    }
   br=new BufferedReader(new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\file2.txt"));
   line=br.readLine();
    while (line!=null)
    {
	  pw.println(line);
	  line=br.readLine();
    }
    pw.flush();
    br.close();
    pw.close();
  }
}