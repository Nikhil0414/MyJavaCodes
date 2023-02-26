import java.net.*;
import java.util.*;
public class Server {
 private int currentTot;
 ServerSocket serversocket;
 Socket client;
 int bytesRead;
 Connect c = new Connect();
 BufferedReader input;
 PrintWriter output;
 public void start() throws IOException{
 System.out.println("Connection Starting on port:" + c.getPort());
 
 serversocket = new ServerSocket(c.getPort());
 
 client = serversocket.accept();
 System.out.println("Waiting for connection from client");
 try {
 logInfo();
 } catch (Exception e) {
 
 e.printStackTrace();
 }
 }
 public void logInfo() throws Exception{
 
 input = new BufferedReader(new InputStreamReader(client.getInputStream()));
 String username = input.readLine();
 System.out.println("SERVER SIDE" + username);
 String password = input.readLine();
 System.out.println("SERVER SIDE" + password);
 output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));
 if(username.equals(c.getUsername()) &&password.equals(c.getPassword())){
 output.println("Welcome, " + username);
 }else{
 output.println("Login Failed");
 }
 }
 public static void main(String[] args){
 Server server = new Server();
 try {
 server.start();
 } catch (IOException e) {
 
 e.printStackTrace();
 }
 } 
}