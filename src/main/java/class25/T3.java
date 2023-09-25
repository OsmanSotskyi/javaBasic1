package class25;

import java.util.TreeSet;

public class T3 {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Argentina");
        countries.add("Uzbekistan");
        countries.add("Ukraine");
        countries.add("Poland");
        countries.add("UK");
        countries.add("US");
        countries.add("Canada");
        countries.add("Germany");
        countries.add("France");
        countries.add("Nepal");

        for (String c:countries){
            System.out.print(c+" ");
        }
        System.out.println("************");
        countries.forEach(x-> System.out.println(x));
    }
}
