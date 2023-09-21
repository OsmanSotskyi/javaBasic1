package class9;

public class hw1 {
    public static void main(String[] args) {
        String [][] countries={
                {"Canada","USA","Mexico","Panama"},
                {"Brazil","Argentina","Chili","Uruguay"},
                {"Ukraine","Poland","UK","Germany"},
                {"Uzbekistan","Kazakhstan","Pakistan","India"},
                {"Egypt","Tunisia","Morocco","Algeria"}
                              };
        for (String[] row:countries){
            for(String col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println("======================================");

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[0].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }

    }
}
