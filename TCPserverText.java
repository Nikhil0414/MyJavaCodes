package networking1;
//***************************
/*
*
*program description
*author etc
*
*/
//*******************************

// TCP server which sends a message to client - non threaded
import java.io.*;
import java.util.*;
import java.net.*;


public class TCPserverText
{
public static void main(String args[])
{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // port to receive TCP connections
        int receivePort=9000;             
         Socket socket=null;
            try
                {
                  System.out.println("TCP server starting...: IP address "
                       + InetAddress.getLocalHost().toString() + " port " + receivePort );
                       
                  ServerSocket serverSocket = new ServerSocket(receivePort);
                  
                  // Wait for client to connect.
                  socket = serverSocket.accept();                  
                  System.out.println("Client connection detected from IP address " + socket.getInetAddress()
                                  + " port " + socket.getPort());
                                  
                  // open writer to the client and  send  a message
                  PrintWriter pw = new PrintWriter(socket.getOutputStream());
                  pw.println("Hello " + socket.getInetAddress() + " on port " + socket.getPort());
                  //System.out.println("enter text to send to client");
                  // loop sending messages to client
                  while(true)                       
                    try
                      {
                       pw.flush();
                       String line = in.readLine();
                       pw.println(line);
                     }
                    catch (Exception se) {System.err.println("closing connection"); break;}
                  pw.close();
                  serverSocket.close();
                }
                
                
            catch (Exception se) {System.err.println( se); }
        }
}