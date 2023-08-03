package class4;

import java.util.Scanner;

/*Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card?
If balance of the card is larger than 1000, tell them to pay off immediately,
otherwise you can tell them that they can spend more.
 */
public class hm4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a bank card? Type 'Yes' or 'No' to continue:");
        String bc=scanner.next();
        if (bc.equals("Yes")){
        System.out.println("Enter the balance on your bank card");}
        else if (bc.equals("yes")){
            System.out.println("Enter the balance on your bank card:");}
        if (bc.equals("No")){
            System.out.println("We have a good offer for you!");}
        else if (bc.equals("no")){
            System.out.println("We have a good offer for you!");}

        double balance= scanner.nextDouble();
        if (balance>1000){
            System.out.println("Pay off immediately!");}
        else {
            System.out.println("You can spend more!");}

        Scanner scanner1=new Scanner(System.in);







    }
}
