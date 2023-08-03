package class4;
/*Create a Java program and call it a Donor.
In order to be eligible to donate your blood
you have to be 18 years old. Also once you identify age eligibility
then we have to see if person matches weight requirements.
If person weight it more than 110 lbs → then he/she is eligible,
otherwise we cannot accept such a patient.
 */
public class T3 {
    public static void main(String[] args) {
        double age = 18;
        double weight = 100;

        if (age >= 18) {
            System.out.println("you are eligibility");

        } else {
            System.out.println("Not eligibility");
        }
        if (weight>=100){
            System.out.println("You can be a donor");

    }else {
            System.out.println("You can't be a donor");

    }
    }
}
