package oops;
public class Staticcontrol {
 static int x=10;
 static
 {
	 m1();
	 System.out.println("First static block");
 }
 public static void main(String[] args) {
	m1();
	System.out.println("Main method");
}
 public static void m1() {
	System.out.println(j);
}
 static 
 {
	 System.out.println("Second static block");
 }
 static int j=20;
}