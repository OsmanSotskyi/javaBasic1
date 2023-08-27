package Review2;

import java.util.Scanner;

public class hw1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input three distinct numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Find the largest number using nested if conditions
            double largestNumber;

            if (num1 > num2) {
                if (num1 > num3) {
                    largestNumber = num1;
                } else {
                    largestNumber = num3;
                }
            } else {
                if (num2 > num3) {
                    largestNumber = num2;
                } else {
                    largestNumber = num3;
                }
            }

            System.out.println("The largest number is: " + largestNumber);
        }
    }






