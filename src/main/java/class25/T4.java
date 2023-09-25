package class25;

import java.util.LinkedHashSet;

public class T4 {
    public static void main(String[] args) {
        LinkedHashSet<String> city = new LinkedHashSet<>();
        city.add("Andizhan");
        city.add("Manchester");
        city.add("Kyiv");
        city.add("Warsaw");
        city.add("London");

        for (String c:city){
            System.out.print(c+" ");
        }
        city.removeIf(x->x.startsWith("A"));
        System.out.println(city);
    }
}
