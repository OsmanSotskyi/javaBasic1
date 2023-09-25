package class26;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students =  new LinkedHashMap<>();
        students.put(1,"Adam");
        students.put(2,"Ehab");
        students.put(3,"Marta");
        students.put(4,"Ahmed");
        System.out.println(students);
        students.remove(300);
        System.out.println(students);
        students.replace(2,"Jamel");
        System.out.println(students);

    }
}
