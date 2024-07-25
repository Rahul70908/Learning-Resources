package interrface;
interface adapt
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();	
}
abstract class adapter implements adapt
{
  public void m1(){}
  public void m2(){}
  public void m3(){}
  public void m4(){}
  public void m5(){}
}
class exec extends adapter
{
  public void m1()
  {
	System.out.println("Hello");
  }
}
