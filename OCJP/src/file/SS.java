package file;
class exec extends RuntimeException
{
   exec(String s){
     super(s);
   }
}

public class SS {

	public static void main(String[] args) {

		  String s = "i am rahul";

		  String[] sentence = s.split(" ");
		  int i = sentence.length;
		  for(int x = i-1; x >= 0;x--)
		    System.out.print(sentence[x]+ " ");

		 throw new exec("error");
	}
}