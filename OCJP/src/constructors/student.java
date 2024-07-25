package constructors;
class student 
{
  String name;
  int roll;
  student(String name,int roll)
  {
   this.name=name;
   this.roll=roll;
  }
  public static void main(String[] args) 
  {
   student s=new student("rahul",2);
   student s1=new student("ravi",3);
  }
}