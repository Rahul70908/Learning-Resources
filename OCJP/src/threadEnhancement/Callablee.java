package threadEnhancement;

import java.util.concurrent.*;

@SuppressWarnings("rawtypes")
class thread4 implements Callable {
	int num;

	thread4(int num) {
		this.num = num;
	}

	@Override
	public Object call() throws Exception {
		System.out.println(Thread.currentThread().getName() + " is finding the sum of first " + num + " numbers");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}

public class Callablee {
	public static void main(String[] args) throws Exception {
		thread4[] jobs = { new thread4(10), new thread4(20), new thread4(30), new thread4(40), new thread4(50),
				new thread4(60) };
		ExecutorService s = Executors.newFixedThreadPool(4);
		for (thread4 t : jobs) {
			Future f = s.submit(t);
			System.out.println(f.get());
		}
		s.shutdown();
	}
}