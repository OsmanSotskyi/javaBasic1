package class24;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Integer num1 = new Integer(10); /// not good approach
        Integer num2 = new Integer(20); /// not good approach
        System.out.println(num1+num2);
        Integer num3 =45;  /// good approach to create Integer value
        Integer num4 = 50;
        System.out.println(num3+num4);
    }

}
