package javaLangg;
import java.util.ArrayList;
class Student
{
  String name;
  int roll;
  public Student(String name,int roll) 
  {
    this.name=name;
	this.roll=roll;
  }
  @Override
  public String toString() 
  {
	return "This student with Name:"+name+" and RollNo:"+roll;
  }
  public static void main(String[] args) throws Exception
  {
	Student s1=new Student("rahul",101);
	Student s2=new Student("sarfu",102);
    System.out.println(s1);
    System.out.println(s1.toString());
    System.out.println(s2);
  }
}