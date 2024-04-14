import java.io.IOException;
import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;
public class SocketServerExample{

public static void main(String[] args){
try{
ServerSocket serverSocket = new ServerSocket(1234);
Socket clientSocket = serverSocket.accept();

System.out.println("Client connected: "+ clientSocket.getInetAddress().getHostAddress());
serverSocket.close();

System.out.println("Server Socket closed!:");
}catch(IOException e){

e.printStackTrace();}
}
}
