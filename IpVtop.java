import java.net.*;
public class IpVtop
{ 
	public static void main(String args[])
			throws Exception
	{
		InetAddress[]p=InetAddress.getAllByName("vtop.vit.ac.in"); 
		int i;
		for(i=0;i<p.length;i++)
		{
			System.out.print("1"+" "+p[i]);
		}
	}
}