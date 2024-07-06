import java.io.Serializable;

class PersonalData implements Serializable{
    private String name,address;
    void setName(String name){
        this.name=name;
    }
    void setAddress(String address){
        this.address=address;
    }
    String getName(String name){
        return this.name;
    }
    String getAddress(String address){
        return this.address;
    }
}


public class JavaBean2 {
    public static void main(String[] args) {
        PersonalData obj = new PersonalData();
        obj.setName("Santosh Bhandari");
        obj.setAddress("Kanakai-03");
        System.out.println("Name : "+obj.getName(null)+"\nAddress : "+obj.getAddress(null));
    }
}
