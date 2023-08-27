package class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the country");
        String country=scanner.nextLine();


        switch (country){
            case "UK":
                System.out.println("English");
                break;
            case "Germany":
                System.out.println("German");
                break;
            case "Italy":
                System.out.println("Italian");
                break;
            case "Ukraine":
                System.out.println("Ukrainian");
                break;
            default:
                System.out.println("I don't know this language");
        }
    }

}
