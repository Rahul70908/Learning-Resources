package oops;
class test1 
{
 {
  System.out.println("first instance block");
 }
 static
 {
  System.out.println("first static block");
 }
 public test1() 
 {
  System.out.println("constructor");
 }
 public static void main(String[] args) 
 {
  test1 t=new test1();
  System.out.println("Main");
  test1 t1=new test1();
 }
 static
 {
  System.out.println("Second static block");
 }
 {
  System.out.println("Second instance block");
 }
}
