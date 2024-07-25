package oops;
class Shape 
{
  class circle
  {
   public void draw()
   {
	System.out.println("Inside circle draw()");	
   }
   public void erase()
   {
    System.out.println("Inside circle erase()");	
   }	
  }
  class triangle
  {
   public void draw()
   {
	System.out.println("Inside Triangle draw()");	
   }
   public void erase()
   {
    System.out.println("Inside Triangle erase()");	
   } 
  }
class square
{
  public void draw()
  {
   System.out.println("Inside Square draw()");	
  }
  public void erase()
  {
   System.out.println("Inside Square erase()");	
  }
}
  public static void main(String[] args) 
  {
    Shape s=new Shape();
    Shape.circle c=s.new circle();
    c.draw();
    c.erase();
    Shape.triangle t=s.new triangle();
    c.draw();
    c.erase();
    Shape.square sq=s.new square();
    c.draw();
    c.erase();
  }
}