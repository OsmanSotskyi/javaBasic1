package class14;

public class T4 {
    public static void main(String[] args) {
        System.out.println(getVowels("iurghpwierubvlisyagoiqyerhfquibfhdsbv"));
    }
    static private String getVowels (String str) {
        return str=str.replaceAll("[^aeiouAEIOU]","");
     }
}
