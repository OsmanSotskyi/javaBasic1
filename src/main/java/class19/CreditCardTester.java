package class19;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.calcInt(6500);
        visa v= new visa();
        v.calcInt(5433);
        AX ax = new AX();
        ax.calcInt(100);
    }
}
