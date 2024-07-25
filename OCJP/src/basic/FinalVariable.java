package basic;

class FinalVariable {
		 /*   final int x=10;
		    final int z;
//		    final int a;
		     test() {
			  z=30;	
			}
		    {
		    	final int y=20;
		    }
//		    public void m1() {
//				a=10;
//			}*/
//	 static final int b=50;
//	 static final int c;
//	 static final int d;
//	 static
//	 {
//		 c=60;
//	 }
//	 public void m1() {
//		d=10;
//	}
//	 public static void main(String[] args) {
//		System.out.println(b);
//	}
	public static void main(String[] args) {
	    m1(10, 30);
	}
    public static void m1(final int x,int y) {
   	 {
//   		 x=100;
   		 y=300;
   		 System.out.println(x+" "+y);
   	 }
	}	
}