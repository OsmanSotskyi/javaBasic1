package review3;

import java.util.Scanner;

public class T3forLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value from the user
        System.out.print("Enter the value (x): ");
        int x = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Print the series of numbers
        for (int i = 0; i < x; i++) {
            if (i < x - 1) {
                System.out.print(i + " ");
            } else {
                // Print the last number without a space
                System.out.print(i);
            }
        }
    }
    }
