package review10Polymorphism;

public class Car implements WashAble {
    public void drive(){
        System.out.println("driving......");
    }

    @Override
    public void wash() {
        System.out.println("you can take a car to carWash service");
    }
}
class Horse implements WashAble{
    @Override
    public void wash() {
        System.out.println("Horse can wash themSelves");
    }
}
