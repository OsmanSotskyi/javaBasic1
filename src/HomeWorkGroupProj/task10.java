package HomeWorkGroupProj;

public class task10 {
    public static void main(String[] args) {
      String [] words={"Ball","Football","Golf","Basketball","Ball","Java"};

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])){
                    System.out.println("Duplicate word is "+words[i]);
                    break;
                }

            }

        }

    }
}
