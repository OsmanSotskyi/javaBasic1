package class4;

import java.util.Scanner;

/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the
money otherwise you would reject the client.
 */
public class hm1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of loan you needed?");
        double loan=scanner.nextDouble();
        if (loan<=200000) {
            System.out.println("we can give you money");
        }else {
            System.out.println("Your loan request has been rejected!");
        }


    }
}
