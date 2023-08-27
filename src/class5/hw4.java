package class5;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=scanner.nextDouble();
        System.out.println("Enter arithmetic operator (+ , - , * , /)");
        char ar=scanner.next().charAt(0);
        System.out.print("Enter the second number:");
        double num2 = scanner.nextDouble();

        if (ar=='+'){
            System.out.println(num1+num2);
        }else if (ar=='-'){
            System.out.println(num1-num2);
        }else if (ar=='*') {
            System.out.println(num1*num2);
        }else if (ar=='/'){
            System.out.println(num1/num2);
        }else {
            System.out.println("wrong data");
        }
        System.out.println("Switch");

        switch (ar) {
            case '+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Wrong data");

        }
    }
}
