import java.io.IOException;
import java.net.Socket;

public class socketProgram{
public static void main(String[] args)
{
try{  
Socket socket = new Socket("127.0.0.1", 1234);
System.out.print("Connected to server:"+ socket.getInetAddress().getHostAddress());
socket.close();

System.out.println("Client closed");
}catch(IOException e){
e.printStackTrace();
}
}

}
