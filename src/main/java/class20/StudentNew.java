package class20;

public class StudentNew {

  public void Beh1 () {
      System.out.println("They are smart");
  }
    public void Beh2 () {
        System.out.println("Teachers love them");
    }
    public void Beh3 () {
        System.out.println("They are funny");
    }
}
class SyntaxStudent extends StudentNew{
    public void Beh3 () {
        System.out.println("They are funny and more smarter than college students");
    }
}
class CollegeStudent extends StudentNew {
    public void Beh2 () {
        System.out.println("Teachers love them and give him home work a loot");
    }
}
class SchoolStudent extends StudentNew {

}


