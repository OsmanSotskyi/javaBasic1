package class25;

import java.util.HashSet;

public class T5Students {
    String name;
    String ID;

    public T5Students(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public void printInfo(){
        System.out.println("Student name is: "+ name+" Student ID is: "+ID);

    }

    public static void main(String[] args) {
        HashSet<T5Students> stud = new HashSet<>();
        stud.add(new T5Students("Osman","XXX476547"));
        stud.add(new T5Students("Nazim","ZZZ038745"));
        stud.add(new T5Students("Kerim","KKK245345"));

        stud.forEach(x-> x.printInfo());



    }
}
