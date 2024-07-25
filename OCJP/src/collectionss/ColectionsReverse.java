package collectionss;
import java.util.*;
public class ColectionsReverse
{
  public static void main(String[] args) 
  {
    ArrayList l=new ArrayList();
    l.add(15);
    l.add(0);
    l.add(20);
    l.add(10);
    l.add(5);
    System.out.println("Before Reverse: "+l);
    Collections.reverse(l);
    System.out.println("After Reverse: "+l);
  }
}