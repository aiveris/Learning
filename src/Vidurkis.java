import java.util.Scanner;
public class Vidurkis{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        int n;
        int x=1;
        int suma = 0;
        int vidurkis;
        int tarpinis;
        System.out.println("Iveskite kiek skaiciu: ");
        n = keyboard.nextInt();
        while (i < n) {
            System.out.println("Iveskite skaiciu Nr."+ x++);
            tarpinis = keyboard.nextInt();
            suma = suma + tarpinis;
            i++;
        }
        vidurkis = suma / n;
        System.out.printf("Ivestu sk vidurkis %s", vidurkis);
        //System.out.println("Ivestu sk vidurkis:"+vidurkis);

    }
}


