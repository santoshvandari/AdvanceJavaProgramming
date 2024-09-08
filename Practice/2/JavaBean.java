import java.io.Serializable;
class Student implements Serializable{
    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}

public class JavaBean {
    public static void main(String[] args) {
        Student std=new Student();
        std.setId(10);
        std.setName("Santosh bhandari");
        System.out.println("ID : "+std.getId()+"\nName : "+std.getName());
    }
}
