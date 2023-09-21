package class14;

public class T3 {
    public static void main(String[] args) {
        System.out.println(reversed("osman"));
    }
    static String reversed (String inputStr) {
        String reversed= "";
        for (int i = inputStr.length()-1; i>=0; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }
}
