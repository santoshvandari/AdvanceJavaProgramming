import java.net.*;
import java.io.*;
class MyClient{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",6666);
            System.out.println("Client is running...");
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}