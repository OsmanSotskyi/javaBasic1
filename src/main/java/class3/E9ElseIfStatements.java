package class3;

public class E9ElseIfStatements {
    public static void main(String[] args) {
    String fruit="Apple";
    if (fruit.equals("mango")) {
        System.out.println("Price is 5$");
    } else if (fruit.equals("Orange")){
        System.out.println("Price is 4$");
    } else if (fruit.equals("Apple")) {
        System.out.println("Price is $1000");
    } else if (fruit.equals("Kiwi")) {
        System.out.println("Price is 6$");
    } else {
        System.out.println("This Fruit is not available right now");

    }
    }
}
