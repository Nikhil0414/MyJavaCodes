import java.net.*;  
public class IpUrl
{  
	public static void main(String[] args){  
		try{  
			InetAddress[]p=InetAddress.getAllByName("www.google.com");
			InetAddress[]p1=InetAddress.getAllByName("www.microsoft.com"); 
			int i; 
			for(i=0;i<p.length;i++)
			{ 
				System.out.print("1"+" "+p[i]);
			}
			for(i=0;i<p.length;i++)
			{
				System.out.print("\n1"+" "+p1[i]);
			}   
		}catch(Exception e){System.out.println(e);}  
	}  
}  