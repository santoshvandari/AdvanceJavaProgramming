import java.net.*;
import java.io.*;



class MyServer{
    public static void main(String[] args){
        try{
            System.out.println("Server is running...");
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        String message = (String)din.readUTF();
        System.out.println("Message: "+message);
        }catch(Exception e){System.out.println(e);}
    }
}