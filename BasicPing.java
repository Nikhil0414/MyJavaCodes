package networking1;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;

/*method to send ping messages and receive responses*/

public class BasicPing
{
	public static void main(String args[]) {
		try {
			/*Count number of tries*/
			int count = 0;
			/*Create the buffer for the outgoing packet*/
			ByteBuffer sbuff =
					ByteBuffer.wrap("PING".getBytes());
			/*Create the buffer for the incoming packet.
			 *As the incoming packet is expected to be
			 *an identical copy of the outgoing packet
			 *the same buffer size has been used.
			 */
			ByteBuffer rbuff =
					ByteBuffer.allocate("PING".getBytes().length);
			/*Connect the channel to the remote host
			 *using an InetSocketAddress
			 *using the default echo port 7
			 */
			InetSocketAddress addr =
					new InetSocketAddress("136.206.35.201", 7);
			/*Create and open a DatagramChannel*/
			DatagramChannel ch = DatagramChannel.open();
			/*Set the channel as non-blocking*/
			ch.configureBlocking(false);
			/*Connect the channel*/
			ch.connect(addr);
			String rtxt = "";
			do
			{
				/*Send the outgoing packet*/
				ch.send(sbuff, addr);
				/*Wait for the response*/
				Thread.sleep(200);
				/*Receive the echo packet if any*/
				ch.receive(rbuff);
				rtxt = new String(rbuff.array());
				/*increment count*/
				count++;
			}
			while (!rtxt.equals("PING") && count < 3);
			if (rtxt.equals("PING"))
				System.out.println("PING: Remote host is OK");
			else
				System.out.println("PING: Communication issue");
		}
		catch(Exception e)
		{
			/*Print the exception message.*/
			System.out.println(e.getMessage());
		}
	}
}