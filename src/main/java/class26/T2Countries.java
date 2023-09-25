package class26;

import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */

public class T2Countries {
    public static void main(String[] args) {
        TreeMap<String,String> countries = new TreeMap<>();
        countries.put("UK","London");
        countries.put("US","Washington DC");
        countries.put("Ukraine","Kyiv");
        countries.put("Canada","Ottawa");
        countries.put("Germany","Berlin");

        countries.forEach((K,V)-> System.out.println(K+" "+V));
        System.out.println("*****************");
        countries.forEach((K,V)-> System.out.println(V));

        countries.forEach((K,V)->{
            if (K.length()>5 && V.toLowerCase().contains("a")){
                System.out.println(K+" "+V);
            }
        });


    }
}
