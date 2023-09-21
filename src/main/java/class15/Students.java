package class15;

public class Students {
    private String name;

    private double marks1;
    private double marks2;
    private double marks3;

    Students (String sName, double sMarks1, double sMarks2, double sMarks3) {
        name=sName;
        marks1=sMarks1;
        marks2=sMarks2;
        marks3=sMarks3;
    }
    public void printAverage () {
        double avg = 0;
        avg = (marks1+marks2+marks3)/3;
        System.out.println(name+" "+avg);
    }
    public  void printName () {
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Students("Osman",84,43,56).printAverage();
        new Students("Jamel",43,54,89).printAverage();
    }


}
