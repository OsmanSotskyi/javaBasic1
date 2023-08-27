package HomeWorkGroupProj;

public class task8 {
    public static void main(String[] args) {
        int [] numbers ={20,32,78,123,45,678,90};
        int max=numbers[0];
        int min=numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }

        }
        System.out.println(max);
        System.out.println(min);


    }
}
