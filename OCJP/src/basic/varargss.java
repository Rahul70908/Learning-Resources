package basic;

public class varargss {
	public static void m1(double y, int ... x) {
		for (int x1 : x) {
			System.out.println(x1);
		}
		System.out.println(y);
	}

//	public static void m1(int[] x, double y) {
//		for (int x1 : x) {
//			System.out.println(x1);
//		}
//		System.out.println(y);
//	}

	public static void main(String[] args) {
//	int[] a= {10,20,30};
		int[] b = { 40, 50, 60 };
		
		 int x;
//		 System.out.println(x);
//		m1(10, 20, 30);

//		m1(b, 1.0);
		m1(1.0, b);
	}
}