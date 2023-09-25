package class25;

import java.util.LinkedList;

public class E5ArrayLvsLinkedL {
    public static void main(String[] args) {
        long startingTime=System.currentTimeMillis();
        LinkedList<Integer> numbers=new LinkedList<>();//244 ms
        //ArrayList<Integer> numbers=new ArrayList<>();//81101 ms
        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(numbers.get(100000));
        }
        long endTime = System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
    }
}
