package class11;

public class T5StringMethods {
    // Create a String that should be combination of letters, numbers and special characters.
    // Find out how many Alphabets(abd AZ) characters are there in the String.
    public static void main(String[] args) {

        String str="Create a String that should 322be combination of letters @£$%£$%";
        String[] strs= str.split("[A-Z]");
        System.out.println(strs.length);






    }
}
