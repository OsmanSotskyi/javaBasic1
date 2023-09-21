package class17;

public class E {
    static String name;
    static void printF () {
        System.out.println("F");
    }
}
class F extends E {
    public static void main(String[] args) {
        E.printF();
        System.out.println(name);
    }
}
