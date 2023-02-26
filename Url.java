import java.net.URL;

public class Url
{
	public static void main(String[] args)
			throws Exception
	{
		URL url = new URL("https://www.facebook.com/help/592679377575472/?helpref=hc_fnav");
		System.out.println("URL is:" + url.toString());
		System.out.println("protocol is: " + url.getProtocol());
		System.out.println("file name is: " + url.getFile());
		System.out.println("host is: " + url.getHost());
		System.out.println("path is: " + url.getPath());
		System.out.println("port is: " + url.getPort());
		System.out.println("default port is: " + url.getDefaultPort());
	}
}