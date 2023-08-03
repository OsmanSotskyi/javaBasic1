package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {
        double accounBalance=30000;
        if (accounBalance>28000){
            System.out.println("We ca afford a normal toyota");
            if (accounBalance>50000){
                System.out.println(" we can afford Luxury cars as well");
            }

        }else {
            System.out.println("we need to save more");
        }
    }
}
