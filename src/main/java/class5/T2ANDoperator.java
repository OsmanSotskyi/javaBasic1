package class5;

import java.util.Scanner;

public class T2ANDoperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your heights");
        double heights=scanner.nextDouble();


        if (heights<=60) {
            System.out.println("short");
        } else if (heights >= 60 && heights <= 72) {
            System.out.println("medium");
        } else {
            System.out.println("tall");
        }
    }

}
