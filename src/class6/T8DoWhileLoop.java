package class6;

public class T8DoWhileLoop {
    public static void main(String[] args) {

        for (int y = 99; y >= 1; y-=2) {
            System.out.print(y + " ");
        }
        System.out.println();

        int i = 100;
        if (1 <= i) {
            do {
                i--;

                System.out.print(i + " ");
                i--;                       //i+=2, i++;i++,i

            } while (1 <= i);
        }


    }
}


