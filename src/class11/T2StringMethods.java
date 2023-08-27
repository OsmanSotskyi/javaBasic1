package class11;

public class T2StringMethods {
    // v dannoy zadache nuzhno vivesti centralnuyu bukvu v slove
    public static void main(String[] args) {

        String str="Sunday";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println();

        String day="Monday";
        String revers="";
        for (int j = day.length()-1; j >=0 ; j--) {
            revers=revers+day.charAt(j);

        }
        System.out.println(revers);








    }
}
