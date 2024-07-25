package fileIO;
import java.io.File;
public class Subdirectory 
{
  public static void main(String[] args) throws Exception 
  {
	 File f=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul");	
	 f.mkdir();
//   File f1=new File("F:\\eclipse\\workspace\\ocjp\\src\\fileIO\\rahul","rahul1.txt");
//         OR
     File f1=new File(f,"rahul123.txt");
     f1.createNewFile();
  }
}