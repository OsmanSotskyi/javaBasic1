package class5;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Quiz score");
        int score= scanner.nextInt();

        if (score>=90) {
            System.out.println("grade=A");
        }else if (score>=70 && score<90) {
            System.out.println("grade=B");
        }else if (score>=50 && score<70) {
            System.out.println("grade=C");
        }else if (score<50) {
            System.out.println("grade=F");
        }
        System.out.println("Mid term score");
        int score1=scanner.nextInt();

        if (score1>=90) {
            System.out.println("grade=A");
        }else if (score1>=70 && score1<90) {
            System.out.println("grade=B");
        }else if (score1>=50 && score1<70) {
            System.out.println("grade=C");
        }else if (score1<50) {
            System.out.println("grade=F");
        }

        System.out.println("Final term score");
        int score2=scanner.nextInt();

        if (score2>=90) {
            System.out.println("grade=A");
        }else if (score2>=70 && score2<90) {
            System.out.println("grade=B");
        }else if (score2>=50 && score2<70) {
            System.out.println("grade=C");
        }else if (score2<50) {
            System.out.println("grade=F");
        }


    }
}
