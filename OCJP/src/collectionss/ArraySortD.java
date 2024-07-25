package collectionss;
import java.util.*;
public class ArraySortD
{
  public static void main(String[] args) 
  {
   int[] a={10,5,20,11,6};
   System.out.println("Primitive Array Before Sorting");
   for(int i:a)
   {
	System.out.print(i+" ");   
   }
   System.out.println();
   Arrays.sort(a);
   System.out.println("Primitive Array After Sorting");
   for(int i:a)
   {
	System.out.print(i+" ");   
   }
   System.out.println();
   String[] s= {"A","Z","B"};
   System.out.println("Object Array Before Sorting");
   for(String s1:s)
   {
	System.out.print(s1+" ");   
   }
   System.out.println();
   Arrays.sort(s);
   System.out.println("Object Array After Sorting");
   for(String s1:s)
   {
	System.out.print(s1+" ");   
   }
   System.out.println();
   Arrays.sort(s,new mycomparator5());
   System.out.println("Object Array After Customizrd Sorting");
   for(String s1:s)
   {
	System.out.print(s1+" ");   
   }
  }
}
class mycomparator5 implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
    String s1=(String)obj1;
    String s2=obj2.toString();
    return s2.compareTo(s1);
  }
}