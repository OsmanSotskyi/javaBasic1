package class7;

public class hw6 {
    public static void main(String[] args) {
        int[]num={2,3,4,67,655};
        int larg=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>larg){
                larg=num[i];
            }
        }
        System.out.println(larg);
    }
}
