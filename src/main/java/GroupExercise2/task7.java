package GroupExercise2;

import java.util.ArrayList;
import java.util.Iterator;

public class task7 {
    public static void main(String[] args) {
        ArrayList<String>words = new ArrayList<>();
        words.add("Morning");
        words.add("Afternoon");
        words.add("Evening");
        words.add("Night");
        words.add("April");
        words.add("Afghanistan");
        words.add("Table");

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (!word.startsWith("A")) {
                iterator.remove();
            } else {
                System.out.println(word.toLowerCase());
            }
        }
    }
}
