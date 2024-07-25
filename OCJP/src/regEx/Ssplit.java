package regEx;
import java.util.regex.*;
public class Ssplit 
{
  public static void main(String[] args) 
  {
	Pattern p=Pattern.compile("[.]");
    String[] s=p.split("www.durgajobs.com");
	for (String s1 : s) 
	{
	  System.out.println(s1 );	
	}
  }
}