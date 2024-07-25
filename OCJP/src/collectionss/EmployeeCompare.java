package collectionss;
import java.util.*;
class employee implements Comparable
{
  String name;
  int eid;
  employee(String name,int eid)
  {
    this.name=name;
    this.eid=eid;
  }
  public String toString()
  {
    return name+"---"+eid;
  }
  public int compareTo(Object obj)
  {
    int eid1=this.eid;
    employee e=(employee)obj;
    int eid2=e.eid;
    if(eid1<eid2)
    return -1;
    if(eid1>eid2)
    return +1;
    else
    return 0;
  }
}
class mycomparator implements Comparator
{
  public int compare(Object obj1,Object obj2)
  {
	employee e1=(employee)obj1;  
	employee e2=(employee)obj2;
    String s1=e1.name;
    String s2=e2.name;
    return s1.compareTo(s2);
  }
}
public class EmployeeCompare 
{
  public static void main(String[] args) 
  {
   employee e1=new employee("nag",100);
   employee e2=new employee("balaich",200);
   employee e3=new employee("chiru",50);
   employee e4=new employee("venki",150);
   employee e5=new employee("nag",100);
   TreeSet t1=new TreeSet();
   t1.add(e1);
   t1.add(e2);
   t1.add(e3); 
   t1.add(e4);
   t1.add(e5);
   System.out.println(t1);
   System.out.println();
   
   TreeSet t2=new TreeSet(new mycomparator());
   t2.add(e1);
   t2.add(e2);
   t2.add(e3);
   t2.add(e4);
   t2.add(e5);
   System.out.println(t2);
  }
}