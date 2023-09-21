package class16;

public class Cat {
    private String name;
    private String breed;
    private String colour;
    private double weight;
    private int legs;

    public Cat (String name, String breed, String colour, double weight, int legs){
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.weight = weight;
        this.legs = legs;

    }
    public Cat (String name, String breed, String colour){
        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }
    public Cat (String colour, int legs){

        this.colour = colour;
        this.legs = legs;

    }
    public void printInfo () {
        System.out.println(name+" "+breed+" "+colour+" "+weight+" "+legs);
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("sharik","dvornyaga", "black",32,4);
        c1.printInfo();
    }

}
