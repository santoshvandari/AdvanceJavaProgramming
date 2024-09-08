import java.rmi.registry.*;

class RMIServer{
    public static void main(String[] args) {
        try {
            RMIImplement obj = new RMIImplement();
            Registry redg = LocateRegistry.createRegistry(8888);
            redg.rebind("localhot",obj);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}