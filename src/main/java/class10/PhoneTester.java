package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphoneObj=new Phone();
        iphoneObj.brand="Iphone";
        iphoneObj.model="14 Pro";
        iphoneObj.system="IOS";
        System.out.println(iphoneObj.brand);
        System.out.println(iphoneObj.model);
        System.out.println(iphoneObj.system);

        iphoneObj.speed();
        iphoneObj.camera();
        iphoneObj.ecosystem();

        System.out.println("-----------------");

        Phone pixelObj=new Phone();
        pixelObj.brand="Pixel";
        pixelObj.model="7PRO";
        pixelObj.system="Android";

        System.out.println(pixelObj.brand);
        System.out.println(pixelObj.model);
        System.out.println(pixelObj.system);

        pixelObj.speed();
        pixelObj.camera();
        pixelObj.pixsys();
    }
}
