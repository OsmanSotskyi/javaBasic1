package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("James");
        names.add("Jasmine");
        names.add("Jane");
        names.add("James");

        System.out.println(names);
        LinkedHashSet<String> set  = new LinkedHashSet<>(names);
        names.clear();
        names.addAll(set);
        System.out.println(names);
    }
}
