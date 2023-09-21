package class15;

public class Task1 {
    private  String Family;

    public Task1 () {
        System.out.println("No family");
    }

    public Task1 (String tFamily) {
        Family = tFamily;
        System.out.println("Family ABC");
    }


    public static void main(String[] args) {
        Task1 ts1 =new Task1();
        Task1 ts2 = new Task1("abc");
    }





}
