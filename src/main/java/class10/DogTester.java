package class10;

public class DogTester {
    public static void main(String[] args) {
        //we are created an obj from the Dog class
        Dog lunaObj=new Dog();
        //assigning a value to name lunasObj
        lunaObj.name="Luna";
        lunaObj.gender='F';
        lunaObj.breed="Shiba";
        lunaObj.weight=10;
        lunaObj.age=25;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);

        //we are calling the bark method on lunasObj
        lunaObj.bark();
        lunaObj.eat();
        lunaObj.sleep();

    }
}
