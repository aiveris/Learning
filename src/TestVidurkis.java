import java.util.Scanner;
public class TestVidurkis{
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        int i=0;
        int n;
        int x=1;
        int tarponis;
        int suma=0;
        int vidurkis;
        System.out.println("Kiek skaiciu: ");
        n=key.nextInt();
        while(i<n){
            System.out.println("Iveskite skaiciu Nr."+x++);
            tarponis=key.nextInt();
            suma=suma+tarponis;
            i++;

        }
            vidurkis=suma/n;
        System.out.println("Vidurkisyra: "+vidurkis);
    }
}