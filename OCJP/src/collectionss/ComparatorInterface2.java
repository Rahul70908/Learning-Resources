package collectionss;
import java.util.*;
public class ComparatorInterface2 implements Comparator
{	
  @Override
  public int compare(Object obj1, Object obj2) 
  {
	Integer I1=(Integer)obj1;
	Integer I2=(Integer)obj2;
//	return I1.compareTo(I2);//[0,5,10,15,20]
//  return -I1.compareTo(I2);//[20,15,10,5,0]
//  return I2.compareTo(I1);//[20,15,10,5,0]
//	return -I2.compareTo(I1);//[0,5,10,15,20]
//  return +1; //[10,0,15,5,20,20]
//  return -1;//[20,20,5,15,0,10]
    return 0;//[]
  }
  public static void main(String[] args) 
  {
   TreeSet t=new TreeSet(new ComparatorInterface2());
   t.add(10);
   t.add(0);
   t.add(15);
   t.add(5);
   t.add(20);
   t.add(20);
   System.out.println(t);
  }
}