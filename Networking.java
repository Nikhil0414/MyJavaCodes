package networking2;
import java.net.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Networking
{
	public static void main(String[] args) throws UnknownHostException,Exception,IOException
	{
		String x;
		do {
			System.out.println("Enter the  command : ");
			Scanner sc=new Scanner(System.in);
			x=sc.next();
			System.out.println("");
			if("-help".equals(x))
			{
				System.out.println("---------------------------------------------------------------------");
				System.out.println("|Commands    | Function                                              |");
				System.out.println("|--------------------------------------------------------------------|");
				System.out.println("|            |                                                       |");
				System.out.println("|  -help     |  SHOW ALL THE AVAILABLE COMMANDS ON THIS TERMINAL     |");
				System.out.println("|  myip      |  GENERATE MY SYSTEM IP & COMUTER NAME                 |");
				System.out.println("|  webip     |  GENERATE HOSTNAME & IP OF URL                        |");
				System.out.println("|  webpgsrc  |  VIEW PAGE SOURCE                                     |");
				System.out.println("|  URLstats  |  DATE, CACHE, CONTENT TYPE, P3P, SERVER, X-FRAME-OPT  |");
				System.out.println("|  checkURL  |  CHECK URL AND RETURNS RESULT IN THE FORM OF CODES    |");
				System.out.println("|  exit      |  TERMINATE CODE                                       |");
				System.out.println("|            |                                                       |");
				System.out.println("----------------------------------------------------------------------");
			}

			else if("myip".equals(x))
			{		

				InetAddress  ip = InetAddress.getLocalHost();
				String  hostname = ip.getHostName();
				System.out.println("IP address    : " + ip);
				System.out.println("Computer Name : " + hostname);
				InetAddress address = InetAddress.getByName("localhost");
				System.out.println(address.toString());


			}
			else if("webip".equals(x))
			{
				{
					System.out.println("Enter web site url");
					String s=sc.next();
					InetAddress ip=InetAddress.getByName(s);  
					System.out.println("Host Name: "+ip.getHostName());  
					System.out.println("IP Address: "+ip.getHostAddress());  
				}
			}

			else if("webpgsrc".equals(x))
			{
				{
					System.out.println("Enter the URL : ");
					String urlText=sc.nextLine();
					BufferedReader in = null;
					try {
						URL url = new URL(urlText);
						in = new BufferedReader(new InputStreamReader(url.openStream()));

						String inputLine;
						while ((inputLine = in.readLine()) != null) {
							System.out.println(inputLine);
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if (in != null) {
							try {
								in.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}

			}

			else if("URLstats".equals(x))
			{
				{    
					try{    
						System.out.println ("Enter a URL");
						String input = sc.nextLine(); 
						URL url = new URL(input);
						HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
						for(int i=1;i<=8;i++){  
							System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
						}  
						huc.disconnect();   
					}catch(Exception e){System.out.println(e);}    
				}    
			}

			else if("checkURL".equals(x))
			{
				System.out.println("Results and what does the result indicates -->");
				System.out.println("200--The URL is correct");
				System.out.println("301 -- Permanent redirect to another webpage"); 
				System.out.println("400 -- Bad request, 404 -- Not found");
				System.out.println("403 -- redirected twice hence server denied the permission for access");
				System.out.println("");
				System.out.println("Enter the Url to be checked :");
				String urltext = sc.next();
				URL url = new URL(urltext);
				int responseCode = ((HttpURLConnection) url.openConnection()).getResponseCode();
				System.out.println(responseCode);
			}
			
			else 
			{
				System.out.println(" Wrong Input ");
				System.out.println(" TRY AGAIN WITH VALID COMMAND (ENTER -help COMMAND TO VIEW THE VALID COMMANDS ) ");
			}
			System.out.println(" ");
		}
		while(!x.equals("exit"));
		{
			System.out.println(" CODE TERMINATED ");
			System.out.println(" ");
		}
	}
}