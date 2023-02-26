package networking1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class ReadWebPage {
  public static void main(String[] args) {
	  System.out.println("Enter the URL : ");
		Scanner sc=new Scanner(System.in);
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