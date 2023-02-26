import java.net.*;
public class IpHost 
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress addr = InetAddress.getByName("142.250.206.100");
			System.out.println("Host name is: " + addr.getHostName());
			System.out.println("Ip address is: " + addr.getHostAddress());
		}
		catch (UnknownHostException e)
		{
			System.out.println(e);
		}
	}
}