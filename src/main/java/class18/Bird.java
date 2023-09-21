package class18;

public class Bird {
    String name;
    String colour;
    String breed;
    int age;

    public Bird (String name, String colour, String breed, int age) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.age = age;
    }
    void printInfo(){
        System.out.println(name+" "+colour+" "+breed+" "+age);
    }
}
class sparrow extends Bird {
    public sparrow (String name, String colour, String breed, int age){
        super(name, colour, breed, age);
    }
}
class parrot extends Bird {
    public parrot (String name, String colour, String breed, int age) {
        super(name, colour, breed, age);
    }
}
class birdTester{
    public static void main(String[] args) {
        sparrow obj1 = new sparrow("Pizdyuk","brown","asian sparrow",4);
        obj1.printInfo();
        parrot obj2 = new parrot("Yashka","red and white","speaking parrot",5);
        obj2.printInfo();
    }
}