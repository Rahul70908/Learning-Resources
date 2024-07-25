package oops;

class test {
int i=10;
{
m1();
System.out.println("First instance block");
}
test()
{
	System.out.println("Constructor");
}
public static void main(String[] args) {
	test t=new test();
	System.out.println("main");
	test t1=new test();
}
public void m1() {
	System.out.println(j);
}
{
 System.out.println("Second instance block");	
}
int j=20;
}