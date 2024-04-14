import java.net.*;
import java.io.*;
public class UdpClient{
public static void main(String[] args)
{
try{
DatagramSocket ds=new DatagramSocket();
byte[] m=args[0].getBytes();
InetAddress addr=InetAddress.getByName(args[1]);
DatagramPacket dp=new DatagramPacket(m,args[0].length(), addr,6789);
ds.send(dp);

byte[]buffer=new byte[100];
DatagramPacket dp1=new DatagramPacket(buffer, buffer.length);
ds.receive(dp1);

System.out.println("Reply:"+ new String(dp1.getData()));
}catch(SocketException e)
{
System.out.println(e.getMessage());
}
catch(IOException e){
System.out.println(e.getMessage());
}

}
}
