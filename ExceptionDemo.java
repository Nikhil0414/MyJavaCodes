class ExceptionDemo
{ 
	public static void main(String ar[]) 
	{ 
		try {
				int x=10/0; 
				System.out.println("x="+x); 
			}
		catch(ArithmeticException xy)
			{
				System.out.println("My message"+xy.getMessage());
			}
		System.out.println("END"); 
	}
}
