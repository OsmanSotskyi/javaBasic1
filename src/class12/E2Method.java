package class12;

import java.util.Scanner;

public class E2Method {
    int add(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }


    int multiply(int num3) {
        int res = num3 * 10;
        return res;
    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
    }



}
