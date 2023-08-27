package class5;

import java.util.Scanner;

/*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.*/
public class T1OrOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month");

        String month=scanner.nextLine();

        if (month.equalsIgnoreCase("march")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
            System.out.println("Spring");
        }else if (month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")){
            System.out.println("Summer");
        }else if (month.equalsIgnoreCase("September")||month.equalsIgnoreCase("November")||month.equalsIgnoreCase("October")){
            System.out.println("Autumn");
        }else {
            System.out.println("Winter");
        }

    }

}
