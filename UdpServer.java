import java.io.*;
import java.net.*;
public class UdpServer{
public static void main(String[] args)
{
try{
DatagramSocket ds= new DatagramSocket(6789);
byte[]buffer=new byte[1000];
DatagramPacket dp1=new DatagramPacket(buffer,buffer.length);
ds.receive(dp1);
DatagramPacket dp=new DatagramPacket(dp1.getData(), dp1.getLength(), dp1.getAddress(), dp1.getPort());
ds.send(dp);


}catch(SocketException e){
System.out.println(e.getMessage());
}catch(IOException e){

System.out.println(e.getMessage());
}

}
}
