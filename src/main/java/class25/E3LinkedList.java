package class25;

import java.util.LinkedList;

public class E3LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);
        numbers.remove(2);
        System.out.println(numbers);
        numbers.removeIf(x->x>15);
        System.out.println(numbers);

    }
}
