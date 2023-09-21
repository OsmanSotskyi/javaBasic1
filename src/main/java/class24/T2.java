package class24;

import java.util.ArrayList;

public class T2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");

        for (String c:cars){
            System.out.println(c);
        }
        System.out.println("+++++++++++++++++++++");

        for (int i = 0; i <cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
