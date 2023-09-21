package class12;

public class hw1 {
String hello (String language) {
    String program = "";
    if (language.equalsIgnoreCase("english")) {
        System.out.println("Hello");
    }else if (language.equalsIgnoreCase("ukrainian")) {
        System.out.println("Привіт");
    }else if (language.equalsIgnoreCase("german")) {
        System.out.println("Hallo");
    }else if (language.equalsIgnoreCase("Marathi")) {
        System.out.println("नमस्कार");
    } else if (language.equalsIgnoreCase("arabic")) {
        System.out.println("مرحبًا");
    }else if (language.equalsIgnoreCase("spain")) {
        System.out.println("Hola");
    }else {
        System.out.println("Sorry i don't know this language");
    }
    return program;
}

    public static void main(String[] args) {

    hw1 lan=new hw1();
        System.out.println(lan.hello("ukrainian"));



    }
}

