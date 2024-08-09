import java.rmi.registry.*;
public class RMIServer{
    public static void main(String args[]){
        try{
            RMIInterfaceImp obj = new RMIInterfaceImp();
            Registry rgsty = LocateRegistry.createRegistry(1888);
            rgsty.rebind("localhost", obj);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}