package fileIO;
import java.io.*;
public class Extract 
{
  public static void main(String[] args)throws Exception 
  {
   PrintWriter pw=new PrintWriter("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\output.txt"); 
   BufferedReader br1=new BufferedReader(new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\input.txt"));
   String line=br1.readLine();		  
    while (line!=null)
    {
    boolean available=false;	 
    BufferedReader br2=new BufferedReader(new FileReader("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\delete.txt"));	
    String target=br2.readLine();
     while (target!=null) 
     {
	   if(line.equals(target))
	   {
		available=true;
		break;
	   }
		target=br2.readLine();	
     }
	   if(available==false)
	   {
		 pw.println(line);
	   }
		line=br1.readLine();
    }
    pw.flush();
  }
}