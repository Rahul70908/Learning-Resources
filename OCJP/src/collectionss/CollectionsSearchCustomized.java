package collectionss;
import java.util.*;
class mycomparator4 implements Comparator
{ 
  public int compare(Object obj1,Object obj2)
  {
	Integer I1=(Integer)obj1;
	Integer I2=(Integer)obj2;
    return I2.compareTo(I1); 
  }
}
public class CollectionsSearchCustomized 
{
  public static void main(String[] args) 
  {
    ArrayList l=new ArrayList();
    l.add(15);
    l.add(0);
    l.add(20);
    l.add(10);
    l.add(5);
    System.out.println(l);
    Collections.sort(l,new mycomparator4());
    System.out.println(l);
    System.out.println(Collections.binarySearch(l,10,new mycomparator4()));
    System.out.println(Collections.binarySearch(l,13,new mycomparator4()));
    System.out.println(Collections.binarySearch(l,13));
    
  }
}