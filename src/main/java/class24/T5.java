package class24;

import java.util.ArrayList;

public class T5 {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        for (int i = 2; i < 500; i+=2) {
                nums.add(i);
            }
        System.out.println(nums);
        /*for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%5==0){
                nums.remove(i);
            }
        }*/
        nums.removeIf(x->x%5==0);
        System.out.println(nums);
        }

    }

