package file;
class Shape
{
  void draw()
  {
   System.out.println("Shape draw()");
  }
  void erase()
  {
   System.out.println ("Shape erase()");
  }
}
class Circle extends Shape
{
  void draw()
  {
   System.out.println ("Circle draw()");
  }
  void erase()
  {
   System.out.println ("Circle erase()");
  }
}
class Triangle extends Shape
{
  void draw()
  {
   System.out.println("Triangle erase()");
  }
}
class Square extends Shape
{
  void draw()
  {
   System.out.println ("Square draw()");
  }
  void erase()
  {
   System.out.println ("Square erase()");
  }
}
class Shapes
{
  public static void main(String[] args)
  {
   Circle c=new Circle();
   c.draw();
   c.erase();
   Triangle t=new Triangle();
   t.draw();
   t.erase();
   Square s=new Square();
   s.draw();
   s.erase();
  }
}
