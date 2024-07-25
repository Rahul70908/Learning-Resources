package fileIO;
import java.io.File;
public class AnotherDir 
{
  public static void main(String[] args) throws Exception
  {
 	File f=new File("D:\\tyagi","rahul123.txt");
    f.createNewFile();
  }
}