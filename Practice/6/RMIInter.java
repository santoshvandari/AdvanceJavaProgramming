import java.rmi.*;

public interface RMIInter extends Remote {
    public int Sum(int x, int y) throws RemoteException;    
}