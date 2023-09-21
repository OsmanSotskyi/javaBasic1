package class11;

public class E9StringMethods {
    // v dannoy zadache nuzhno vivesti centralnuyu bukvu v slove
    public static void main(String[] args) {

        String str="Hi There how are you.I am Good. How are you? I am Driving";
        String[] strs= str.split("[.\\s]");
        System.out.println(strs.length);
        System.out.println(strs[4]);





    }
}
