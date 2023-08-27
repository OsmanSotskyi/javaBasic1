package class9;

public class E62DArrays {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
            System.out.println(numbers[0][row]); //first [] control rows, second []collums
        }
    }
    }

