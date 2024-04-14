import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;

import javax.swing.*;
import java.awt.event.ActionEvent;

import java.net.Socket;

public class ChatServer extends javax.swing.JFrame{
static ServerSocket ss;
static Socket s;
static DataInputStream dis;
static DataOutputStream dout;

public ChatServer(){

    initComponents();
}

@SuppressWarnings("Unchecked")

private void msg_sendActionPerformed(java.awt.event.ActionEvent evt)
{
    try
    {
        String msg =" ";
        msg = msg_text.getText();
        dout.writeUTF(msg);
        msg_text.setText(" ");

    }catch(Exception e)
    {

    }

}

public static void main(String[] args)
{
    java.awt.Event.Queue.invokeLater(new Runnable())
    {
        public void run()
        {
            new ChatServer().setVisible(true);
        }

        try{

            String msgin= " ";
            ss= new ServerSocket(1201);
            s=ss.accept();
            dis = new DataInputStream(s.getInputStream());

            dout = new DataOutputStream(s.getOtputStream());
            while(!msgin.equals("exit"))
            {
                msgin=dis.readUTF();
                msg_area.setText(msg_area.GetText()+"\n Client: "+ msgin);
            }
        }catch(Exception e){
            
        }
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPanel;
    private static javax..swing.JTextArea msg_area;
    private javax.swing..JButton msg_send;

    private static javax.swing.JTextField msg_text;
}

}