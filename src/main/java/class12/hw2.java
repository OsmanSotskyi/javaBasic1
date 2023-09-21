package class12;


public class hw2 {
    int number(int num){
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime number");
        }else {
            System.out.println("Not Prime number");
        }
         return num;
    }

    public static void main(String[] args) {
        hw2 nums = new hw2();

        System.out.println(nums.number(3));
    }
}
