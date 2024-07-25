package javaLangg;
class student
{
   String name;
   int roll;
   student(String name,int roll)
   {
    this.name=name;
	this.roll=roll;
   }
   @Override
   public boolean equals(Object obj) 
   {
	if (obj==this) 
	   return true;
	if(obj instanceof student) 
	{
	  student s=(student)obj;
	 if(name.equals(s.name)&& roll==s.roll)
	  return true;
	 else 
	  return false;
   }
   return false;
   }
	public static void main(String[] args) 
	{
	  student s1=new student("rahul",101);
	  student s2=new student("sarfu",102);
	  student s3=new student("rahul",101); 
	  student s4=s1;
	  System.out.println(s1.equals(s2));
	  System.out.println(s1.equals(s3));
	  System.out.println(s1.equals(s4));

	  System.out.println(s1.equals("durga"));
	  System.out.println(s1.equals(null));
	}
}