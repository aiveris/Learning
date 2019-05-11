import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random kauliukas = new Random();
        int skaicius;
        for(int i=0; i<10; i++){
        skaicius= 1+kauliukas.nextInt(6);
        System.out.println(skaicius);}
    }
}
