package class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String,Double>makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",22.0);
        makeUp.put("BlushOn",40.0);
        makeUp.put("Base",50.5);
        makeUp.put("Foundation",90.5);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",35.5);

        //makeUp.forEach((key,value)-> System.out.println(key+" "+value));  //Both keys and values will be printing
        //makeUp.forEach((key,value)-> System.out.println(key));   //Just Key will be printing
        //makeUp.forEach((key,value)-> System.out.println(value));   //Just Value will be printing

        //whenever you need more than one parameter you need to put parentheses
        // if we want to have more than one line of code we need to have curly brackets as well
        makeUp.forEach((key,value)-> {
            if (key.contains("a")) {
                System.out.println(value);
            }
        });
    }
}
