package networking2;

import java.net.*;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;

public class TrailNet0
{
	public static void main(String[] args) throws UnknownHostException,Exception,IOException
	{
		String x;
		System.out.println("( --Type -help to see the valid set of commands-- )");
		do {
			System.out.println("Enter the  command : ");
			Scanner sc=new Scanner(System.in);
			x=sc.next();
			System.out.println("");
			if("-help".equals(x))
			{
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("|Commands    | Function                                                    |");
				System.out.println("|--------------------------------------------------------------------------|");
				System.out.println("|            |                                                             |");
				System.out.println("|  -help     |  SHOW ALL THE AVAILABLE COMMANDS ON THIS TERMINAL           |");
				System.out.println("|  myip      |  GENERATE MY SYSTEM IP & COMUTER NAME                       |");
				System.out.println("|  webip     |  GENERATE HOSTNAME & IP OF URL                              |");
				System.out.println("|  webpgsrc  |  VIEW PAGE SOURCE                                           |");
				System.out.println("|  URLstats  |  DATE, CACHE, CONTENT TYPE, P3P, SERVER, X-FRAME-OPT        |");
				System.out.println("|  checkURL  |  CHECK URL AND RETURNS RESULT IN THE FORM OF CODES          |");
				System.out.println("|  URLinfo   | VAILDITY, PROTOCOL, HOST, PORT, PATH, FILE, QUERY, URLSTATS |");
				System.out.println("|  sendmail  |  TO SEND A MAIL ONLY BY USING JAVA NETWORKING               |");
				System.out.println("|  filedown  |  TO DOWNLOAD A FILE FROM THE URL AND SAVE IT INTO SYSTEM    |");
				System.out.println("|  exit      |  TERMINATE CODE                                             |");
				System.out.println("|            |                                                             |");
				System.out.println("----------------------------------------------------------------------------");
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
				try{  
					System.out.println("Enter the URL : ");
					String url1=sc.next();

					URL url = new URL(url1);
					URLConnection urlcon=url.openConnection();  
					InputStream stream=urlcon.getInputStream();  
					int i;  
					while((i=stream.read())!=-1){  
						System.out.print((char)i);  
					}  
				}catch(Exception e)
				{System.out.println(e);}  
			}

			else if("URLstats".equals(x))
			{
				{    
					try{    
						System.out.println ("Enter a URL");
						String input = sc.next(); 
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
			
			else if("URLinfo".equals(x))
			{
				boolean urlValid = false;
				URL url = null;
				while(!urlValid) {

					try {
						System.out.println("Enter the URL : ");
						String url1=sc.next();
						url = new URL(url1);
						
						urlValid = true;
						System.out.println("The url was valid");
					} catch (MalformedURLException e) {
						System.out.println("The url was invalid, please try again");
					}
				}

				//continue processing
				System.out.println("The url entered was: "+url.toString());

				System.out.println("Protocol: "+url.getProtocol());    
				System.out.println("Host Name: "+url.getHost());    
				System.out.println("Port Number: "+url.getPort());    
				System.out.println("Default Port Number: "+url.getDefaultPort());    
				System.out.println("Query String: "+url.getQuery());    
				System.out.println("Path: "+url.getPath());    
				System.out.println("File: "+url.getFile()); 

				HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
				for(int i=1;i<=8;i++){  
					System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
				}  
				huc.disconnect();
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