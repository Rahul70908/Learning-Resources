package constructors;
class test4
{
  test4() 
  {
   this(10);
   System.out.println("no argument");
  }
  test4(int i)
  {
    this(10.5);
    System.out.println("int argument");
  }
  test4(double d)
  {
   System.out.println("double arg");
  }
  public static void main(String[] args) 
  {
	test4 t=new test4();
	
	test4 t2=new test4(10);
	test4 t4=new test4(10.5);
  }
}