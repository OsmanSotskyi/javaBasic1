package class25;

import java.util.LinkedList;

public class Cat {
    private String name;
    private String breed;
    private String colour;

    public Cat(String name, String breed, String colour) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }
    public void printInfo(){
        System.out.println(name+" "+breed+" "+colour);
    }

    public static void main(String[] args) {
        LinkedList<Cat> cats = new LinkedList<>();
        cats.add(new Cat("Murzik","Dvornyaga","multicolour"));
        cats.add(new Cat("Tuzik","Persian","peachColour"));
        cats.add(new Cat("Shizik","Bengal","orange"));
        /*for (Cat c:cats){
            c.printInfo();
        }*/
        cats.forEach(x->x.printInfo());

    }
}
