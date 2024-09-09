import java.rmi.registry.*;
public class RMIClient{
    public static void main(String[] args){
        try{
                RMIInterfaceImplementation obj = new RMIInterfaceImplementation();
                Registry rgsty = LocateRegistry.getRegistry(1888);
                rgsty.rebind("localhost", obj);
                System.out.println("Sum = " + obj.AddNum(10,20));
            }catch(Exception ex){
                System.out.println(ex);
        }
    }
}