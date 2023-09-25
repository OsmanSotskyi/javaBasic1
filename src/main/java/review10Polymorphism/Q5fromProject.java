package review10Polymorphism;

import java.util.Arrays;

public class Q5fromProject {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        char [] c1= s1.toLowerCase().toCharArray();
        char [] c2= s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean isAnaGram = Arrays.equals(c1,c2);
        System.out.println(isAnaGram);

    }
}
