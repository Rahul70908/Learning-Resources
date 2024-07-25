package regEx;
import java.util.regex.*;
public class StringSplit 
{
  public static void main(String[] args) 
  {
	String ss="Durga Software Solutions";
    String[] s=ss	.split("\\s");
	for (String s1 : s) 
	{
	  System.out.println(s1 );	
	}
  }
}