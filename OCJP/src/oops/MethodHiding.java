package oops;
class P
{
	public static void m1()
	{
		System.out.println("Parent m1");
	}
}
class C extends P
{
	public static void m1()
	{
		System.out.println("Chile m1");
	}
}
public class MethodHiding {
	public static void main(String[] args) {
	P obj=new C();
	obj.m1();
	}
}