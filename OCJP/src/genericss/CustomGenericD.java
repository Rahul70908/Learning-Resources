package genericss;
class gen<T>
{
  T ob;
  gen(T ob)
  {
    this.ob=ob;
  }
  public void show()
  {
    System.out.println("The type of ob is "+ob.getClass().getName());
  }
  public T getob()
  {
	return ob;  
  }
}
class test
{
   public static void main(String[] args)
   {
     gen<String> g1=new gen<String>("rahul");
     g1.show();
     System.out.println(g1.getob());
     
     gen<Integer> g2=new gen<Integer>(10);
     g2.show();
     System.out.println(g2.getob());
     
     gen<Double> g3=new gen<Double>(10.5);
     g3.show();
     System.out.println(g3.getob());
   }
}