package javaLangg;
class Cloning implements Cloneable
{
  int i=10;
  int j=20;
  public static void main(String[] args)throws CloneNotSupportedException 
  {
	Cloning c1=new Cloning();	

	Cloning c2=(Cloning)c1.clone();
	c2.i=888;
	c2.j=999;
	System.out.println(c1.i+"..."+c1.j);
  }
}