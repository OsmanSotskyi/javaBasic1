package class12;

public class T1 {

    void compare (int num1,int num2) {


        if (num1>num2){
            System.out.println(num1+" Larger than "+num2 );
        }else if (num2>num1){
            System.out.println(num2+" Larger than "+num1);
        }else {
            System.out.println(num1+" equals "+num2);
        }
    }

    void evenOdd(int num3){
        if (num3 % 2!=0){
            System.out.println(num3+" Odd number");
        }else {
            System.out.println(num3+" Even number");
        }
    }
}
