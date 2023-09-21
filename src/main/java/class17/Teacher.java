package class17;

public class Teacher {
    String name;
    String lastName;
    String subject;
    String id;

    public void  behaviour () {
        System.out.println("teach us");
    }
    public void behaviour2 () {
        System.out.println("checks our HW");
    }
    public void behaviour3 () {
        System.out.println("makes edit");
    }
    public void behaviour4 () {
        System.out.println("sleeping in class");
    }
}
class MathTeacher extends Teacher {
    String name = "Alina";

    int students=30;
    void printStudents (){
        System.out.println(name+students);
    }

}
class ChemistryTeacher extends MathTeacher {
    String action = "make a trouble";
    void printAction (){
        System.out.println(action);
    }
}
class PianoTeacher extends ChemistryTeacher {
    String play = "plays the piano";
    void printPlay (){
        System.out.println(play);
    }
}

class teacherTest {
    public static void main(String[] args) {
        MathTeacher mt = new MathTeacher();
        mt.printStudents();
        mt.behaviour4();
        ChemistryTeacher ct = new ChemistryTeacher();
        ct.printStudents();
        ct.behaviour2();
        PianoTeacher pt = new PianoTeacher();
        pt.printPlay();
    }
}