package class11;

public class E1StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is great.";
        System.out.println(str.charAt(0));
        int length=str.length();

        System.out.println(str.charAt(str.length()-1));// vnizu kod kotoriy pokazivaet kak rabotaet etot kod
        System.out.println("**********************");
        int lastIndex=str.length()-1;
        //System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);

    }
}
