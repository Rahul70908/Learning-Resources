package regEx;
import java.util.StringTokenizer;
import java.util.regex.*;
public class Tokenizer 
{
  public static void main(String[] args) 
  {
   StringTokenizer st=new StringTokenizer("29-04-2000","-");	
   while (st.hasMoreTokens()) 
   {
	System.out.println(st.nextToken());
   }
  }
}