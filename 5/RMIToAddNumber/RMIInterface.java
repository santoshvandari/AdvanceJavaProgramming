import java.rmi.*;

public interface RMIInterface extends Remote{
    public int AddNum(int x, int y) throws RemoteException;
}