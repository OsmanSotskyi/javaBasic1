package class11;

public class E10StringMethods {
    // v dannoy zadache nuzhno vivesti centralnuyu bukvu v slove
    public static void main(String[] args) {

        String str="Hi#There#how#are#you";
        String[] strArr=str.split("[#]");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);






    }
}
