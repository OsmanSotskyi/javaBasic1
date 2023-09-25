package class26;

import java.util.LinkedHashMap;

public class T1Building {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> building = new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"X");
        building.put(5,"Tesla");
        building.put(6,"Apple");
        building.put(7,"Riven");
        System.out.println(building);


        System.out.println("Building size is: "+building.size());
        System.out.println("Update 4th floor: "+building.replace(4,"OOO Galichina"));
        System.out.println("Company removed: "+building.remove(7));
        System.out.println(building);

    }
}
