import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class URLinfo {
	// Main driver method
	public static void main(String[] args) throws Exception
	{
		URL url = new URL(
			"https://vtop.vit.ac.in/vtop/initialProcess");

		System.out.println("URL is:" + url.toString());

		System.out.println("protocol is: "
						+ url.getProtocol());

		System.out.println("file name is: "
						+ url.getFile());

		System.out.println("host is: " + url.getHost());

		System.out.println("path is: " + url.getPath());

		System.out.println("port is: " + url.getPort());
		System.out.println("default port is: "
						+ url.getDefaultPort());
		
		try {
            String parseLine; /* variable definition *//* create objects */            URL URL = new URL("https://vtop.vit.ac.in/vtop/initialProcess"); 
            BufferedReader br = new BufferedReader(new InputStreamReader(URL.openStream()));

            while ((parseLine = br.readLine()) != null) {
                /* read each line */                System.out.println(parseLine);
            }
            br.close();

        } catch (MalformedURLException me) {
            System.out.println(me);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
	}
}
