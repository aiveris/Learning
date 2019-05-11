package Class;
import java.util.Scanner;


public class Class1 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
        System.out.println("Iveskite savo varda");
        String vardas = keyboard.nextLine();
        Class2 object = new Class2();
        object.zinute(vardas);

    }
}
