package class16;

public class Book {
    private String name;
    private String author;
    private int pages;

    private double price;

     public Book (String name,String author){
         this.name = name;
         this.author = author;
     }
     public Book (String name,String author,int pages,double price){
         this(name, author);
         this.pages = pages;
         this.price=price;
     }
     public void printInfo (){
         System.out.println("Book name is: "+ name);
         System.out.println("Book author: "+author);
         System.out.println("Number of pages: "+pages);
         System.out.println("Book price: "+price);
     }
}
