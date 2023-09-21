package class15;

public class Dog {
    //properties or fields
    private String name;
    private String breed;
    private String colour;
    private int age;

    //constructor
    public Dog (String dName, String dBreed, String dColour, int dAge) {
        name = dName;
        breed = dBreed;
        colour = dColour;
        age = dAge;
    }

    //methods
    public void  bark() {
        System.out.println("wuff wuff...");
    }
    public void printInfo (){
        System.out.println(name+" "+breed+" "+colour);
    }
}
