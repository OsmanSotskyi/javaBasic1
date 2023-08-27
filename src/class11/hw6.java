package class11;

public class hw6 {
    public static void main(String[] args) {

        String name ="Osman";
        String surname= "Sotskyi";

        name=name+surname;

        surname=name.substring(0,name.length()-surname.length());
        name=name.substring(surname.length());

        System.out.println(name);
        System.out.println(surname);
    }
}
