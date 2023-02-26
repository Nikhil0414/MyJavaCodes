import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ParseHTML {
 public static void main(String[] args) {
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
    }//class end
}