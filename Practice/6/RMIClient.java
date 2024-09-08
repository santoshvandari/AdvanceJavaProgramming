import java.rmi.registry.*;

public class RMIClient {
    public static void main(String[] args) {
        try {
            RMIImplement obj = new RMIImplement();
            Registry redg = LocateRegistry.getRegistry(8888);
            redg.rebind("localhost",obj);
            System.out.println("Sum = "+obj.Sum(10,20));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
