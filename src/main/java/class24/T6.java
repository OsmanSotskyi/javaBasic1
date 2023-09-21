package class24;

import java.util.ArrayList;

public class T6 {
    public static void main(String[] args) {
        ArrayList<String>fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Plum");
        fruit.add("Grape");
        fruit.add("Banana");




        fruit.forEach(x-> System.out.print(" "+x));
        System.out.println();
        fruit.removeIf(x->x.endsWith("e")||x.contains("a"));
        fruit.forEach(x-> System.out.print(" "+x));
    }
}
