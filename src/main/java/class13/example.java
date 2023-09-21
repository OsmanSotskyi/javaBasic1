package class13;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for(int z=0; z<word.length(); z++){
            if (word.charAt(z)=='a' || word.charAt(z)=='A' || word.charAt(z)=='e' ||
                    word.charAt(z)=='E'|| word.charAt(z)=='i'|| word.charAt(z)=='I' ||
                    word.charAt(z)=='o' || word.charAt(z)=='O' || word.charAt(z)=='u'||
                    word.charAt(z)=='U') {
                System.out.print(word.charAt(z));
            }


        }

    }
}
