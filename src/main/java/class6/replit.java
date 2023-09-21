package class6;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Do you need a loan?");
        boolean loan=scanner.nextBoolean();

        if (loan=true){
            System.out.println("What is your credit score?");
        }else if (loan=false) {
            System.out.println("Unknow");
        }

        int score=scanner.nextInt();

        if(score<600){
            System.out.println("Not eligible");
        }
        else if (score>=600 && score>=700){
            System.out.println("Maybe eligible");
        }
        else if (score>=701 && score>=800){
            System.out.println("Eligible");
        }else {
            System.out.println("Definitely eligible");
        }
    }
    }

