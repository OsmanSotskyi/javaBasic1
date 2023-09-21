package class20;

public class ComputerTester {
    public static void main(String[] args) {
        Computer [] arr = {new Apple(), new Lenovo(), new HP(), new DELL()};
        for (Computer c : arr) {
            c.OS();
            c.forWhat();
            c.Quality();
            c.Speed();
        }
    }
}
