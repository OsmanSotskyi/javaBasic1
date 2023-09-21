package class13;

public class studentTester {
    static int numberOfStudent;
    public static void main(String[] args) {
        student st1 = new student();
        st1.name = "Osman";
        st1.id = "ID323232";
        numberOfStudent ++;

        student st2 = new student();
        st2.name = "Kerim";
        st2.id = "ID323232";
        numberOfStudent ++;


        student st3 = new student();
        st3.name = "Zarema";
        st3.id = "ID323232";
        numberOfStudent ++;

        System.out.println("Total number of student is: "+numberOfStudent);



    }

}
