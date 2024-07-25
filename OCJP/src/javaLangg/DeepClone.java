package javaLangg;
class cat1
{
  int j;
  cat1(int j) 
  {
  this.j=j;
  }
} 
class dog1 implements Cloneable
{
  int i;
  cat1 c;
  dog1(int i,cat1 c) 
  {
	this.i=i;
	this.c=c;
  }
  @Override
  public Object clone() throws CloneNotSupportedException 
   {
	 cat1 c1=new cat1(c.j);
     dog1 d=new dog1(i,c1);		 ;  
	 return d;
   }
}
public class DeepClone
{
  public static void main(String[] args)throws CloneNotSupportedException
  {
	cat1 c=new cat1(20);  
	dog1 d1=new dog1(10,c);
	System.out.println(d1.i+"..."+d1.c.j);
	dog1 d2=(dog1)d1.clone();
	d2.i=888;
	d2.c.j=999;
	System.out.println(d1.i+"..."+d1.c.j);
  }
}