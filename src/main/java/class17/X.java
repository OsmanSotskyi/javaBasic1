package class17;

public class X {
    String firstName;

    public void firstNamePrint (){
        System.out.println(firstName);
    }
}
class Y extends X {
    String lastName;
    public void lastNamePrint () {
        System.out.println(lastName);
    }
}

class Z extends Y {
    String nationality;
    public void  nationalityPrint () {
        System.out.println(firstName+" "+lastName+" "+nationality);
    }
}
