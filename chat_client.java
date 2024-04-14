import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class chat_client extends javax.swing.JFrame
{
stati Socket s;
static DataInputStream dis;
static DataOutputStream dout;

public chat_client(){
    initcomponents();

}

@SuppressedWarnings("unchecked")

private void msg_sendActionPerformed(java.awt.event.ActionEvent evt)
{
try{

    String msg="";
    msg= msg_text.getText();
    dout.writeUTF(msg);
    msg_text.setText("");

}catch(Exception e){

}

}

public static void main(String[] args)
{
java.awt.EventQueue.invokeLater(new Runnable())
{
public void run(){
    new chat_client().setVisible(true);
};
try{

    String msgin="";
    s= new Socket("127.0.0.1", 1201);

    dis = new DataInputStream(s.getInputStream());
    dout = new DataOutputStream(s.getOutputStream());

    while(!msgin.equals("exit")){
        msgin =dis.readUTF();


        msg_area.setText(msg_area.getText() + "\n Server: "+ msgin);
    }
}catch(Exception e){

}

}
private javax.swing.JLabel jlabe11;
private javax.swing.JScrollPane jscrollPanel2;
private static javax.swing.JTextArea msg_area;
private javax.swing.JButton msg_send;
private javax.swing.JTextField msg_text;

}
}