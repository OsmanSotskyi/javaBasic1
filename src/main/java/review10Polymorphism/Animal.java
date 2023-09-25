package review10Polymorphism;

public class Animal {
    void speak() {
        System.out.println("Animals speak");
    }
    void eat(){
        System.out.println("Animals eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woff Woff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat the bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat the fish");
    }
}
