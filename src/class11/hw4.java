package class11;
//How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
public class hw4 {
    public static void main(String[] args) {

        String sent= "This is sentence i want to reverse";
        String [] words =sent.split(" ");

        String reverString="";

        for (String a:words){
            String rev="";
            for (int i=a.length()-1;i>=0;i--){
                rev=rev+a.charAt(i);
            }
            reverString=reverString+rev+" ";
        }
        System.out.println("Input: "+ sent);
        System.out.println("Output: "+ reverString);










    }
}
