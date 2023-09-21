package class20;

public class StudentNewTester {
    public static void main(String[] args) {
        StudentNew [] arr = {new CollegeStudent(),new SchoolStudent(), new SyntaxStudent()};
        for (StudentNew b:arr) {
            b.Beh1();
            b.Beh2();
            b.Beh3();
        }

    }
}
