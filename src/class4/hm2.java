package class4;
/*You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them,
otherwise you will offer them to get a learners permit.
 */
import java.util.Scanner;

public class hm2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        if (age>=18){
            System.out.println("You can pass your driving test!");
        }else {
            System.out.println("You have to get a learners permit");
        }


    }
}
