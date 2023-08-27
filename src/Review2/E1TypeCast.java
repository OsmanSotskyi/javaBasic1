package Review2;

public class E1TypeCast {
    public static void main(String[] args) {
        int number=(int)10.5;
        System.out.println(number);
        float number2=20.100f;
        double number3=number2;
        System.out.println(number3);

        //boolean bool=(boolean)12.5; error
        char c=(char)1;  // explicit
        System.out.println(c);

    }



}
