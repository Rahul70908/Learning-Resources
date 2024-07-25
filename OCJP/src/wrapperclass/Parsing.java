package wrapperclass;
public class Parsing 
{
 public static void main(String[] args) 
 {
    byte b= Byte.parseByte("10");
    short s=Short.parseShort("15");
    int i=Integer.parseInt("20");
    long l=Long.parseLong("200");
    double d=Double.parseDouble("20.5");
    boolean bb=Boolean.parseBoolean("true");
    float ff=Float.parseFloat("10.5d");
    System.out.println(ff);
    
//    int ii=Integer.parseInt("1111",2);
//    System.out.println(ii);
 } 
}