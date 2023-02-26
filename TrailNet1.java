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
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailNet1
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
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("|Commands    | Function                                                   |");
				System.out.println("|-------------------------------------------------------------------------|");
				System.out.println("|            |                                                            |");
				System.out.println("|  -help     |  SHOW ALL THE AVAILABLE COMMANDS ON THIS TERMINAL          |");
				System.out.println("|  myip      |  GENERATE MY SYSTEM IP & COMUTER NAME                      |");
				System.out.println("|  webip     |  GENERATE HOSTNAME & IP OF URL                             |");
				System.out.println("|  webpgsrc  |  VIEW PAGE SOURCE                                          |");
				System.out.println("|  URLstats  |  DATE, CACHE, CONTENT TYPE, P3P, SERVER, X-FRAME-OPT       |");
				System.out.println("|  checkURL  |  CHECK URL AND RETURNS RESULT IN THE FORM OF CODES         |");
				
				System.out.println("|  sendmail  |  TO SEND A MAIL ONLY BY USING JAVA NETWORKING              |");
				System.out.println("|  filedown  |  TO DOWNLOAD A FILE FROM THE URL AND SAVE IT INTO SYSTEM   |");
				System.out.println("|  exit      |  TERMINATE CODE                                            |");
				System.out.println("|            |                                                            |");
				System.out.println("---------------------------------------------------------------------------");
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
					PlainTextEmailSender mailer = new PlainTextEmailSender();

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
					System.out.println("Enter the URL of file :");
					String url = sc.next();
					System.out.println("Enter the location where the file is to be saved on ur system (Dir name)");
					String a=sc.next();
					System.out.println("Enter the location where the file is to be saved on ur system (File name)");
					String b=sc.next();
					try {
						downloadUsingNIO(url,a);

						downloadUsingStream(url,b);
					} catch (IOException e) {
						e.printStackTrace();
					}
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

}