package class5;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your current time");
        double hour = scanner.nextDouble();

        if (hour >= 0 && hour <= 11) {
            System.out.println("Morning time");
        } else if (hour>=12 && hour<=15){
            System.out.println("Afternoon time");
        }else if (hour>=16 && hour<=20) {
            System.out.println("Evening time");
        }else if (hour>=21 && hour<=24) {
            System.out.println("Night time");
        }else {
            System.out.println("Wrong time");
        }
    }
}