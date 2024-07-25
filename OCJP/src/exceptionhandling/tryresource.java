package exceptionhandling;
import java.io.*;
public class tryresource
{
  public static void main(String[] args) 
  {
	try(BufferedReader br=new BufferedReader(new FileReader("input.txt")))
    {
//	 br=new BufferedReader(new FileReader("output.txt"));
	}
	catch (IOException e) 
	{
	 // TODO: handle exception
	}
  }
}