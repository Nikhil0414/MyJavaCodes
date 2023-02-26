import java.time.*;
import java.util.*;

public class Age {  
   public static void main(String[] args)
    {
	   try (Scanner sc = new Scanner(System.in)) {
		String x=sc.nextLine();
			LocalDate pdate=LocalDate.parse(x);   
		    LocalDate now = LocalDate.now();
		    Period diff = Period.between(pdate, now);
		 System.out.printf("\n %d years, %d months and %d days \n\n",diff.getYears(), diff.getMonths(), diff.getDays());
	}
   }
}