package class12;
/*Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY*/

import java.util.Scanner;

public class example1 {
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
