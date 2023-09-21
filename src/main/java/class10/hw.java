package class10;

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Elements in reverse order:");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}