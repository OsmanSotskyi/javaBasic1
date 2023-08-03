package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter=true;
        String jacketColor="blac";

        if (winter==true){
            System.out.println("It is very cold");
            if (jacketColor.equals("blue")){
                System.out.println("Lets go with Red Nike shoes");
            } else {
                System.out.println("Lets go with blue ones");
            }

        }else {
            System.out.println(" No need to wear jackets");
        }
    }
}
