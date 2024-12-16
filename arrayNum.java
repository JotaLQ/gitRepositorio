 
import java.util.Random;
            
public class arrayNum {
    public static void main(String[] args) {
        int array [] = new int [6];
        Random random = new Random();
        for (int i = 0; i<6 ;i++){
            
            array[i] = random.nextInt(10);
        }

        for (int i = 0; i < 6; i++){
            System.out.println("vector [" +i+ "] = "+array[i]);
        }

    }
}
