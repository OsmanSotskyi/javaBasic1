package HomeWorkGroupProj;

public class task4 {
    //Create a 2D array of integers.
    // Develop a program which will calculate the sum of even and odd numbers for that array.
    public static void main(String[] args) {
      int [] [] num = {
              {12,32,33,67,84},
              {11,44,23,22,56},
              {4,8,7,5,99},
              {88,77,66,92,48}
                      };
      int sumEven=0;
      int sumOdd=0;

        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if (num [row] [col] % 2 == 0){
                    sumEven=sumEven+num[row][col];
                }else {
                    sumOdd=sumOdd+num[row][col];
                }

            }

        }
        System.out.println("sum of Even numbers is "+sumEven);
        System.out.println("sum of Odd numbers is "+sumOdd);

    }
}
