package class5;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Where are you from?");
        String country = scanner.nextLine();
        System.out.println("Nice country! What language are you speak?");
        String language = scanner.nextLine();
        System.out.println("Rate your level of proficiency in this language on a scale A,B,C,D");
        String level = scanner.nextLine();

        if (level.equalsIgnoreCase("A")){
            System.out.println("A - Excellent");
        }else if (level.equalsIgnoreCase("B")){
            System.out.println("B - Good");
        }else if (level.equalsIgnoreCase("C")){
            System.out.println("C - Average");
        }else if (level.equalsIgnoreCase("D")){
            System.out.println("D - Bad");
        }else {
            System.out.println("You don't know this language");
        }
    }
}
