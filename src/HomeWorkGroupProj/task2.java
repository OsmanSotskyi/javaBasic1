package HomeWorkGroupProj;

public class task2 {
    //Create an array of integer values.
    // After the array is created, calculate the sum of all stored elements in that array.
    public static void main(String[] args) {
      int [] num = {32,56,43,12,87,54};

      int sum=0;

        for (int i = 0; i < num.length; i++) {
            sum=num[i]+sum;
        }
        System.out.println(sum);

    }
}
