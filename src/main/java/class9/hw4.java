package class9;

public class hw4 {
    public static void main(String[] args) {
        int [][] num={
                {12,13,14,15},
                {21,22,23,24},
                {31,32,33,34}
                     };
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if (num[row][col]%2==0){
                    System.out.print(num[row][col]+" ");
                }

            }
            System.out.println();
        }


    }
}
