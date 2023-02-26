package networking1;
import java.io.BufferedInputStream;
import java.util.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class JavaDownloadFileFromURL1 {

    public static void main(String[] args) 
    {
    	System.out.println("Enter the URL of file :");
    	Scanner sc=new Scanner(System.in);
		String url = sc.next();
		System.out.println("Enter the location where the file is to be saved on ur system (Dir name)");
		String x=sc.next();
		System.out.println("Enter the location where the file is to be saved on ur system (File name)");
		String y=sc.next();
        try {
            downloadUsingNIO(url,x);
            
            downloadUsingStream(url,y);
        } catch (IOException e) {
            e.printStackTrace();
        }
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