package class15;

public class Car {
    private String make;
    private String model;
    private String colour;
    private double price;

    public Car (String cMake, String cModel, String cColour, double cPrice) {
        make = cMake;
        model = cModel;
        colour = cColour;
        price = cPrice;

    }
    void printInfo() {
        System.out.println(make+ " "+model+" "+colour+" "+price);
    }
    void setPrice (double cPrice) {
        price = cPrice;
    }

    double getPrice () {
        return price;
    }

}
