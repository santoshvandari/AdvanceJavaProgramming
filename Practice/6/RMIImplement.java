import java.rmi.*;
import java.rmi.server.*;

public class RMIImplement extends UnicastRemoteObject implements RMIInter{
    RMIImplement() throws RemoteException{
        super();
    }
    public int Sum(int x , int y){
        return (x+y);
    }
}