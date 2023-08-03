package class4;

import java.util.Scanner;

/*Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus,
otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
otherwise bonus=3000.
 */
public class hw5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many years have yo been with us?");
        double year=scanner.nextDouble();
        if (year>=5){
            System.out.println("You are eligible for the bonus");}
        else {
            System.out.println("You are NOT eligible for the bonus");}

        //Scanner scanner1=new Scanner(System.in);
        //System.out.println("Your bonus depends on your salary! What is your salary?");
        double salary=scanner.nextDouble();
        if (salary>50000){
            System.out.println("Yor bonus 5000!");}
        else {
            System.out.println("Your bonus 3000!");}





    }
}
