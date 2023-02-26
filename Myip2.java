package networking1;
import java.net.*;
import java.util.Scanner;

import arithemetic.Addition;

public class Myip3
{
	public void show1() throws UnknownHostException
	{	
		InetAddress  ip = InetAddress.getLocalHost();
		String  hostname = ip.getHostName();
		System.out.println("IP address : " + ip);
		System.out.println("Computer Name : " + hostname);
		InetAddress address = InetAddress.getByName("localhost");
		System.out.println(address.toString());
	}

	public void show2() throws UnknownHostException
	{
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		System.out.println("Enter web site url");
		String s=sc.next();
		InetAddress ip=InetAddress.getByName(s);  
		System.out.println("Host Name: "+ip.getHostName());  
		System.out.println("IP Address: "+ip.getHostAddress());  
	}
	
	public class Myip2
	{
		public void main(String[] args) throws UnknownHostException 
		{
			Myip3 obj1=new Myip3();
			obj1.show1();
			Myip3 obj2=new Myip3();
			obj2.show2();
		}
	}

}
