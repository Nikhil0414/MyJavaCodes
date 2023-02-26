class ExceptionDemo2
{ 
	public static void main(String ar[]) 
	{ 
		int no[]= {22,85,83,91,38,68,33,75};
		try {
			System.out.println(no[50]);
				int x=10/0; 
				System.out.println("x="+x); 
			}
		catch(ArithmeticException xy)
			{
				System.out.println("My message"+xy.getMessage());
			}
		catch(ArrayIndexOutOfBoundsException yz)
		{
		System.out.println("Index out of bound"); 
		}
	}
}