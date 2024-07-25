package stringg;
public class CreditCard
{
	public static String mask(String Card)
	{
		String x="XXXX-XXXX-XXXX-";
	    return x+Card.substring(15,19);
	}
	public static void main(String[] args) 
	{
	   System.out.println(mask("1234-5678-9101-1234"));	
	}
}
