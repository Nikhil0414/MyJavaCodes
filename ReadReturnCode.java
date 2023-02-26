package networking1;
import java.io.IOException;
import java.util.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadReturnCode {
	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		String urltext = sc.next();
		URL url = new URL(urltext);
		int responseCode = ((HttpURLConnection) url.openConnection()).getResponseCode();
		System.out.println(responseCode);
	}
}


//200--Ok
//
//301 -- Permanent redirect to another webpage(http://mintox.com/contact)
//
//400 -- Bad request
//
//403 -- redirected twice hence server denied the permission for access.(https://pirple.com)
//
//404 -- Not found