package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Marta",4536457,1600000,"User123","Pass123","Cheking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Osman");
        System.out.println(b.getName());
    }
}
