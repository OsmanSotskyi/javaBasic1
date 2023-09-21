package class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Tom";
        c.breed = "Russian";
        c.colour = "White";
        c.age = 8;
        c.attitude = true;
        c.printInfo();
        Dog d = new Dog();
        d.name = "Jacky";
        d.breed = "German";
        d.bark();
        d.printInfo();
        Animal a = new Animal();
        a.name = "Jim";
        a.colour = "Black";
        a.printInfo();
    }
}
