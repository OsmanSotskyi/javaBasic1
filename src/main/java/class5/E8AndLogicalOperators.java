package class5;

public class E8AndLogicalOperators {
    public static void main(String[] args) {
        boolean goodCredit=true;
        boolean stableJob=false;
        boolean minimumAge=true;


        boolean result=goodCredit&&stableJob&&minimumAge;
        if (goodCredit&&stableJob&&minimumAge){
            System.out.println("you can have the loan");
        }else {
            System.out.println("you need to fulfill all the requirements");
        }

    }



}
