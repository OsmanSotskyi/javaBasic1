package class11;

public class E7StringMethods {
    //zamena kakogo to slova v predlojenii
    public static void main(String[] args) {

        String str="asdfgh QWER 123456 ()!@#$%^";
        System.out.println(str.replaceAll("[A-Z]", "="));  //removes uppercase letters
        System.out.println(str.replaceAll("[0-9]", ""));  //removes numbers 0-9
        System.out.println(str.replaceAll(" ", "")); //removes spaces from code
        System.out.println(str.replaceAll("[&-;]", ""));  //removes lines from askii tables
        System.out.println(str.replaceAll("[A-Z0-5a-j]", "")); //can remove uppercase A-Z,0-5,a-j
        System.out.println(str.replaceAll("[ks2s]", "")); //removes specific characters also

    }
}
