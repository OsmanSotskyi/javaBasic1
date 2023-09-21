package class20;

public class Computer {
public void OS () {
    System.out.println("Operation system Windows");
}
    public void Quality () {
        System.out.println("Quality depends on price");
    }
    public void Speed () {
        System.out.println("Speed work depends on system");
    }
    public void forWhat () {
        System.out.println("Good choice for gaming");
    }
}
class Apple extends Computer {
    public void OS () {
        System.out.println("Operation system MAC OS");
    }
    public void Quality () {
        System.out.println("Apple lap tops has very good quality");
    }
    public void Speed () {
        System.out.println("Because of system, mac lap tops work very fast");
    }
    public void forWhat () {
        System.out.println("Good choice for work and surfing");
    }
}
class Lenovo extends Computer {
    public void Quality () {
        System.out.println("Lenovo lap tops has a bad quality");
    }
    public void forWhat () {
        System.out.println("Good choice for gaming");
    }
}
class HP extends Computer {
    public void Speed () {
        System.out.println("Speed work good when it new");
    }
    public void Quality () {
        System.out.println("HP lap tops has good quality");
    }
}
class DELL extends Computer {

}