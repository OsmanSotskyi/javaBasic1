package class8;

public class E8BreakKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("outer loop");
            for (int j = 0; j < 4; j++) {
                if (j==2){
                    break;
                }
                System.out.println("inner loop");
            }

        }

    }
}