package class11;

public class hw5 {
    public static void main(String[] args) {
        String str ="Racecar";
        String reverse = "";

        for (int i =str.length()-1; i>=0; i--){
            reverse=reverse+str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome word");
        }else {
            System.out.println("Not Palindrome word");
        }

    }
}
