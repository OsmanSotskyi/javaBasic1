package class18;

public class userClass {
String name;
int mNumber;

    public userClass (String name, int mNumber) {
        this.name = name;
        this.mNumber = mNumber;
    }

}
class userInfo extends userClass {
    String address;
    public userInfo (String name, int mNumber, String address) {
        super(name,mNumber);
        this.address = address;
    }
    public void userDetails (){
        System.out.println(name+" "+mNumber+" "+address);
    }

}
class userTester {
    public static void main(String[] args) {
        userInfo ui = new userInfo("osman", 7959594,"Huddersfield");
        ui.userDetails();
    }
}
