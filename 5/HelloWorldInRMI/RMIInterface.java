import java.rmi.*;
public interface RMIInterface extends Remote{
    public String HelloWorld() throws RemoteException;
}
