package networking1;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

 
public class ReadURLTitle
{
    // Read from a URL and return the content in a String
    public static String readURLContent(String urlString) 
                                    throws IOException
    {
        URL url = new URL(urlString);
        Scanner scan = new Scanner(url.openStream());
        
        String content = new String();
        while (scan.hasNext())
            content += scan.nextLine();
        scan.close();
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
     
    public static void main(String[] args) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in a URL:");
        String  urlString = scan.nextLine();
        if (urlString.length() == 0)
        { System.out.println("Wrong Input");}
            
        String content = readURLContent(urlString);
        String title = findTitle(content);
        System.out.println(title);
    }
}
