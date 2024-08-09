import java.rmi.registry.*;
public class RMIClient{
    public static void main(String args[]){
        try{
            RMIInterfaceImp obj = new RMIInterfaceImp();
            Registry rgsty = LocateRegistry.getRegistry(1888);
            rgsty.rebind("localhost", obj);
            System.out.println(obj.HelloWorld());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}