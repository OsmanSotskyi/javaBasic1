package class18;

public class Car {
    private String make;
    private String model;
    private double price;
    private String colour;

    public Car (String make, String model, double price, String colour) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }
    public Car (String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    public Car () {

    }
    public void printInfo () {
        System.out.println(make+" "+model+" "+price+" "+colour);
    }
}
class BMW extends Car {
    public BMW (String make, String model, double price, String colour) {
        // Calling the constructor from the parent class
        super();
    }
}
class Audi extends Car {
    boolean sunRoof;
    public Audi (String make, String model, double price, String colour, boolean sunRoof){
        this.sunRoof = sunRoof;
    }
}
