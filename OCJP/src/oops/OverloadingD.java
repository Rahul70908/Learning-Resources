package oops;
class Animal
{

}
class Monkey extends Animal
{
 
}
public class OverloadingD
{
  public void m1(Animal a)
  {
    System.out.println("Animal");	
  }
  public void m1(Monkey m)
  {
    System.out.println("Monkey");	
  }	
  public static void main(String[] args) 
  {
	OverloadingD t=new OverloadingD();  
	Animal obj1=new Animal();
    t.m1(obj1);
    
    Monkey obj2=new Monkey();
    t.m1(obj2);
    
    Animal obj3=new Monkey();
    t.m1(obj3);
  }
}