package networking2;

import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TrailNet2
{


	public void sendPlainTextEmail(String host, String port,
			final String userName, final String password, String toAddress,
			String subject, String message) throws AddressException,
	MessagingException {

		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// creates a new session with an authenticator
		Authenticator auth = new Authenticator() {
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, password);
			}
		};

		Session session = Session.getInstance(properties, auth);

		// creates a new e-mail message
		Message msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress(userName));
		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		// set plain text message
		msg.setText(message);

		// sends the e-mail
		Transport.send(msg);
	}

	private static void downloadUsingStream(String urlStr, String file) throws IOException{
		URL url = new URL(urlStr);
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
		FileOutputStream fis = new FileOutputStream(file);
		byte[] buffer = new byte[1024];
		int count=0;
		while((count = bis.read(buffer,0,1024)) != -1)
		{
			fis.write(buffer, 0, count);
		}
		fis.close();
		bis.close();
	}

	private static void downloadUsingNIO(String urlStr, String file) throws IOException {
		URL url = new URL(urlStr);
		ReadableByteChannel rbc = Channels.newChannel(url.openStream());
		FileOutputStream fos = new FileOutputStream(file);
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		fos.close();
		rbc.close();
	}

	public static String readURLContent(String urlString)throws IOException
	{
		URL url = new URL(urlString);
		Scanner sc = new Scanner(url.openStream());

		String content = new String();
		while (sc.hasNext())
			content += sc.next();
		sc.close();
		return content;
	}

	// Find title within the HTML content
	public static String findTitle(String str)
	{
		String tagOpen = "<title>";
		String tagClose = "</title>";

		int begin = str.indexOf(tagOpen) + tagOpen.length();
		int end = str.indexOf(tagClose);
		return str.substring(begin, end);
	}



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
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("|Commands    | Function                                                     |");
				System.out.println("|---------------------------------------------------------------------------|");
				System.out.println("|            |                                                              |");
				System.out.println("|  -help     |  SHOW ALL THE AVAILABLE COMMANDS ON THIS TERMINAL            |");
				System.out.println("|  myip      |  GENERATE MY SYSTEM IP & COMUTER NAME                        |");
				System.out.println("|  webip     |  GENERATE HOSTNAME & IP OF URL                               |");
				System.out.println("|  webpgsrc  |  VIEW PAGE SOURCE                                            |");
				System.out.println("|  URLstats  |  DATE, CACHE, CONTENT TYPE, P3P, SERVER, X-FRAME-OPT         |");
				System.out.println("|  checkURL  |  CHECK URL AND RETURNS RESULT IN THE FORM OF CODES           |");
				System.out.println("|  URLinfo   |  VAILDITY, PROTOCOL, HOST, PORT, PATH, FILE, QUERY, URLSTATS |");
				System.out.println("|  sendmail  |  TO SEND A MAIL ONLY BY USING JAVA NETWORKING                |");
				System.out.println("|  filedown  |  TO DOWNLOAD A FILE FROM THE URL AND SAVE IT INTO SYSTEM     |");
				System.out.println("|  pgtittle  |  TO VIEW THE TITTLE ON THE WEB PAGE                          |");
				System.out.println("|  Dreci     |  TO RECEIVE THE MESSAGE THROUGH NETWORKING (UDP) PORT        |");
				System.out.println("|  Dsend     |  TO SEND THE MESSAGE THROUGH NETWORKING (UDP) PORT           |");
				System.out.println("|  exit      |  TERMINATE CODE                                              |");
				System.out.println("|            |                                                              |");
				System.out.println("-----------------------------------------------------------------------------");
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
					String s1=sc.next();
					InetAddress ip=InetAddress.getByName(s1);  
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
						String url2 = sc.next(); 
						URL url = new URL(url2);
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
				String url3 = sc.next();
				URL url = new URL(url3);
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
						String url4=sc.next();
						url = new URL(url4);

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

			else if("sendmail".equals(x))
			{
				{
					String host = "smtp.gmail.com";
					String port = "smtp.gmail.com";

					System.out.println(" ");
					System.out.println("Enter the your usermail id :");
					String mailFrom = sc.next();
					System.out.println("Enter the password :");
					String password = sc.next();

					// outgoing message information
					System.out.println("Enter the mail id of reciever :");
					String mailTo = sc.next();
					System.out.println("Enter the Subject :");
					String subject = sc.nextLine();
					subject+=sc.nextLine();
					System.out.println("Enter the Message to be sent :");
					String message = sc.nextLine();
					message+=sc.nextLine();
					System.out.println("Press Enter again to confirm the message and wait for a few seconds.");
					System.out.println("Processing...");
					TrailNet2 mailer = new TrailNet2();

					try {
						mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
								subject, message);
						System.out.println("Done.");
						System.out.println("Email sent.");
					} catch (Exception ex) {
						System.out.println("Failed to sent email.");
						System.out.println(" ");
						System.out.println("If your mail is not sent properly please Go to this link below and disable the feature : ");
						System.out.println("https://myaccount.google.com/lesssecureapps?pli=1");
						System.out.println("If still failed to send the mail");
						System.out.println(" Turn off your network firewall ");
						System.out.println(" ");
						ex.printStackTrace();
					}
				}
			}

			else if("filedown".equals(x)) 
			{
				{
					
					System.out.println("Enter the URL of file  (Eg: https://www.w3.org/TR/PNG/iso_8859-1.txt ) :");
					String url = sc.next();
					System.out.println(" ");
					System.out.println("Enter the location where the file is to be saved on ur system :");
					System.out.println("Eg: C:\\Users\\NIKHIL\\Downloads/iso_8859-1.txt");
					String s2=sc.next();
					System.out.println(" ");
					System.out.println("Enter the location where the file is to be saved Again to confirm the location : ");
					System.out.println("Eg: C:\\Users\\NIKHIL\\Downloads/iso_8859-1.txt");
					String s3=sc.next();
					try {
						downloadUsingNIO(url,s2);

						downloadUsingStream(url,s3);
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("Processing... ");
					System.out.println(" File Saved ");
					
				}
			}

			else if("pgtittle".equals(x))
			{
				System.out.println("Please type in a URL:");
				String  url5 = sc.next();
				if (url5.length() == 0)
				{ System.out.println("Wrong Input");}

				String content = readURLContent(url5);
				String title = findTitle(content);
				System.out.println(title);
			}

			else if("Dreci".equals(x))
			{
				System.out.println("Always first run the Server/Receiver (i.e Dreci command) in a window --- and then run the Client/Sender (i.e Dsend command) another window \n");
				System.out.println("Enter a port number to establish connection : (i.e Any Random 4 digit Number Between 4000-9000) : \n");
				int i=sc.nextInt();
				System.out.println("Processing port configuration...");
				System.out.println("Wait for a few seconds...\n");
				System.out.println("Now open another window and run Dsend");
				System.out.println(" ");

				DatagramSocket ds = new DatagramSocket(i);  
				byte[] buf = new byte[1024];  
				
				DatagramPacket dp = new DatagramPacket(buf, 1024);  
				ds.receive(dp);  
				String str = new String(dp.getData(), 0, dp.getLength());
				System.out.println("... ");
				System.out.println("... ...  ");
				System.out.println("Configuration Successful \n");
				System.out.println("You are now CONNECTED \n");
				System.out.println("The message received form the sender is : \n");
				System.out.println(str);  
				ds.close();  
				System.out.println(" ");
				System.out.println("Hence Connection Established");
			}

			else if("Dsend".equals(x)) 
			{
				{
					System.out.println("Always run the Server/Receiver (i.e Dreci command) first in another window and then run the Client/Sender ");
					System.out.println("  ");
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