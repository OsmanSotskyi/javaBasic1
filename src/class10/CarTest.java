package class10;

public class CarTest {
    public static void main(String[] args) {
        Car teslaObj=new Car();

        teslaObj.brand="Tesla";
        teslaObj.model="Model S";
        teslaObj.year=2017;
        teslaObj.batteryCop=75;

        System.out.println(teslaObj.brand);
        System.out.println(teslaObj.model);
        System.out.println(teslaObj.year);
        System.out.println("Battery capacity: "+teslaObj.batteryCop);

        //we are calling the bark method on lunasObj
        teslaObj.speed();
        teslaObj.fuel();
        teslaObj.battery();

    }
}


