package class9;

public class hw3 {
    public static void main(String[] args) {
        int [][] num={
                {12,13,14},
                {21,22,23},
                {31,32,33}
                     };

        int sum=0;
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                sum=sum+num[row][col];
            }
        }
        System.out.println(sum);

    }
}
