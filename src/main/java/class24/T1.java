package class24;

import java.util.ArrayList;

public class T1 {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("Asghar");
        names.add("Asker");
        names.add("Madagascar");
        names.add("Ivan");
        names.add("Bolvan");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Sara"));
        System.out.println(names.size());

    }
}
