package class4;
/*Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print
         “The temperature is the city  is ”
 */
import java.util.Scanner;

public class hm3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Where are you from?");
        String city=scanner.next();
        System.out.println("Your city is "+city);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("What is the temperature in your City?");
        double temp=scanner1.nextDouble();
        System.out.println("In your City "+temp+" degrees Celsius is "+((temp*1.8)+32)+" degrees Fahrenheit");






    }
}
