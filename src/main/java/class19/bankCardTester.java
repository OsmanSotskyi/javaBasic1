package class19;

public class bankCardTester {
    public static void main(String[] args) {
        bankCard bc = new bankCard(500);
        VisaCard vc = new VisaCard(500);
        AmeEX ax = new AmeEX(700);

        System.out.println(bc.calcInt());
        System.out.println(vc.calcInt());
        System.out.println(ax.calcInt());
    }
}
