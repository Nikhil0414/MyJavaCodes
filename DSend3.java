package networking2;
import java.net.*;  
import java.util.*;

public class DSend3
{  
	public static void main(String[] args) throws Exception 
	{  
		try (Scanner sc = new Scanner(System.in)) 
		{
			String x=sc.next();
			if("Dsend".equals(x))
			{
				System.out.println("Enter the SAME port number to establish connection :");
				int i=sc.nextInt();
				System.out.println("Enter the data to be send : ");
				String str = sc.nextLine(); 
				str+=sc.nextLine();
				DatagramSocket ds = new DatagramSocket();
				InetAddress ip = InetAddress.getByName("127.0.0.1");  

				DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, i);  
				ds.send(dp);  
				ds.close();

			}
			else
			{
				System.out.println("Wrong Input");
			}
		}
	}
}

