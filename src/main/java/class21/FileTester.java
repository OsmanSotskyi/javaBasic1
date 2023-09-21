package class21;

public class FileTester {
    public static void main(String[] args) {
        File [] arr = {new JavaFile("JavaFile.java",500),new WordFile("Word.doc",500),new PdfFile("PDF.pdf",500)};
        for (File f : arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
}
