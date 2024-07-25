package innerclass;
class Outer12
{
  static int x=10;
  static int y =20;
  static class Nested3
  {	
    public void m1()
    {
//      System.out.println(x);
      System.out.println(y);
    }
  }
}