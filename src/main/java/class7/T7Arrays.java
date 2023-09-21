package class7;

public class T7Arrays {
    public static void main(String[] args) {
       /* int[]numbers={20,29,48,69,60};
        for (int i = 0; i < numbers.length; i+=2) {
            System.out.println(numbers[i]);

        }*/

        int[]numbers={20,29,48,69,60};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0)
            System.out.println(numbers[i]);

        }
    }
}
