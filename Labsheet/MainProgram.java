import java.io.Serializable;

class StudentInformation implements Serializable{
    private int id;
    private String name,address,phone,course;
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }
    void setAddress(String address){
        this.address=address;
    }
    void setPhone(String phone){
        this.phone=phone;
    }
    void setCourse(String course){
        this.course=course;
    }
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    String getAddress(){
        return this.address;
    }
    String getPhone(){
        return this.phone;
    }
    String getCourse(){
        return this.course;
    }
}
class MainProgram{
    public static void main(String[] args) {
        StudentInformation std=new StudentInformation();
        std.setId(1);
        std.setName("Santosh Bhandari");
        std.setAddress("Kanakai-07");
        std.setPhone("9800000000");
        std.setCourse("BCA");
        System.out.println("Student Details:\nID : "+std.getId()+"\nName : "+std.getName()+"\nAddress : \n"+std.getAddress()+"\nPhone : "+std.getPhone()+"\nCourse : "+std.getCourse());
    }  
}
