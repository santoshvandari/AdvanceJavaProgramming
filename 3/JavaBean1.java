import java.io.Serializable;

class StudentInfo implements Serializable{
    private String name,address;
    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

}
class JavaBean1{
    public static void main(String[] args) {
        StudentInfo obj = new StudentInfo();
        obj.setName("Santosh Bhandari");
        obj.setAddress("Kanakai-07");
        System.out.println("Name : "+obj.getName()+"\nAddress : "+obj.getAddress());
    }
}