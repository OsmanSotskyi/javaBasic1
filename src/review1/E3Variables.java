package review1;

import java.util.SortedMap;

public class E3Variables {
    public static void main(String[] args) {
        int age, price, noOfFans;

        age=15;
        price=1000;
        noOfFans=4;

        String op1= age+" ";
        String op2= op1+price;
        String op3=op2+noOfFans;
        System.out.println(op3);
        System.out.println(age+price+" "+noOfFans);
    }
}
