package HomeWorkGroupProj;

public class task1 {
    //1. Create a program that uses an array to store a list of temperatures for a week,
    // and then uses a loop to find the highest and lowest temperature for the week.
    public static void main(String[] args) {
        int[]temp={19,17,18,20,16};

        int high=temp[0];
        int low=temp[0];

        for (int i = 0; i < temp.length; i++) {

            if (temp[i]>high){
                high=temp[i];
            }
            if (temp[i]<low){
                low=temp[i];
            }

        } System.out.println(high);
        System.out.println(low);


    }
}
