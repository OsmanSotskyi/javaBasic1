package class24;

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {
        ArrayList<String>drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Kvas");
        drinks.add("Sherbet");
        drinks.add("Sprite");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }

        System.out.println(drinks);



    }
}
