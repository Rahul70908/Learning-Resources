package collectionss;
import java.util.*;
class temp1
{
  int i;
  temp1(int i)
  {
	this.i=i;
  }
  @Override
  public int hashCode()
  {
  return i;
  }
  @Override
  public String toString()
  {
   return i+"";
  }
}
public class HashTableD 
{
  public static void main(String[] args) 
  {
   	Hashtable h=new Hashtable();
   	h.put(new temp1(5),"A");
   	h.put(new temp1(2),"B");
   	h.put(new temp1(6),"C");
   	h.put(new temp1(15),"D");
   	h.put(new temp1(23),"E");
   	h.put(new temp1(16),"F");
// 	h.put("durga",null); // NPE
    System.out.println(h);
  }
}