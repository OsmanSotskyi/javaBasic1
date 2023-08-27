package review3;

import java.util.Scanner;

public class T1LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it night");
        boolean time = scanner.nextBoolean();
        System.out.println("are you slippy");
        boolean mine = scanner.nextBoolean();

        if (time && mine) {
            System.out.println("Go to sleep");
        } else {
            System.out.println("good time to learning");
        }
    }
}
