package networking2;
import java.net.*;
import java.util.Scanner;

public class DReci3
{  
	public static void main(String[] args) throws Exception 
	{ 
		try (Scanner sc = new Scanner(System.in)) {
			String x=sc.next();
			if("Dreci".equals(x))
			{	
				System.out.println("Enter a port number to establish connection : (i.e Any Random 4 digit Number Between 4000-9000) ");
				int i=sc.nextInt();
				System.out.println("Processing port configuration...");
				System.out.println("Wait for a few seconds...");
				DatagramSocket ds = new DatagramSocket(i);  

				byte[] buf = new byte[1024];  
				DatagramPacket dp = new DatagramPacket(buf, 1024);  
				ds.receive(dp);  
				String str = new String(dp.getData(), 0, dp.getLength());  
				System.out.println(str);  
				ds.close();  
				System.out.println("The message received is above ");
				System.out.println("Hence Connected");
			}
			else 
			{
				System.out.println("Wrong Input");
			}
		}
	}
}