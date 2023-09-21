package class6;

import java.util.Scanner;

public class repl2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you need a loan? (true/false):");
        boolean needLoan = scanner.nextBoolean();

        String eligibility = "Unknown";

        if (needLoan) {
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();

            if (creditScore < 600) {
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700) {
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800) {
                eligibility = "Eligible";
            } else {
                eligibility = "Definitely eligible";
            }
        }

        System.out.println("Eligibility: " + eligibility);

        scanner.close();
    }
}

