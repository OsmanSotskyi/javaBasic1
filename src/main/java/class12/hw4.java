package class12;

public class hw4 {
    String palindrome (String word) {
        String reverse = "";

        for (int i =word.length()-1; i>=0; i--) {
            reverse=reverse + word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)) {
            return "Palindrome word";
        }else {
            return "Not Palindrome word";
        }
    }
    public static void main(String[] args) {
        hw4 wordCheck = new hw4();
        System.out.println(wordCheck.palindrome("racecar"));
    }
}
