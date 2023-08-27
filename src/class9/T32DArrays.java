package class9;

public class T32DArrays {
    public static void main(String[] args) {
        String [] [] names=
                {
                        {"bmw", "mercedes", "opel"},
                        {"chevrolet", "ram", "dodge"},
                        {"kia", "hyundai", "genesys"},
                        {"fiat", "alfa romeo", "ferrari"}

                };
        for (String[] row:names){
            for (String v:row){
                System.out.print(v+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+" ");

            }
            System.out.println();

        }
    }
}
