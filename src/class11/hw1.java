package class11;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter mom's name");

        String momname=scanner.nextLine();

        System.out.println("Enter dad's name");

        String dadname=scanner.nextLine();

        System.out.println("Girl or Boy?");
        String kidname=scanner.nextLine();

        String newbabyname="";

        if (kidname.equalsIgnoreCase("boy")){
            newbabyname=dadname.substring(0,dadname.length()/2)+momname.substring(momname.length()/2);

        } else if (kidname.equalsIgnoreCase("girl")) {
            newbabyname=momname.substring(0,momname.length()/2)+dadname.substring(dadname.length()/2);

        }
        System.out.println(newbabyname);



    }
}
