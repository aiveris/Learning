import java.util.Random;

public class Random2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number;
        for (int i=0; i<10; i++){
            number = 1+rnd.nextInt(6);
            System.out.println(number);
        }
    }
}
