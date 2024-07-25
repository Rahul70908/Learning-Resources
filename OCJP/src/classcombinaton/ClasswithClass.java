package classcombinaton;
class Outer
{	
  class Inner 
  {
    public void m1() 
    {
    	System.out.println("Inside inner class");
    }
  }
  public static void main(String[] args) 
  {
//	Outer o=new Outer();
//	Outer.Inner i=o.new Inner();
//	i.m1();
	new Outer().new Inner().m1();  
  }
}