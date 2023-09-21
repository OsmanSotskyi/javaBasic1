package class5;

import java.util.Scanner;

public class T4LogicalOperator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        int num= scanner.nextInt();

        if (num>=0 && num<=10) {
            System.out.println("Small number");
        }else if (num>=11 && num<=100) {
            System.out.println("Medium number");
        }else {
            System.out.println("large number");
        }




    }
}
