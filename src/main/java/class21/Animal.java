package class21;

public abstract class Animal {
    String name;
    String breed;
    String color;

    abstract void speak ();
    abstract void sleep ();
    abstract void eat ();
}
class Dog extends Animal {
    void speak (){
        System.out.println("Wuff Wuff...");
    }
    void sleep (){
        System.out.println("Sleeping for last 10 hours.....");
    }
    void eat (){
        System.out.println("Eating bones....");
    }
}
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow Meow...");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleep for 12-16 hours");
    }

    @Override
    void eat() {
        System.out.println("Like to eat fish");
    }
}
