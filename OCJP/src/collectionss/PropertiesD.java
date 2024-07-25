package collectionss;
import java.util.*;
import java.io.*;
public class PropertiesD
{
 public static void main(String[] args)throws Exception 
 {
  Properties p=new Properties();
  FileInputStream fis=new FileInputStream("F:\\eclipse\\workspace\\ocjp\\src\\collectionss\\abc.properties");
  p.load(fis);
  System.out.println(p);

  String s=p.getProperty("venki");
  System.out.println(s);

  p.setProperty("nag","8888");
  FileOutputStream fos=new FileOutputStream("F:\\eclipse\\workspace\\ocjp\\src\\collectionss\\abc.properties");
  p.store(fos,"Updated by Rahul Kumar Gupta"); 
 }
}