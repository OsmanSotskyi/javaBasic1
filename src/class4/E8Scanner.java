package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=scanner.next();
        if (name.equals("Osman")){
            System.out.println("Senior SDET in 2 years");
        }else  if (name.equals("Ayesha")){
            System.out.println("I live in CANADA");
        }else if (name.equals("Tarakan")){
            System.out.println("Live In your house");
        }else if(name.equals("Giulia")){
            System.out.println("Dental Assistant");
        }else if(name.equals("Deepali")){
            System.out.println("i love java");
        }else if(name.equals("Laura")){
            System.out.println("Stop the dad jokes, please!");
        }
    }
}
