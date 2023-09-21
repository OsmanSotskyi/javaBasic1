package class9;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {
        int [] [] numbers={
                {10,20,30,40},
                {100,200,300},
                {100,200,300,400}
        };

        int[]row=numbers[0]; //this returns us a complete 1d array
        int number=numbers[0] [1]; //this return us one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1])); //complete second row
    }
    }
