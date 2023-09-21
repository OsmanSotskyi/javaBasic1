package Review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age to calculate your discount");
        int age= scanner.nextInt();


        if (age>60) {
            System.out.println("You get discount 20%");
        } else if (age>50) {
            System.out.println("You get discount 15%");}
        else if (age>40){
            System.out.println("You get discount 10%");}
        else {
            System.out.println("No discount for you");}





    }
}
