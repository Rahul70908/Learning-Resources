package regEx;
import java.io.*;
import java.util.regex.*;
public class MailidinFile
{
  public static void main(String[] args)throws Exception 
  {
   PrintWriter pw=new PrintWriter("F:\\eclipse\\workspace\\ocjp\\src\\regEx\\mailextract.txt");
   Pattern p=Pattern.compile("[a-zA-Z0-9][A-Za-z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
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