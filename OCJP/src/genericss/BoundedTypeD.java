package genericss;
import java.util.ArrayList;
//class Type<T extends Number & Runnable>
//{
//  public static void main(String[] args) 
//  {  
////    Type<Integer> t1=new Type<Integer>();
////    Type<Thread> t2=new Type<Thread>();
//  }
//}
public class BoundedTypeD
{
  public static void main(String[] args) 
  {
	ArrayList<? super String> l=new ArrayList<Object>();
  }
}