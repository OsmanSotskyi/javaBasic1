package class21;

public abstract class File {

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    abstract void open ();

    void edit() {
        System.out.println("Then you can edit your file");
    }

    void close() {
        System.out.println("After editing just close file");
    }

}
class JavaFile extends File{

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("To open JavaFile we need notepad++");
    }

}
class WordFile extends File{

    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("For opening Word file you need to be installed Windows");
    }

}
class PdfFile extends File{

    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("You need to subscribe before open");
    }

}
