import java.util.Random;

public class arrayBidiNum {
    public static void main(String[] args) {
        int array[][]=new int[3][3];  
        Random random = new Random();  
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                array [i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Matriz ["+i+","+j+"]= "+array[i][j]);
            }
        }
    }
}
