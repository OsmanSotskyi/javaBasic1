package HomeWorkGroupProj;

public class task3 {
    //Create a 2D array or integer type where you will store odd and even numbers.
    //Develop a program which will identify/print the even numbers only.
    public static void main(String[] args) {
      int [] [] num = {
              {12,32,33,67,84},
              {11,44,23,22,56},
              {4,8,7,5,99},
              {88,77,66,92,48}
                      };
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if (num [row] [col] % 2 == 0){
                    System.out.print(num[row] [col]+ " ");
                }

            }

        }

    }
}
