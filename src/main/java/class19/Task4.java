package class19;

public class Task4 {
    private void  print (){
        System.out.println("Java is good");
    }
    private void  print (String word){
        System.out.println("Java is "+word);
    }
    private void  print (String word, String text){
        System.out.println("Java is "+word+" but is "+text);
    }

    public static void main(String[] args) {
        Task4 t = new Task4();
        t.print();
        t.print("Hard");
        t.print("Hard","Funny");
    }
}
