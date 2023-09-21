package class10;

public class Student {
    String name;
    int age;
    String id;
    void study(){
        System.out.println("Studying 16 hours a day......");
    }
    public static void main(String[] args) {
        //we are creating an actual student by using the Student class
        Student ehabObj=new Student();
        ehabObj.name="Ehab";
        ehabObj.age=23;
        ehabObj.id="abc123";
        ehabObj.study();
    }
}
