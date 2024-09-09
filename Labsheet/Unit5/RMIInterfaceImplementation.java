import java.rmi.*;
import java.rmi.server.*;

public class RMIInterfaceImplementation extends UnicastRemoteObject implements RMIInterface{
    RMIInterfaceImplementation() throws RemoteException{
        super();
    }
    public int AddNum(int x , int y){return x+y;}
}
