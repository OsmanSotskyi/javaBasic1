package class11;

public class hw2 {
    public static void main(String[] args) {

        String str="TransilVAniya!@£$%^%^)(123";
        String strs=str.replaceAll("[^A-Za-z]","");
        System.out.println(strs.length());

    }
}
