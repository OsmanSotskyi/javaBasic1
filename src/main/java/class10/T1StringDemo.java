package class10;

public class T1StringDemo {
    public static void main(String[] args) {

        String username="Syntax";
        String password="passwordd";
        String confirmPassword="passwordd";

        if (username.isEmpty()||password.isEmpty()){
            System.out.println("User name cannot be Empty");
        }

        else if (password.length()<8) {
            System.out.println("Password is too short");
        } else if (password.contains(username)) {
            System.out.println("Password can not contain username");

        } else if (!password.equals(confirmPassword)) {
            System.out.println("password do not match");

        }else {
            System.out.println("Your username and password has ben created");
        }


    }
}
