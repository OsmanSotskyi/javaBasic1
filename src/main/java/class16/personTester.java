package class16;

public class personTester {
    public static void main(String[] args) {
        person p1 = new person("Osman",105,85,'M');
        p1.printInfo();

        person p2 = new person("Olga",105,85);
        p2.printInfo();

        person p3 = new person("oleg",105,85,'m',230000,"bold");
        p3.printInfo();
    }
}
