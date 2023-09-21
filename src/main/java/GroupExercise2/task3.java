package GroupExercise2;

public class task3 {
    public static void main(String[] args) {
        String word = "Madam";
        String reverse = "";

        for (int i = word.length()-1; i>=0 ; i--) {
            reverse= reverse+word.charAt(i);
        }
        if (word.equalsIgnoreCase(reverse)){
            System.out.println(word+" is Palindrome word: "+ reverse);
        }else {
            System.out.println("Not Palindrome word");
        }
    }
}
