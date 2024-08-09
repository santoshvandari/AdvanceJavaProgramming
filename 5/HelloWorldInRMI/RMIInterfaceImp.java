import java.rmi.*;
import java.rmi.server.*;
public class RMIInterfaceImp extends UnicastRemoteObject implements RMIInterface{
    RMIInterfaceImp() throws RemoteException{
        super();
    }
    public String HelloWorld(){
        return "Hello World";
    }
}
