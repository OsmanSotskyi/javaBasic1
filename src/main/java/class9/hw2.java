package class9;

public class hw2 {
    public static void main(String[] args) {
        String[][]names={
                {"Cucumber","Paper","Potato","Onion"},
                {"Banana","Apple","Orange","Pear"},
                {"Milk","Kefir","Cheese","Sour cream"},
                {"Chocolate","biscuits","Ice cream","Cake"}
                         };
        for (String[]row:names){
            for (int i = 0; i < row.length; i++) {
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------");

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[0].length; j++) {
                System.out.print(names[i][j]+" ");

            }
            System.out.println();

        }

    }
}
