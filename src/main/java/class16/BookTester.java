package class16;

public class BookTester {
    public static void main(String[] args) {
        Book b1 = new Book("1984","George Orwell");
        Book b2 = new Book("1984","George Orwell",350,7.43);

        b1.printInfo();
        System.out.println("=================================");
        b2.printInfo();
    }
}
