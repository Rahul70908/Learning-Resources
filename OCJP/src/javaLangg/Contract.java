package javaLangg;
class Person 
{
  int age;
  String name;
  public Person(int age,String name) 
  {
    this.age=age;
    this.name=name;
  }
  public boolean equals(Object obj) 
  {
    if (obj instanceof Person) 
	{
	  Person c=(Person)obj;
	  if(name.equals(c.name) && age==c.age)
	  {
	    return true;
	  }
	  else
	  {
		return false;
	  }
	}  	
	  return false;
  }
  public int hashCode() 
  {
	return name.hashCode()+age;
  }
}
class Contract
{
	 public static void main(String[] args) 
	  {
	   Person c1=new Person(11,"rahul");
	   Person c2=new Person(11,"rahul");
	   System.out.println(c1.equals(c2));
	   System.out.println(c1.hashCode());
	   System.out.println(c2.hashCode());
	  }
}