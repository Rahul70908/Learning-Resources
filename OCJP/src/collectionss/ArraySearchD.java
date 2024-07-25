package collectionss;
import java.util.*;
import static java.util.Arrays.*; //Static import
public class ArraySearchD
{
  public static void main(String[] args) 
  {
   int[] a={10,5,20,11,6};
   Arrays.sort(a);
   System.out.println(binarySearch(a,6));
   System.out.println(Arrays.binarySearch(a,14));
   
   System.out.println();
   String[] s= {"A","Z","B"};
   Arrays.sort(s);
   System.out.println(Arrays.binarySearch(s,"Z"));
   System.out.println(Arrays.binarySearch(s,"S"));
   
   System.out.println();
   Arrays.sort(s,new mycomparator6());
   System.out.println(Arrays.binarySearch(s,"Z",new mycomparator6()));
   System.out.println(Arrays.binarySearch(s,"S",new mycomparator6()));
   System.out.println(binarySearch(s,"N"));
  }
}
class mycomparator6 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    String s1=(String)obj1;
    String s2=obj2.toString();
    return s2.compareTo(s1);
  }
}