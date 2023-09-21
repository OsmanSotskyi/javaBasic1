package Review2;

public class E7NestedIf {
    public static void main(String[] args) {
        String day="Sunday";
        double accountBalance=5000;

        if (day.equals("Sunday")){
            if (accountBalance>2000){
                System.out.println("We can buy it");
            }else {
                System.out.println("Its too expensive");
            }



        } else if (day.equals("Saturday")) {{
            System.out.println("Its saturday lets go for dinner");}

        } else  {
            System.out.println("Lets wait for Sunday");
        }







    }
}
