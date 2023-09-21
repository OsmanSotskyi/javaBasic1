package class8;

public class T1Arrays {
    public static void main(String[] args) {


    int[]num={1,54,32,75,89,44,22};
    int count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0){
                count++;
            }

        }
        System.out.println(count);



    }

}

