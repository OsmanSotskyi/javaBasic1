package class13;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        SyntaxEmployee t1 = new SyntaxEmployee();
        t1.empID = "Os32M576";
        t1.salary = 120000;


        SyntaxEmployee t2 = new SyntaxEmployee();
        t2.empID = "ZarBek93";
        t2.salary = 110000;

        t1.printSum();
        t2.printSum();
    }
}
