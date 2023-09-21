package class10;

public class hw1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 2},
                {3, 1, 2},
                {3, 5, 3},
                {0, 1, 2}
        };

        int[] rowSums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            rowSums[i] = rowSum;
        }

        for (int i = 0; i < rowSums.length; i++) {
            System.out.println(rowSums[i]);
        }
    }
}