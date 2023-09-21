package class16;

public class hw {

    public static void main(String[] args) {
        // 2 4 6 8 10
        System.out.println(sumEvenToX(10));
    }
    static int sumEvenToX(int x){
        int sum=0;
        for (int i = 2; i <=x ; i=i+2) {
            sum=sum+i;
        }
        return sum;
    }

}
