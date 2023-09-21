package class19;

public class Animal {
    private String name;
    private String colour;
    private int age;

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        int num = 5;
    }

    public void printInfo() {
        System.out.print(name+" "+colour+" "+age);
    }
}
class Dog extends Animal {
    int num =10;
    double weight;

    public Dog(String name, String colour, int age,double weight) {
        super(name, colour, age);
        this.weight=weight;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println(" "+weight);
    }

}
