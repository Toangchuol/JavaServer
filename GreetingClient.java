import java.net.*;
import java.io.*;

public class GreetingClient{
public static void main(String[] args)
{

String ServerName = args[0];
int port = Integer.parseInt(args[1]);
try{
System.out.println("Connecting to" + ServerName + "on port"+ port);
Socket client = new Socket(ServerName, port);

System.out.println("Just connected to"+ client.getRemoteSocketAddress());
OutputStream outToServer= client.getOutputStream();
DataOutputStream out = new DataOutputStream(outToServer);

out.writeUTF("Hello From"+ client.getLocalSocketAddress());
InputStream inFromServer = client.getInputStream();
DataInputStream in = new DataInputStream(inFromServer);

System.out.println("Server says"+ in.readUTF());

client.close();
}catch(IOException e)
{
e.printStackTrace();

}

}

}