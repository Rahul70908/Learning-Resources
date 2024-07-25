package regEx;
import java.io.*;
import java.util.regex.*;
public class NumberinFile
{
  public static void main(String[] args)throws Exception 
  {
   PrintWriter pw=new PrintWriter("F:\\eclipse\\workspace\\ocjp\\src\\regEx\\extractt.txt");
   Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
   BufferedReader br=new BufferedReader(new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\regEx\\info.txt"));
   String line=br.readLine();
    while (line!=null) 
    {
    Matcher m=p.matcher(line);
      while(m.find())
      {
		pw.println(m.group());
      }
      line=br.readLine();
    }
    pw.flush();
    br.close();
    pw.close();
  }
}