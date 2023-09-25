package review10Polymorphism;

public class AnimalTester {
    public static void main(String[] args) {
        Animal [] arr = {new Animal(),new Dog(),new Cat()};
        for (Animal a : arr) {
            a.eat();
            a.speak();
        }
    }
}
