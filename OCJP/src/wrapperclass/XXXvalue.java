package wrapperclass;
public class XXXvalue 
{
public static void main(String[] args) 
  {
	Integer i=130;
	System.out.println(i.byteValue());
	System.out.println(i.shortValue());
	System.out.println(i.intValue());
	System.out.println(i.longValue());
	System.out.println(i.floatValue());
	System.out.println(i.doubleValue());
    
	Character ch='a';
	System.out.println(ch.charValue());
    
//	Boolean b1=new Boolean("aa");
	Boolean b=Boolean.parseBoolean("yes");
	System.out.println(b.booleanValue());
  }
}