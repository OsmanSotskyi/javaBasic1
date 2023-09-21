package class16;

public class person {
    private String name;
    private int age;
    private double weight;
    private char gender;
    private int salary;
    String hairColour;

    public person (String Name, int Age, double Weight, char Gender){
        this.name=Name;
        this.age=Age;
        this.weight=Weight;
        this.gender=Gender;
    }
    public person (String Name, int Age, double Weight, char Gender,int salary, String hairColour) {
        this.name = Name;
        this.age = Age;
        this.weight = Weight;
        this.gender = Gender;
        this.salary = salary;
        this.hairColour = hairColour;

    }
    public person (String Name, int Age, double Weight){
        this.name=Name;
        this.age=Age;
        this.weight=Weight;

    }


    public void printInfo () {
        System.out.println(name+" "+age+" "+weight+" "+gender+" "+salary+" "+hairColour);
    }

}
