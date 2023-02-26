public class Mythread {

	public static void main(String[] args) {
		Runnable r = new Runnable1();
		Thread t = new Thread(r);
		t.start();
		Runnable r2 = new Runnable2();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}

class Runnable2 implements Runnable{
	public void run()
	{
		int num = 10, sum = 0;
		for(int i = 1; i <= num; ++i)
		{
			sum += i;
		}
		System.out.println("\n Sum = " + sum);
	}
}

class Runnable1 implements Runnable{
	public void run()
	{
		int num = 10;
		long factorial = 1;
		for(int i = 1; i <= num; ++i)
		{
			factorial *= i;
		}
		System.out.printf("\n Factorial of %d = %d ", num, factorial);
	}
}