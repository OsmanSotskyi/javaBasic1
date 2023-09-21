package review3;

import java.util.Scanner;

public class E5Switch {
    public static void main(String[] args) {

        for (int i=0; i<3;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the name of the Fruit");
            String fruit=scanner.nextLine();

            switch (fruit){
                case "Orange":
                    System.out.println("It is usually Orange");
                    break;
                case "banana":
                    System.out.println("Yellow Bananas are good");
                    break;
                case "Strawberry":
                    System.out.println("I like Red Strawberries");
                    break;
                case "blue berry":
                    System.out.println("blue berry are very heart");
                    break;
                default:
                    System.out.println("I don't like this fruit");
            }
        }

    }
}
