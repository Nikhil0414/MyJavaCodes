import java.util.Scanner;

class Sales 

{
	   int row, col;
	   int sp;
	   int pp;
	   double amount;
	   double s[][];

	   
	   
	   public void Sales1()
	   {
	      try (Scanner sc = new Scanner(System.in)) {
			double sales[][] = new double[5][4];
			  
			  System.out.print ("Enter sales person no: ");
			  sp = sc.nextInt();
			  
			  while (sp != -1)
			  {
			    System.out.print("Enter product no: ");
			    pp = sc.nextInt();
			    System.out.print("Enter sales amt: ");
			    amount = sc.nextDouble();
				
				if (sp >= 1 && sp < 5 && pp >= 1 && pp < 6 && amount >= 0)
				sales[sp-1][pp-1] += amount;

			    if (pp > 5)  
				    System.out.print("Wrong input");
			
				
				System.out.print("Enter sales person no: ");
				sp = sc.nextInt(); 
					
			  } 
			  
			
			  double pTotal[] = new double[4];
			  
			
			  for ( col = 0; col < 4; col++)
			     pTotal[col] = 0;
				 
			  System.out.printf("Product", "Salesperson 1","Salesperson 2", "Salesperson 3", "Salesperson 4","Total");
			
			  for ( row = 0; row < 5; row++)
			  {
			     double prodTotal = 0.0;
				 System.out.printf("%7d", (row + 1));
				 
				 for (int col = 0; col < 4; col++)
				 {
				    System.out.printf("%14.2f", sales[row][col]);
					prodTotal += s[row][col];
					pTotal[col] += s[row][col];
				 } 
				 
				 System.out.printf("%14.2f\n", prodTotal);
				 
			  }
			  
			  System.out.printf("%7s", "Total");
			  
			  for (int col = 0; col < 4; col++)
			     System.out.printf("%14.2f", pTotal[col]);
		}
		  
		  
		  System.out.println();
		  
	   }
	   
	} 

class Salestest extends Sales
{
	public static void main(String[] args) {
		      Sales mySales = new Sales();
			  mySales.Sales1();
	}

}
