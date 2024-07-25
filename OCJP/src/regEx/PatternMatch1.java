package regEx;
import java.util.regex.*;
public class PatternMatch1 
{
  public static void main(String[] args) 
  {
	int count=0;   
    Pattern p=Pattern.compile("ab");
    Matcher m=p.matcher("abbabba");
    while (m.find())
    {
     count++;	
	 System.out.println(m.start()+ "..." + m.end() +"..."+ m.group());
    }
    System.out.println("Total no. of occurences is "+count);
  }
}		