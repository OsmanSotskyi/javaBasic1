package class19;
// overload static method
public class Task3 {
    public static void print() {
        System.out.println("Java is great");
    }

    public static void print(String word) {
        System.out.println("Java is "+word);
    }

    public static void main(String[] args) {
        print();
        Task3.print("good");
    }
}
