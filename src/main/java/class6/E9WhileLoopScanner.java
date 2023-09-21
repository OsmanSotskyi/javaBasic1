package class6;

import java.util.Scanner;

public class E9WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter starting point");
        int start =scanner.nextInt();
        System.out.println("Please Enter the ending point");
        int end=scanner.nextInt();
        System.out.println("Please enter the steps as well");
        int step=scanner.nextInt();


        while (start<=end){
            System.out.print(start+" ");
            start+=step;


        }


    }
}
