import java.util.Scanner;

class Persondata {

	String name;
	int Age;
	int Adaar;

	public void getInput() {

		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter the name:: ");
			name = in.next();
			System.out.print("Enter the Age :: ");
			Age = in.nextInt();
			System.out.print("Enter the Adaar :: ");
			Adaar = in.nextInt();
		}
	}
	public void display() {

		System.out.println(" name = " + name);
		System.out.println(" age = " +Age);
		System.out.println("Adaar = " + Adaar);

	}
}

class Employees extends Persondata
	{
		public void myMethod1()
		{
			System.out.println("method1");
		}
	}

class Teacher extends Persondata
	{
		public void myMethod2()
		{
			System.out.println("method2");
		}
	}

	
	class Check1
	{
		public static void main(String arg[]) 
		{
			Persondata obja=new Persondata();
			obja.getInput();
			obja.display();
			Employees objb=new Employees();
			objb.myMethod1();
			Teacher objc= new Teacher();
			objc.myMethod2();
		}	
	}

