package GroupExercise2;

abstract class Marks {
    abstract double getPercentage();

}

class StudentA extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    public StudentA(double subject1Marks, double subject2Marks, double subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }
    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks) / 3.0;
    }
}

class StudentB extends Marks {
    private double subject1Marks;
    private double subject2Marks;
    private double subject3Marks;
    private double subject4Marks;

    public StudentB(double subject1Marks, double subject2Marks, double subject3Marks, double subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }
    @Override
    double getPercentage() {
        return (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / 4.0;
    }
}
class Main {
    public static void main(String[] args) {

        StudentA studentA = new StudentA(85, 90, 78);
        System.out.println("Student A Average Percentage: " + studentA.getPercentage() + "%");

        StudentB studentB = new StudentB(78, 92, 88, 95);
        System.out.println("Student B Average Percentage: " + studentB.getPercentage() + "%");
    }
}
