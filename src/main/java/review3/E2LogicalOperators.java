package review3;

public class E2LogicalOperators {
    public static void main(String[] args) {
        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean milk=false;
        boolean vegetables=true;


        boolean isProtein=isEgg||isMeat||isFish;
        boolean isGooddiets=(isEgg||isMeat||isFish)&&milk&&vegetables;
        System.out.println(isGooddiets);
        System.out.println(isProtein);
    }
}
