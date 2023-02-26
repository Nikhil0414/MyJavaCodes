package networking1;
// TCP client which receives a message from  server
 
import java.io.*;
import java.util.*;
import java.net.*;
 
    class IPgenerator2
    {
          String view_host;
          String accept;
          int choice;
        String ip = "148.197.67.";
     
        String ipmethd()
        {
     
     
        KeyboardInput in = new KeyboardInput();
     
        for(int i = 1; i < 10; i++) {
        System.out.print(i);
        System.out.print(". ");
        //System.out.print();
        System.out.println(ip + i);
        }
        System.out.println();
         
        //enter a different network id or hit enter to continue
        //to allow user to enter a different netwrok portion
        //hitting enter implies network is same
             
        //System.out.print("Enter your network part or press enter to proceed: ");
            //String network = in.readString();
            //test
            //.out.println(network);
             
            //if enter is pressed - same network
          //    if("".equals(network))
            //{
             
                System.out.print("SELECT A MACHINE TO VIEW FROM LIST: ");
                int choice = in.readInteger();
                 
            //  }
                //pass new network part to ip string variable
            //  ip = network;
                 
         
         
                //real switch
                switch (choice)
                {
         
                case 1:
                view_host = "148.197.67.211";
                //System.out.println("You selected to view machine with IP: " + view_host);
                //return view_host = "192.168.2.1";
                break;
     
                case 2:
                view_host = "148.197.67.212";
                //System.out.println("You selected to view machine with IP: " +  view_host);
                //return view_host = "192.168.2.2";
                break;
             
                case 3:
                view_host = "148.197.67.213";
                //System.out.println("You selected to view machine with IP: " +  view_host);
                //return view_host = "192.168.2.3";
                break;
             
                case 4:
                view_host = "148.197.67.214";

                //return view_host = "192.168.2.4";

                break;

                view_host = "148.197.67.215";

                break;

                case 6:

                view_host = "148.197.67.216";

                //System.out.println("You selected to view machine with IP: " +  view_host);

                //return view_host = "192.168.2.4";

                break;
         default:

                System.out.println("This machine doesnt exist, please choose a valid host");
            //return view_host;

                }

            return view_host;
    }

      }

    //client program starts here
 
    public class Client
    {
     
            public static void main(String args[])
            {
            //initialisation
            String view_host;
            IPgenerator2 ip = new IPgenerator2();
             

             //array enables me select the client to connect to
            // String remoteIPaddress[]={"192.168.2.4","192.168.2.5","192.168.2.6"};
            //call ip generator and assign it
             

              String remoteIPaddress =ip.ipmethd();

            int remotePort=9000;

               try

                {

                // connect to server with remoteIPaddress on remotePort

                //Socket socket1 = new Socket( remoteIPaddress, remotePort );

                //here I have selected to connect to just the first client - index 0

                Socket socket1 = new Socket( remoteIPaddress, remotePort );

                // open reader to receive messages from server

                BufferedReader inFromServer = new BufferedReader(new InputStreamReader( socket1.getInputStream()));

                System.out.println("Server contacted OK ");

                // loop reading messages from server

                while(true)            
                {
                
                String line = inFromServer.readLine();
                System.out.println("From server " + line);
                } 
               
            }

                catch(UnknownHostException e){
                System.err.println("Don't know about host ....");  
                }     
 

            //predefined message is returned if server cannot be contacted

            catch(ConnectException e){

            System.err.println("Unreachable node!, failure in connecting to server");

            }  

         

        catch (IOException e) {System.err.println("TCP client error " +  e); }

     

        //if server suddenly shutsdown for instance

     

         }

    }
