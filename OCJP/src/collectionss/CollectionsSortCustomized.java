package collectionss;
import java.util.*;
class mycomparator2 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    String s1=obj1.toString();
    String s2=obj2.toString();
    return s2.compareTo(s1);
  }
}
public class CollectionsSortCustomized 
{ 
  public static void main(String[] args) 
  {
    ArrayList l=new ArrayList();
    l.add("Z");
    l.add("A");
    l.add("K");
    l.add("L");
    System.out.println("Before Sorting: "+l);
    Collections.sort(l,new mycomparator2());
    System.out.println("After Sorting: "+l);
  }
}