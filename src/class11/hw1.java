package class11;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dad's name");
        String dadname = scanner.nextLine();

        System.out.println("mom's name");
        String momname = scanner.nextLine();

        System.out.println("boy or girl");
        String gender = scanner.nextLine();

        int dadnamehalf = dadname.length() / 2;
        int momnamehalf = momname.length() / 2;


        if (gender.equals("boy")) {
            String name = dadname.substring(0, dadnamehalf) + momname.substring(momnamehalf);
            System.out.println(name);
        } else if (gender.equals("girl")) {
            String name = momname.substring(0, momnamehalf) + dadname.substring(dadnamehalf);
            System.out.println(name);
        }




    }
}
